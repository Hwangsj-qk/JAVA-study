package java_240422.jdbc.dao;

import java.util.List;

public interface MemberDAO {
    // 회원과 관련된 DB 연산 정의
    // 회원정보를 가지고 있는 MemberDTO를 넘겨받아서
    // DB 테이블에 추가, 조회, 수정, 삭제 등을 진행
    // 물음표 정보가 있으면 매개변수가 존재해야하고, 아니면 매개변수가 필요없다.

    // CRUD
    void  insert(MemberDTO member);         // C 데이터 생성
    MemberDTO getMemberById(String id);     // R 아이디(식별자)로 조회
    void update(MemberDTO member);          // U 데이터 수정
    void delete (String id);                // D 식별자로 삭제
    List<MemberDTO> getAllMembers();




}
