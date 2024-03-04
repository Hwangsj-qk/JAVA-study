package java_240304.exception;

public class Try9 {
    public static void main(String[] args) {
        String[] array = {"100", "1oo", null, "300", "30o"};


        for (int i = 0; i <= array.length; i++) {   // 배열의 길이보다 하나 더 많음
            try {
                int length = array[i].length();
                int value = Integer.parseInt(array[i]);
                System.out.println(value);
                // 두 개 이상의 예외를 하나의 catch 블록으로 처리하고 싶을 때 에외 클래스를 "|" 으로 연결
            } catch (NumberFormatException | NullPointerException e) {
                System.out.println("데이터에 문제가 발생하여 변경 불가");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열이 알맞지 않습니다.");
//            } catch (NullPointerException e) {
//                System.out.println("데이터가 null이어서 길이 확인 불가");
            } catch (Exception e) {
                System.out.println("예외가 발생했습니다." + e.getMessage());
                // 일반적인 예외이므로 가장 마지막에 적어야 함.
            }
        }
    }
}
