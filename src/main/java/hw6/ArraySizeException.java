package hw6;

public class ArraySizeException extends RuntimeException {

    public ArraySizeException() {
        super("Array has the wrong size");
    }
}
