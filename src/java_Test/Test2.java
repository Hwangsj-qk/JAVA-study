package java_Test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력해주세요: ");
        int num1 = scanner.nextInt();
        System.out.print("두번째 숫자를 입력해주세요: ");
        int num2 = scanner.nextInt();

        System.out.print("연산자를 입력해주세요: ");
        String operator = scanner.next();
        
        double result = 0;
        
        switch (operator) {
            case "+" :
                result = num1 + num2;
                break;

            case "-" :
                result = num1 - num2;
                break;
                
            case "*" :
                result = num1 * num2;
                break;
                
            case "/" :
                result = num1 / num2;
                if(num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다. ");
                    return;
                }
        }
        System.out.println("결과: " + result);
                
    }
}
