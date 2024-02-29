package java_240228.nested.anonymous_interface.ex.ex4;

public class CheckBox {
    OnSelectListener listener;

    void setOnSelectListener(OnSelectListener listener) {   // 익명 객체
        this.listener = listener;
    }

    void select() {
        listener.onSelect();
    }

    static interface OnSelectListener {
        void onSelect();
    }

}
