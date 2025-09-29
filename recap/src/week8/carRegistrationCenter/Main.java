package week8.carRegistrationCenter;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

//        ArrayList<RegistrationPlate> finnish = new ArrayList<RegistrationPlate>();
//        finnish.add(reg1);
//        finnish.add(reg2);
//
//        RegistrationPlate registrationPlate = new RegistrationPlate("FI", "ABC-123");
//        if (!finnish.contains(registrationPlate)) {
//            finnish.add(reg1);
//        }
//        System.out.println("Finnish: " + finnish);
//        // if the equals method hasn't been overwritten, the same registration plate is repeated in the list
//
//        HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
//        owners.put(reg1, "Arto");
//        owners.put(reg3, "Jürgen");
//
//        System.out.println("owners:");
//        System.out.println(owners.get(new RegistrationPlate("FI", "ABC-123")));
//        System.out.println(owners.get(new RegistrationPlate("D", "B WQ-431")));
        // if the hashCode hasn't been overwritten, the owners are not found


//        VehicleRegister vehicleRegister = new VehicleRegister();
//        vehicleRegister.add(reg1,"Mann");
//        vehicleRegister.add(reg2,"Alo");
//        vehicleRegister.printOwners();
//        vehicleRegister.printRegistrationPlates();

        // NOTE: using the course's constructor order: new RegistrationPlate(country, regCode)
        RegistrationPlate fi1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate fi2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate de1 = new RegistrationPlate("D",  "B WQ-431");
        RegistrationPlate ee1 = new RegistrationPlate("EST","123-ABC");   // not added at first

        VehicleRegister register = new VehicleRegister();

        // ---- 9.2: add() ----
        System.out.println("-- add()");
        System.out.println(register.add(fi1, "Arto"));     // true
        System.out.println(register.add(fi2, "Arto"));     // true (same owner, different car)
        System.out.println(register.add(de1, "Jürgen"));   // true
        System.out.println(register.add(fi1, "Somebody")); // false (already owned)

        // ---- 9.2: get() ----
        System.out.println("\n-- get()");
        System.out.println(register.get(fi1));  // Arto
        System.out.println(register.get(de1));  // Jürgen
        System.out.println(register.get(ee1));  // null (not registered yet)

        // ---- 9.2: delete() ----
        System.out.println("\n-- delete()");
        System.out.println(register.delete(fi2)); // true
        System.out.println(register.delete(fi2)); // false (already deleted)
        System.out.println(register.delete(ee1)); // false (never existed)

        // ---- 9.3: printRegistrationPlates() & printOwners() ----
        System.out.println("\n-- printRegistrationPlates()");
        register.printRegistrationPlates(); // should list FI ABC-123 and D B WQ-431 (order not guaranteed)

        System.out.println("\n-- printOwners()");
        register.printOwners(); // should print Arto and Jürgen (each once)

        // Add another car for Jürgen to verify owner de-duplication in printOwners()
        System.out.println("\n-- add another car for Jürgen, then printOwners()");
        register.add(new RegistrationPlate("D", "B AB-999"), "Jürgen");
        register.printOwners(); // still just Arto and Jürgen

        // Optional: show that lookups by equal plate objects work (hashCode/equals test)
        System.out.println("\n-- equals/hashCode sanity check");
        System.out.println(register.get(new RegistrationPlate("FI", "ABC-123"))); // Arto
        System.out.println(register.get(new RegistrationPlate("D", "B WQ-431"))); // Jürgen
    }
}
