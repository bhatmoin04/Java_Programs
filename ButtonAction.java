import java.awt.*;
import java.awt.event.*;

public class ButtonAction extends Frame implements ActionListener {
    public ButtonAction() {
        Button b = new Button("Click");
        add(b);
        b.setBounds(100, 100, 200, 300);
        setSize(100, 100);
        setVisible(true);
        b.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("The Button was clicked ");
    }

    public static void main(String[] args) {
        ButtonAction ba = new ButtonAction();
    }
}
