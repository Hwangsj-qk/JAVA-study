package java_240311.generic.wildcard;

public class Applicant <T> {
    public T kind;  // 여러 타입이 입력 될 것이기 때문에 T를 사용 (Student, Worker, Person 등)

    public Applicant (T kind) {
        this.kind = kind;
    }
}
