package assistant;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tarkvaraarenduse assistent: Sisesta käsk:");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Assistendi töö lõppenud.");
                break;
            }
            executeCommand(input);
        }
    }
    private static void executeCommand(String command) {
        switch (command.toLowerCase()) {
            case "loo uus klass":
                System.out.println("Loon uue Java klassi...");
                // Siin võiks olla kood uue klassi loomise jaoks
                break;
            case "kontrolli vigu":
                System.out.println("Kontrollin koodi vigu...");
                // Siin võiks olla kood, mis kontrollib koodi vigu (nt lihtne syntax check)
                break;
            case "näita dokumentatsiooni":
                System.out.println("Kuvatakse dokumentatsioon...");
                // Siin võiks olla kood, mis kuvab mingi API või teeki puudutavat dokumentatsiooni
                break;
            default:
                System.out.println("Tundmatu käsk: " + command);
        }

    }
}
