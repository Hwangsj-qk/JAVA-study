package java_240216.class0;

public class Class2 {
    public static void main(String[] args) {
        // 배열을 사용하게 될 경우, 사람이 데이터를 수정하거나 관리할 때 실수가 생길 수 있음
        String [] name = {"홍길동", "임꺽정", "이몽룡"};
        int[] scores = {80, 70,90};
        int[] ages = {30, 40, 20};

        // 학생정보 출력
        for (int i = 0; i < name.length; i++) {
            System.out.println("[학생 이름: " + name[i] + ", 점수: " + scores[i] + ", 나이: " + ages[i] + "]");

        }



    }
}
