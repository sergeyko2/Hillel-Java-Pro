package hw13;

public class ValueCalculator {
    private double[] arraySource;
    private int halfSizeArray;
    private int sizeArray;

    public ValueCalculator(int sizeArray) {
        if (sizeArray < 1_000_000) {
            throw new IllegalArgumentException("Size of the array must be greater than a 1 million");
        }
        this.arraySource = new double[sizeArray];
        this.halfSizeArray = sizeArray / 2;
        this.sizeArray = sizeArray;
    }

    public void calculateMethod() throws InterruptedException {
        long start = System.currentTimeMillis();

        for (int i = 0; i < arraySource.length; i++) {
            arraySource[i] = 1;
        }

        double[] array1 = new double[halfSizeArray];
        double[] array2 = new double[halfSizeArray];
        System.arraycopy(arraySource, 0, array1, 0, halfSizeArray);
        System.arraycopy(arraySource, halfSizeArray, array2, 0, halfSizeArray);

        Thread thread1 = new Thread(()->calcExpression(array1));
        Thread thread2 = new Thread(()->calcExpression(array2));
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.arraycopy(array1, 0, arraySource, 0, halfSizeArray);
        System.arraycopy(array2, 0, arraySource, halfSizeArray, halfSizeArray);

        long end = System.currentTimeMillis();
        long differens = end - start;
        System.out.println("Time: " + differens + " ms");
    }

    private void calcExpression(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

}
