package java_240228.nested.anonymous_interface.ex.ex7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex7 {
    /*
    버튼 클릭 이벤트 리스너 구현하기
    해당 코드의 비어있는 부분을 채워 실행했을 때 버튼을 클릭하면 "버튼이 클릭되었습니다."
    라는 메시지가 출력되도록 합니다.
    Hint : 버튼에 ActionListener 를 추가합니다.
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("익명 객체 예제");
        JButton button = new JButton("클릭");

        // 여기에 익명 클래스를 사용하여 버튼 클릭 이벤트 리스너를 추가하세요.
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("버튼이 클릭되었습니다.");
            }
        });


        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        frame.setVisible(true);
    }
}
