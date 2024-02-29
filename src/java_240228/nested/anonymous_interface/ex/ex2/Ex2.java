package java_240228.nested.anonymous_interface.ex.ex2;

public class Ex2 {
    public static void main(String[] args) {
        Button button = new Button();

        button.setListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("버튼이 클릭되었습니다!");
            }
        });
        button.touch();
    }
}
