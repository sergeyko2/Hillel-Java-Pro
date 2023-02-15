package hw9.task1;

import java.util.*;

public class MainApp {

    private static final Random randomInt = new Random();

    public static void main(String[] args) {

        List<String> stringList = fillList();

        String sampleWord = "Firmware";
        System.out.println("1: Word '" + sampleWord + "' occurs " + countOccurance(stringList, sampleWord) + " times.");

        Integer[] arrayInt = fillArray(15);
        List<Integer> integerList = toList(arrayInt);
        System.out.println("2: Convert Array to List: " + integerList);

        System.out.println("3: Unique numbers: " + findUnique(integerList));

        System.out.println("4: Number of word repetitions:" + calcOccurance(stringList));
    }

    private static String calcOccurance(List<String> stringList) {
        HashMap<String, Integer> wordCount = new HashMap<>();
        StringBuilder result = new StringBuilder();
        stringList.forEach(word -> wordCount.merge(word, 1, Integer::sum));
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            result.append("\n\t").append(entry.getKey()).append(": ").append(entry.getValue());
        }
        return result.toString();
    }

    private static List<Integer> findUnique(List<Integer> myList) {
        List<Integer> resultList = new ArrayList<>();
        for (int number : myList) {
            if (!resultList.contains(number)) {
                resultList.add(number);
            }
        }
        return resultList;
    }

    private static List<Integer> toList(Integer[] arrayInt) {
        return Arrays.asList(arrayInt);
    }

    private static Integer[] fillArray(int sizeArray) {
        Integer[] arrayInt = new Integer[sizeArray];
        for (int i = 0; i < sizeArray; i++) arrayInt[i] = randomInt.nextInt(20);
        return arrayInt;
    }

    private static List<String> fillList() {
        return Arrays.asList(
                "Trigger",
                "Connection",
                "Dump",
                "Firmware",
                "System",
                "Firmware",
                "System",
                "System",
                "Boot",
                "System",
                "Firmware",
                "System",
                "System",
                "Boot",
                "Input",
                "Scan",
                "Offline",
                "Firmware",
                "Dump",
                "Connection");
    }

    private static long countOccurance(List<String> stringList, String sampleWord) {
        int count = 0;
        for (String word : stringList)
            if (word.equals(sampleWord)) count++;
        return count;
    }
}
