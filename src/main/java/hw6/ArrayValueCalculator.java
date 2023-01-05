package hw6;

public class ArrayValueCalculator {

    public static void main(String[] args) {
        String[][] myArray = {
                {"25", "35", "-48", "47"},
                {"84", "37", "41", "14"},
                {"25", "-69", "24", "18"},
                {"84", "37", "25", "14"},
//                {"84", "37", "ss", "14"},
        };

        try {
            int sumAll = doCalc(myArray);
            System.out.println("The sum of all array elements: " + sumAll);
        }
        catch (ArraySizeException | ArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int doCalc(String[][] myArray) throws ArraySizeException, ArrayDataException {
        int sum = 0;
            for (int line = 0; line < myArray.length; line++)
                for (int column = 0; column < myArray[line].length; column ++) {
                    if (myArray.length != 4 || myArray[line].length != 4)
                        throw new ArraySizeException();
                    try {
                        sum += Integer.parseInt(myArray[line][column]);
                    }
                    catch (NumberFormatException e) {
                        throw new ArrayDataException(line, column);
                    }
                }
        return sum;
    }
}
