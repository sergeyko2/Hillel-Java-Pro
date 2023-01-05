package hw6;

public class ArrayValueCalculator {

    public static void main(String[] args) {
        String[][] myArray = {
//                {"25", "35", "-48", "47"},
//                {"84", "37", "41", "14"},
//                {"25", "-69", "24", "18"},
//                {"84", "37", "25", "14"},
                {"1", "XXX", "567", "1234"},
                {"45"},
                {"45", "998", "567", "1234"},
                {"45", "998", "567", "456"}
        };

        try {
            int sumAll = doCalc(myArray);
            System.out.println("The sum of all array elements: " + sumAll);
        }
        catch (ArraySizeException | ArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int doCalc(String[][] myArray) {
        int sum = 0;
        int arrayLength = myArray.length;
            for (int line = 0; line < arrayLength; line++)
                for (int column = 0; column < myArray[line].length; column ++) {
                    if (arrayLength != 4 || myArray[line].length != 4) {
                        throw new ArraySizeException();
                    }
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
