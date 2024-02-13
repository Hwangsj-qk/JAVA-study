package JAVA_240213.loop;

import java.util.Scanner;

public class Ex4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = n-1; i < n && i > 0; i--) {  // 조건식: i >= 1로만 바꾸면 됨
            for (int j = 0 ; j < i; j++) {
                System.out.print("*");

            }
            System.out.println();





        }


    }
}
