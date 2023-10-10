package Ta10_2;

import Ta10_2.CustomException;

public class AppMain2 {
	public static void main(String[] args) {
        try {
            System.out.println("Mensaje mostrado por pantalla");
            throw new CustomException("Esto es un objeto Exception personalizado.");
        } catch (CustomException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Programa terminado.");
    }
}
