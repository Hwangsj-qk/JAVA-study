package java_240422.jdbc;

import java.sql.*;

public class Jdbc3 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/scott";
        String user = "root";
        String password = "1234";

        // 연결 객체
        Connection conn = null;
        // 실행문 객체 (정적 SQL문)
        Statement stmt = null;
        // 결과문 객체(SQL 질의 결과를 저장하는 객체)
        ResultSet rs = null;

        try {
            // JDBC 드라이버에서 연결 객체 반환
            conn = DriverManager.getConnection(url, user, password);

            // SQL 쿼리 실행문 -> 정적 SQL문 -> 간단한 SQL문에서만 사용
            stmt = conn.createStatement();

            String sql = "SELECT * FROM emp";
            // 실행문을 실행 => 결과 셋(SQL 질의 결과 저장) 반환
            rs = stmt.executeQuery(sql);

            // rs.next() : 읽을 행의 정보가 있으면 true, 커서를 한 행 이동 후 없으면 false
            while (rs.next()) {
                // 결과 셋에서 ename 커럼의 데이터를 가져옴. (데이터타입이 일치해야 함)
                String ename = rs.getString("ename");
                System.out.println(ename);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            // 자원 정리(자원 정리는 역순으로 진행)
            try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
