package lessons;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame {
    private JButton button = new JButton();

    public Gui() {
        super("1234");
        this.setBounds(100, 100, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
    }

}
