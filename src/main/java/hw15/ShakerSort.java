package hw15;

import java.util.Arrays;

public class ShakerSort {
    public static void main(String[] args) {
        int[] myArray = new int[]{5, 4, 2, 1, 3, 0, 9, 6, 8, 7};

        System.out.println("Before shake sort - " + Arrays.toString(myArray));
        shakerSort(myArray);
        System.out.println("After shake sort -  " + Arrays.toString(myArray));
    }

    private static void shakerSort(int[] myArray) {
        int left = 0;
        int right = myArray.length - 1;

        while (left < right) {
            for (int i = left; i < right; i++) {
                if (myArray[i] > myArray[i + 1]) {
                    swapNumber(myArray, i, i + 1);
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (myArray[i] < myArray[i - 1]) {
                    swapNumber(myArray, i, i - 1);
                }
            }
            left++;
        }
    }

    private static void swapNumber(int[] sortArray, int index1, int index2) {
        int temp = sortArray[index1];
        sortArray[index1] = sortArray[index2];
        sortArray[index2] = temp;
    }
}
