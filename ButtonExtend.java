import java.awt.*;

public class ButtonExtend extends Frame {
    ButtonExtend() {
        Button b = new Button("Click me");

        add(b);
        b.setBounds(100, 100, 200, 300);
        setSize(100, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        ButtonExtend be = new ButtonExtend();
    }

}
