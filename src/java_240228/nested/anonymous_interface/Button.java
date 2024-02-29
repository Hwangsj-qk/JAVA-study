package java_240228.nested.anonymous_interface;

public class Button {
    // 중첩 인터페이스
    static interface OnClickListener{
        void onClick();
    }

    // 필드
    OnClickListener onClickListener;

    // 필드 설정자(Setter): 매개변수로 인터페이스 구현 객체를 입력받음
    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    // 메서드
    void touch() {
        onClickListener.onClick();
    }
}
