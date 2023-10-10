package Ta10_4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Operaciones {
    public static void realizarOperaciones() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Primer numero: ");
            double numero1 = scanner.nextDouble();
            System.out.print("Segundo numero: ");
            double numero2 = scanner.nextDouble();

            System.out.println("Suma: " + (numero1 + numero2));
            System.out.println("Resta: " + (numero1 - numero2));
            System.out.println("Multiplicacion: " + (numero1 * numero2));
            System.out.println("Division: " + (numero1 / numero2));
            System.out.println("Potencia: " + Math.pow(numero1, numero2));
            System.out.println("Raiz cuadrada: " + Math.sqrt(numero1));
            System.out.println("Raiz cubica: " + Math.cbrt(numero1));
        } catch (InputMismatchException e) {
            System.out.println("Entrada invalida. Debes ingresar numeros.");
        } finally {
            scanner.close();
        }
    }
}