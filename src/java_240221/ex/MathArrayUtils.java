package java_240221.ex;

public class MathArrayUtils {
    static int[] array;


    static int sum(int[]array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        } return sum;
    }

    static double average(int[] array) {
        double sum = 0;
        for (int i : array) {
            sum += i;
        } double mean = sum / array.length;
          return mean;
    }

    static int max(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        } return max;
    }
    static int min(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min > array[i] ) {
                min = array[i];
            }
        }return min;
    }
}
