package java_240422.jdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex3 {
        /*
    연습문제 : 사용자 정보 업데이트
    요구사항: 사용자로부터 userId, username, password, age, email을 입력받아 해당 userId를 가진 사용자의 정보를 업데이트하세요.

    사용자로부터 다음 정보를 입력받습니다:
    userId: 업데이트할 사용자 ID
    username: 새 사용자 이름
    password: 새 비밀번호
    age: 새 나이
    email: 새 이메일 주소
    입력받은 정보를 데이터베이스의 users 테이블에 업데이트합니다.
     */
        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String user = "root";
            String password = "1234";
            Scanner scanner = new Scanner(System.in);


            System.out.print("업데이터할 userId를 입력하세요: ");
            String userId = scanner.next();
            System.out.print("새로운 사용자 이름을 입력하세요: ");
            String userName = scanner.next();
            System.out.print("새로운 비밀번호를 입력하세요: ");
            String userPassword = scanner.next();
            System.out.print("새로운 나이를 입력하세요: ");
            String userAge= scanner.next();
            System.out.print("새로운 이메일 주소를 입력하세요: ");
            String userEmail = scanner.next();
//
//            try (Connection conn = DriverManager.getConnection(url, user, password)) {
//                // 쿼리문 Update 고정적인 부분.
//                StringBuilder query = new StringBuilder("UPDATE users SET");
//                // 콤마 SQL문법을 위한 플래그
//                boolean isfirst = true;
//
//                // 동적 쿼리문 변경
//                // "컬럼명1 = 값1, 컬럼명2 = 값2,..."
//                // "WHERE userId = ? ";
//
//                // 값을 입력받지 않았을 경우
//                if(!userName.isEmpty()) {
//                    // 값이 입력되었을 경우
//                    if(!isfirst) query.append(", ");
//                    query.append("password = ?");
//                }
//            }


        }
}
