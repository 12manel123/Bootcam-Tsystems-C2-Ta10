package Ta10_5;

import java.util.Scanner;

public class Ejecutable {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de contraseñas a generar: ");
        int numPasswords = scanner.nextInt();
        System.out.print("Ingrese la longitud de contraseñas: ");
        int longitud = scanner.nextInt();
        Password[] passwords = new Password[numPasswords];

        for (int i = 0; i < numPasswords; i++) {
            passwords[i] = new Password(longitud);
        }

        for (int i = 0; i < numPasswords; i++) {
            System.out.println("Contraseña " + (i + 1) + ": " + passwords[i].getContraseña() + " " + passwords[i].esFuerte());
        }
        scanner.close();
    }
}
