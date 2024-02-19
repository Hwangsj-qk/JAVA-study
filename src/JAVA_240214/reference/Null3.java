package JAVA_240214.reference;

public class Null3 {
    public static void main(String[] args) {
        DataWrapper dataWrapper = new DataWrapper();
        //dataWrapper.data = new Data();      // 인스턴스 내부의 참조필드를 초기화 생성
//      -> 초기화를 생성하면 주소가 떠서 런타임 에러가 뜨지는 않음 (null -> 0x400)

//         초기화 하지않은 필드에 접근 시 초기값이 대입된다.
        System.out.println(dataWrapper.count);  // 초기값: 0
        System.out.println(dataWrapper.data);   // 참조타입(Data)의 초기값: null

        // 컴파일러에서 작동하지 않지만, 런타임 단계에서 NPE가 발생
        System.out.println(dataWrapper.data.value1); // 에러(Cannot read field "value1" because "dataWrapper.data" is null)
//         = System.out.println(null.value1);
    }
}
