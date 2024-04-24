package java_240422.jdbc.sqlinjection;

import java.sql.*;
import java.util.Scanner;

public class LoginPrepareStatement {
    // SQL 인젝션 공격에 안전한
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "1234";
        Scanner scanner = new Scanner(System.in);

        // 로그인
        System.out.println("[로그인]");
        // 정상적인 로그인 시도, 비정상적인 로그인 anything
        System.out.print("아이디를 입력하세요: ");
        String userId = scanner.nextLine();
        System.out.print("패스워드를 입력하세요: ");
        String userPassword = scanner.nextLine();

        String sql = "SELECT * FROM users WHERE userId = ? AND password = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)
        ){
            // SQL 인젝션 공격
            // SELECT * FROM users WHERE userId = 'anything' AND password = 'adcd' OR 'x' = 'x'

            // 비밀번호 입력란에 abcd' OR 'x'= 'x 을 입력해도 안전
            pstmt.setString(1, userId);
            pstmt.setString(2, userPassword);
            ResultSet rs = pstmt.executeQuery();

            // 결과 셋이 있을 경우 (ID, PASSWORD 일치할 경우) 로그인
            if(rs.next()) {
                System.out.println("성공적으로 로그인 되었습니다. ");
            } else {
                System.out.println("로그인에 실패하였습니다. ");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
