package java_240422.jdbc.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TransactionEx {
    // 트랜잭션 처리 : 작업의 최소단위, All or Nothing. 모두 성공하거나 모두 실패해야 함
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/scott";
        String dbuser = "root";
        String dbpassword = "1234";

        Connection conn = null;

        try {
            DriverManager.getConnection(url, dbuser, dbpassword);

            // 연결 객체에서 자동 커밋 끄기
            conn.setAutoCommit(false);

            // 트랜잭션 시작

            // 1. 출금

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
