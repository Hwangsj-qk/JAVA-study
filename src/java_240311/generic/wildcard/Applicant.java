package java_240311.generic.wildcard;

public class Applicant <T> {
    public T kind;

    public Applicant (T kind) {
        this.kind = kind;
    }
}
