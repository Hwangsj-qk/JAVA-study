package java_240422.jdbc;

import java.sql.*;

public class Jdbc4 {
    // try-with-resources 구문으로 자원 정리하ㅣㄱ
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/scott";
        String user = "root";
        String password = "1234";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();       // 동적 SQL문
             ResultSet rs = stmt.executeQuery("SELECT * FROM emp ")) {

            while (rs.next()) {
                int eno = rs.getInt(1);// 첫번재 컬럼을 정수타입으로 반환
                String ename = rs.getString(2);     // 두번째 컬럼을 문자열 타입으로
                Date hiredate = rs.getDate("hireDate");
                System.out.println("사원번호: " + eno + ", 이름: " + ename + ", 입사일: " + hiredate);
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        // 5. 자원 종료
        // close 메서드 사용하지 않아도, try 구문이 끝나면 안전하게 종료함
    }
}
