package week8.carRegistrationCenter;

import java.util.*;

public class VehicleRegister {

    private final Map<RegistrationPlate, String> owners = new HashMap<>();

    public boolean add(RegistrationPlate plate, String owner) {
        // returns true iff there was no previous owner
        return owners.putIfAbsent(plate, owner) == null;
    }

    public String get(RegistrationPlate plate) {
        return owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        return owners.remove(plate) != null;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate p : owners.keySet()) {
            System.out.println(p);
        }
    }

    public void printOwners() {

        Set<String> unique = new HashSet<>(owners.values());
        for (String s : unique) {
            System.out.println(s);
        }
    }
}
