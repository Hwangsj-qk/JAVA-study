package java_240221.ex;

public class MathUtility {
    int a;
    int b;
    static int max(int a, int b) {
        if (a > b) {
            return  a;
        }else {
            return b;
        }

    }
    static int min(int a, int b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }
    static int sum(int a, int b) {
        return a+ b;
    }

    static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;

        }
        return result;
    }

}
