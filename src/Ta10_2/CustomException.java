package Ta10_2;

public class CustomException extends Exception {
    private static final long serialVersionUID = 1L; //Lo puse para evitar el warning: The serializable class CustomException does not declare a static final serialVersionUID field of type long
    public CustomException(String message) {//
        super(message);
    }
}