package Ta10_3;
import java.util.Random;
public class Aleatorio {
	public static void numeroAleatorio() {
        try {
            // Generar un número aleatorio entre 0 y 999
            Random random = new Random();
            int numero = random.nextInt(1000);
            System.out.println("El numero aleatorio es: " + numero);

            // Comprobar si el número aleatorio es par o impar
            if (numero % 2 == 0) {
                throw new ParException("Es par");
            } else {
                throw new ImparException("Es impar");
            }
        } catch (ParException e) {
            System.out.println(e.getMessage());
        } catch (ImparException e) {
            System.out.println(e.getMessage());
        }
    }
}
