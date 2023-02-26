package hw18;

public class TwoMethodsException extends RuntimeException {
    public TwoMethodsException() {
        System.out.println("Methods Before or After have more than one instance");
    }
}
