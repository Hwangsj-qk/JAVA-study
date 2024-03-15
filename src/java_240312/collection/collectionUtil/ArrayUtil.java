package java_240312.collection.collectionUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayUtil {
    public static void main(String[] args) {
        // Arrays 배열을 다루기 위한 메서드를 제공하는 유틸리티 클래스
        int [] numbers = {9,4,5,6,7,0};

        // Arrays.toString() : 배열을 문자열로 변환
        System.out.println("numbers = " + Arrays.toString(numbers));

        // Arrays.sort() : 정렬
        Arrays.sort(numbers);
        System.out.println("정렬된 numbers =" + Arrays.toString(numbers));

        // Arrays.binarySearch() : 이진 탐색으로 요소의 index 찾기(정렬이 되지 않으면 -1 반환)
        int index = Arrays.binarySearch(numbers, 6);        // (이진탐색은 꼭! '정렬'이 된 상태여야 함)
        System.out.println("'6'의 index = " + index);        // 3

        // Arrays.fill(배열, 값) : 배열을 특정값으로 채움 -> 초기화할 때 유용
        Arrays.fill(numbers, 10);
        System.out.println("10으로 채워진 numbers = " + Arrays.toString(numbers));
        // 길이는 그대로 가지면서 모든 요소를 '10'으로 채움

        // Arrays.equals(배열1, 배열2) : 두 배열이 같은지 여부 반환 (boolean)
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,4};
        boolean isEqual = Arrays.equals(arr1, arr2);
        System.out.println("배열이 같은지 여부 isEqual = " + isEqual);
        
        // Arrays.deepEqual():  다차원 배열 비교
        String[][] data1 = {{"a", "b"}, {"c", "d"}};
        String[][] data2 = {{"a", "b"}, {"c", "d"}};
        boolean isEqual2 = Arrays.deepEquals(data1, data2);
        System.out.println("isEqual2 = " + isEqual2);       // true

        // Arrays.copyOf(원본배열, 복사할배열길이) : 배열 복사본 생성
        // 복사할 배열이 원본 배열보다 큰 경우: 남은 배열은 0으로 채워짐
        // 복사할 배열이 원본 배열보다 작은 경우: 배열이 짤림
        int[] originArr = {1,2,3,4,5};
        int[] copyArr = Arrays.copyOf(originArr, originArr.length);
        System.out.println("copyArr = " + Arrays.toString(copyArr));        // [1, 2, 3, 4, 5]

        // 배열의 요소 비교

        // 비교 규칙: 길이가 크면 큰 것, 길이가 같으면,
        // 배열의 요소 하나씩 비교해서 인덱스 0부터 차례대로 비교하여 큰 요소가 큰 것으로 간주
        int compared = Arrays.compare(originArr, copyArr);
        System.out.println("compared = " + compared);       // 같음으로 '0' 반환

        int[] array1 = {1,2,3};
        int[] array2 = {1,2,3};
        int[] array3 = {1,3,2};

        System.out.println(Arrays.compare(array1, array2));
        System.out.println(Arrays.compare(array1,array3));
        // array1과 array3은 다르므로 -1 반환 : array3[1] > array1[1] 이기 때문
        System.out.println(Arrays.compare(array3,array1));
        // array1과 array3은 다르므로 1 반환 : array3[1] < array1[1] 이기 때문

        // Arrays.copyOfRange(원본, 시작인덱스, 끝인덱스) : 부분적으로 배열의 일부를 복사
        int[] copyOfRangeA = Arrays.copyOfRange(originArr, 1, 3);
        System.out.println("배열의 부분 복사= " + Arrays.toString(copyOfRangeA));      // [2, 3]

        // Array.asList(요소1, 요소2, 요소3,...) : 배열의 고정 크기를 리스트로 반환
        String[] strArr = {"a", "b", "c"};
        List<String> list = Arrays.asList(strArr);
//        ArrayList<String> list2 = Arrays.asList(strArr); ArrayList와는 다름 -> 에러 발생
        // ArrayList 생성자 또는 addAll 메서드 등의 매개변수로 사용될 수 있음
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(strArr));
        // strArr를 매개변수로 받는다면 ArrayList로 받을 수 있음

        arrayList.addAll(Arrays.asList("d", "e", "f"));

        // 배열을 소스로 하는 Stream을 생성 => 스트림 API 사용 가능
        Stream<String> stream = Arrays.stream(strArr);
        stream.forEach(System.out :: println);      // 안에 있는 내부 요소를 출력


    }
}
