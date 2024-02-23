package java_Test;

public class MathUtility {


    public static int max(int a, int b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }
    public static int min(int a, int b) {
        if (a< b) {
           return a;
        } else {
            return b;
        }
    }
    public static int sum (int a, int b) {
        return a + b;
    }
    public static int factorial(int n) {
        int result =1;
        for (int i = n; i >= 1 ; i--) {
            result *= i;

        }return result;
    }
}
