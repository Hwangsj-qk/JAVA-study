package java_Test;

public class Test4 {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };

        int sum = 0;

        for (int[] num : numbers) {
            for (int i : num) {
                sum += i;
            }
        }
        System.out.println("합계 = " + sum);
    }
}
