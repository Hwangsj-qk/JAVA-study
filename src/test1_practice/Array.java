package test1_practice;

public class Array {
    // array - ex4

    public static void main(String[] args) {
        int [][] numbers = {
                {1, 2, 3, 4},
                {5,6,7,8}
        };
        int sum = 0;

        for (int[] number : numbers) {
            for (int i : number) {
                sum += i;
            }
            System.out.println("합계: " + sum);

        }

    }
}
