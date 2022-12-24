package hw6;

public class ArrayValueCalculator {

    public static void main(String[] args) {
        String[][] myArray = {
                {"25", "35", "-48", "47"},
                {"84", "37", "41", "14"},
                {"25", "-69", "24", "18"},
                {"84", "37", "41", "14"}
        };

       System.out.println("The sum of all array elements: " + doCalc(myArray));
    }

    private static int doCalc(String[][] myArray) {
        int sum = 0;
        for (String[] row:myArray) {
            for (String element:row) {
                sum += Integer.parseInt(element);
            }
        }
        return sum;

    }

}
