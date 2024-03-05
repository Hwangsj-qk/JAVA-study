package java_240305.library.lang;

import java.util.Arrays;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] array = {1, 2, 3, 4};
        ShallowCopy original = new ShallowCopy(array);          // 원본
        ShallowCopy clone = (ShallowCopy) original.clone();     // 복제본

        System.out.println("=====얕은 복사=====");
        // 변경 전
        for (int i : original.array) {
            System.out.print( i + " ");
        }
        for (int i : clone.array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("==================");

        // 복제한 객체의 배열(참조 필드)의 일부 요소를 변경 => 복제본 뿐만 아니라 원본까지 모두 바뀜
        // 메모리 구조 때문 (얕은 복사의 한계)
        clone.array[3] = 10;    // 4(array 3번지) -> 10

        // 변경 후
        for (int i : original.array) {
            System.out.print(i + " ");
        }
        for (int i : clone.array) {
            System.out.print(i + " ");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("=====깊은 복사=====");

        DeepCopy originalDeep = new DeepCopy(array);
        DeepCopy cloneDeep = (DeepCopy) originalDeep.clone();   // 다운 캐스팅

        // 변경전
        for (int i : originalDeep.array) {
            System.out.print( i + " ");
        }
        for (int i : cloneDeep.array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("==================");


        cloneDeep.array[3] = 33;
        // 복사본에만 영향. (깊은 복사)

        // 변경 후
        for (int i : originalDeep.array) {
            System.out.print(i + " ");
        }
        for (int i : cloneDeep.array) {
            System.out.print(i + " ");
        }


        System.out.println("\n=====2차원 배열변경=====");
        System.out.println(Arrays.deepToString(originalDeep.deepArray));
        System.out.println(Arrays.deepToString(cloneDeep.deepArray));

        originalDeep.deepArray[0][0] = 9;

        // 배열 차원마다 복제하지 않으면 고차원 배열 요소가 함께 변경.
        //clone시 내부까지 진입하여 복제해야함
        System.out.println("=====변경 후=====");

        System.out.println(Arrays.deepToString(originalDeep.deepArray));
        System.out.println(Arrays.deepToString(cloneDeep.deepArray));

        // 깊은 복사는 원본이 훼손되지 않도록 주의해야 함.
        // 나중에 선생님 파일보고 한 번 다시 하기
    }


}
