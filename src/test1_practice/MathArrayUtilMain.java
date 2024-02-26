package test1_practice;

public class MathArrayUtilMain {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        System.out.println("sum=" + MathArrayUtil.sum(values));
        System.out.println("average=" + MathArrayUtil.average(values));
        System.out.println("min=" + MathArrayUtil.min(values));
        System.out.println("max=" + MathArrayUtil.max(values));
    }
}
