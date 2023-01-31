package hw15;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] myArray = new int[]{5, 4, 2, 1, 3, 0, 9, 6, 8, 7};

        System.out.println("Before quick sort - " + Arrays.toString(myArray));
        quickSort(myArray, 0, myArray.length - 1);
        System.out.println("After quick sort -  " + Arrays.toString(myArray));

    }

    private static void quickSort(int[] sortArray, int leftIndex, int rightIndex) {
        if (leftIndex >= rightIndex) return;
        int partition = partition(sortArray, leftIndex, rightIndex);
        quickSort(sortArray, leftIndex, partition - 1);
        quickSort(sortArray, partition + 1, rightIndex);
    }

    private static int partition(int[] sortArray, int leftIndex, int rightIndex) {
        int pivot = sortArray[rightIndex];
        int i = leftIndex - 1;
        int j = leftIndex;
        while (j < rightIndex) {
            if (sortArray[j] <= pivot) {
                i++;
                swapNumber(sortArray, i, j);
            }
            j++;
        }
        i++;
        swapNumber(sortArray, i, rightIndex);
        return i;
    }

    private static void swapNumber(int[] sortArray, int leftIndex, int rightIndex) {
        int temp = sortArray[leftIndex];
        sortArray[leftIndex] = sortArray[rightIndex];
        sortArray[rightIndex] = temp;
    }
}
