package Ta10_5;

import java.util.Scanner;

public class Ejecutable {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de contrase�as a generar: ");
        int numPasswords = scanner.nextInt();
        System.out.print("Ingrese la longitud de contrase�as: ");
        int longitud = scanner.nextInt();
        Password[] passwords = new Password[numPasswords];

        for (int i = 0; i < numPasswords; i++) {
            passwords[i] = new Password(longitud);
        }

        for (int i = 0; i < numPasswords; i++) {
            System.out.println("Contrase�a " + (i + 1) + ": " + passwords[i].getContrase�a() + " " + passwords[i].esFuerte());
        }
        scanner.close();
    }
}
