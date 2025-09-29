package week8.carRegistrationCenter;

import java.util.*;

public class VehicleRegister {

    private final Map<RegistrationPlate, String> owners = new HashMap<>();

    public boolean add(RegistrationPlate plate, String owner) {
        List<RegistrationPlate> plates = new ArrayList<>(owners.keySet());
        if (plates.contains(plate)) {
            return false;
        } else owners.put(plate, owner);
        return true;
    }

    public String get(RegistrationPlate plate) {
        return owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            owners.remove(plate);
            return true;
        } else
            return false;
    }

    public void printRegistrationPlates() {
        List<RegistrationPlate> plates = new ArrayList<>(owners.keySet());
        for (RegistrationPlate p : plates) {
            System.out.println(p);
        }
    }

    public void printOwners() {
        List<String> ownerNames = new ArrayList<>(owners.values());
        Set<String> unique = new HashSet<>(ownerNames);
        for (String s : unique) {
            System.out.println(s);
        }
    }
}
