package java_240228.nested.anonymous_interface.ex.ex2;

import java_240228.nested.anonymous_interface.ex.ex2.OnClickListener;

import javax.swing.*;

public class Button extends JFrame {

    private OnClickListener listener;

    public void setListener(OnClickListener listener) {
        this.listener = listener;
    }

    public void touch() {
        if(listener == null) {      // NPE 예방하기 위해
            return;
        }
        listener.onClick();
    }
}
