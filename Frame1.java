import java.awt.*;

public class Frame1 {
    public static void main(String[] args) {
        Frame f = new Frame();
        Label l = new Label("Java");
        f.add(l);
        f.setVisible(true);
        f.setSize(400, 400);
    }
}