package JAVA_240215.method;

public class Ex4 {
    /*
      배열에서 최소값과 최대값 찾기
      배열 내의 최소값과 최대값을 찾아 출력하는 메소드 findMinAndMax를 작성하세요.
     */

    public static void main(String[] args) {
        int [] numbers = {54, 32, 21, 6, 24, 3, 100, -5};
        findMinAndMax(numbers);

    }

    public static void findMinAndMax(int[] array){
        int min = array[0];
        int max = array[0];
        for (int i : array) {
            if(min > i) {
                min = i;
            }
            if(max < i) {
                max = i;
            }
        }
        System.out.println("최소값 : " + min + "  최대값 : " + max);
    }
}
