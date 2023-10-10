package Ta10_1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Adivinar {
    private int numero;
    private int intentos;

    public Adivinar() {
        Random random = new Random();
        numero = random.nextInt(500) + 1;
        intentos = 0;
    }

    public void adivinar() {
        Scanner scanner = new Scanner(System.in);
        
        try {
            while (true) {
                System.out.print("Introduce un numero: ");
                int numeroUsuario = scanner.nextInt();
                intentos++;

                if (numeroUsuario == numero) {
                    System.out.println("¡Has acertado!");
                    System.out.println("Intentos: " + intentos);
                    break;
                } else if (numeroUsuario < numero) {
                    System.out.println("El numero es mayor.");
                } else {
                    System.out.println("El numero es menor.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada invalida. Debes ingresar un numero.");
        } finally {
            scanner.close();
        }
    }
}
