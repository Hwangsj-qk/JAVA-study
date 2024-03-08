package quiz_240308.q2;

public class Button implements OnClickListener{

    // 필드 생성
    OnClickListener listener;

    // 메서드


    public void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    @Override
    public void onClick() {
        System.out.println("버튼이 클릭되었습니다. ");
        listener.onClick();
    }

    public static void main(String[] args) {


    }
}
