package Layout;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    public BorderLayoutDemo() {
        JFrame frame = new JFrame("Border Layout");
        JButton btn = new JButton("Click Me");
        JButton btn1 = new JButton("Click Me");
        JButton btn2 = new JButton("Click Me");
        JButton btn3 = new JButton("Click Me");
        JButton btn4 = new JButton("Click Me");
        JButton btn5 = new JButton("Click Me");

        frame.add(btn, BorderLayout.NORTH);
        frame.add(btn1, BorderLayout.WEST);
        frame.add(btn2, BorderLayout.EAST);
        frame.add(btn3, BorderLayout.SOUTH);
        frame.add(btn4, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new BorderLayoutDemo();

    }
}
