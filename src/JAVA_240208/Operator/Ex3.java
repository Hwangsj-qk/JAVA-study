package JAVA_240208.Operator;

public class Ex3 {
    public static void main(String[] args) {
        //34자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어줄 때,
        // 1인당 몇 개를 가질 수 있고, 몇 개가 남는지를 구하는 코드입니다. 
        // 빈 칸을 채워주세요
        
        int pencils = 534;
        int students = 30;
        
        // 1명당 연필 갯수
        int pencilPerStudents = pencils/students;
        System.out.println("pencilPerStudents = " + pencilPerStudents);
        
        // 남는 연필 갯수
        int pencilLeft = pencils % students;
        System.out.println("pencilLeft = " + pencilLeft);
    }
}
