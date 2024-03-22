package quiz_240322_5.q2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Quiz2 {
    public static void main(String[] args) {
        Random random = new Random();

        
        Set<Integer> lottoNumber= new HashSet<>();

        for (int i = 0; i < 6; i++) {
            lottoNumber.add(random.nextInt(45)+1);
        }
        System.out.println("로또 번호: " + lottoNumber);

    }



}
