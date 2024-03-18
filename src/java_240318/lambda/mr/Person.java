package java_240318.lambda.mr;

import java.util.function.BinaryOperator;

public class Person {
    public void action(BinaryOperator<Integer> binaryOperator) {
        Object result = binaryOperator.apply(10, 4);
        System.out.println("result = " + result);

    }
}
