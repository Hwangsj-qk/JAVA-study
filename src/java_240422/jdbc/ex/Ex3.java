package java_240422.jdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex3 {
        /*
    연습문제 : 사용자 정보 업데이트
    요구사항: 사용자로부터 userId, username, password, age, email을 입력받아
    해당 userId를 가진 사용자의 정보를 업데이트하세요.

    사용자로부터 다음 정보를 입력받습니다:
    userId: 업데이트할 사용자 ID
    username: 새 사용자 이름
    password: 새 비밀번호
    age: 새 나이
    email: 새 이메일 주소
    입력받은 정보를 데이터베이스의 users 테이블에 업데이트합니다.
     */
    /* 수정 출력예시
    사용자 ID를 입력하세요: summer
    새 사용자 이름을 입력하세요: 초여름
    새 비밀번호를 입력하세요: (사용자가 입력 없이 엔터)
    새 나이를 입력하세요: 25
    새 이메일 주소를 입력하세요: (사용자가 입력 없이 엔터)
    사용자 ID summer의 정보가 성공적으로 업데이트되었습니다.

    - 비밀번호와 이메일주소는 기존값을 유지
    */
        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String user = "root";
            String password = "1234";
            Scanner scanner = new Scanner(System.in);

            // 사용자 정보 입력받기(엔터를 받을 경우 패스)
            System.out.print("업데이터할 userId를 입력하세요: ");
            String userId = scanner.nextLine();
            System.out.print("새로운 사용자 이름을 입력하세요: ");
            String userName = scanner.nextLine();
            System.out.print("새로운 비밀번호를 입력하세요: ");
            String userPassword = scanner.nextLine();
            System.out.print("새로운 나이를 입력하세요: ");
            String userAge= scanner.nextLine();
            System.out.print("새로운 이메일 주소를 입력하세요: ");
            String userEmail = scanner.nextLine();

            /* next()와 nextLine()의 차이점
                - next()는 개행문자(ex. 줄바꿈)를 무시하고 입력을 받음
                - nextLine()은 한줄 단위로 입력받음
                    -> 현재 이 문제에서는 줄바꿈을 선택할 경우 넘어가야하므로 nextline()을 사용하는 것이 맞다.
             */

            try(Connection conn = DriverManager.getConnection(url, user, password)) {
                // 쿼리문 Update 고정적인 부분
                StringBuilder query = new StringBuilder("UPDATE users SET ");
                // 콤마 SQL문법을 위한 플래그
                boolean isFirst = true;

                // 동적으로 쿼리문 변경
                // "컬럼명1=값1, 컬럼명2=값2,..."
                // "WHERE userId = ?";
                // 값을 입력받지 않았을 경우 ""

                // 값이 입력되었을 경우
                if(!userName.isEmpty()) {
                    query.append("userName = ?");
                    isFirst = false;
                }

                // 값이 입력되었을 경우
                if(!userPassword.isEmpty()) {
                    if(!isFirst) {
                        query.append(", ");             // 첫번째 컬럼이 아닌 경우만 콤마 추가
                    }
                    query.append("password = ? ");
                    isFirst = false;                    // 첫번째 컬럼 사용됨
                }

                if(!userAge.isEmpty()) {
                    if(!isFirst) {
                        query.append(", ");             // 첫번째 컬럼이 아닌 경우만 콤마 추가
                    }
                    query.append("age = ? ");
                    isFirst = false;                    // 첫번째 컬럼 사용됨
                }

                if(!userEmail.isEmpty()) {
                    if(!isFirst) {
                        query.append(", ");             // 첫번째 컬럼이 아닌 경우만 콤마 추가
                    }
                    query.append("email = ? ");
                    isFirst = false;                    // 첫번째 컬럼 사용됨
                }

                // 최종 조건 쿼리문 (고정)
                query.append("WHERE userId = ?");

                // 쿼리문 확인
                System.out.println(query.toString());

                // SQL 문장 준비
                String sql = query.toString();
                PreparedStatement pstmt = conn.prepareStatement(sql);

                // 동적인 값(?)을 부여
                int index = 1;
                // 입력받은 값이 있을 경우만 인덱스를 사용하고 인덱스 번호 증가 (후위 연산자 사용)
                if(!userName.isEmpty()) pstmt.setString(index++, userName);
                if(!userPassword.isEmpty()) pstmt.setString(index++, userPassword);
                if(!userAge.isEmpty()) pstmt.setInt(index++, Integer.parseInt(userAge));
                if(!userEmail.isEmpty()) pstmt.setString(index++, userEmail);
                pstmt.setString(index++, userId);       // userId는 반드시 존재

                // SQL문 실행
                int rows = pstmt.executeUpdate();

                // 결과 로그 출력
                if(rows == 1) {
                    System.out.println(userId + "의 정보가 업데이트 되었습니다. ");
                } else {
                    System.out.println("오류 발생 : " + userId + "의 정보가 업데이트에 실패하였습니다. ");
                }
                pstmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
}
