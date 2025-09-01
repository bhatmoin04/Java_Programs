import java.awt.*;

public class FirstButton {
    public FirstButton() {
        Frame f = new Frame();
        Button b = new Button("Click me ");
        b.setBounds(100, 100, 200, 200);
        f.add(b);
        f.setSize(100, 100);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        FirstButton fb = new FirstButton();
    }
}
