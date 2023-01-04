package hw6;

public class ArrayDataException extends Exception {

    public ArrayDataException(int line, int column) {
        super("This is not a number in a cell [" + line + "][" + column + "]");
    }
}
