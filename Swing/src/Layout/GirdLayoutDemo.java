package Layout;

import javax.swing.*;
import java.awt.*;

public class GirdLayoutDemo {
    public GirdLayoutDemo() {
        JFrame frame = new JFrame("Gird Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button1 = new JButton("Click Me");
        JButton button2 = new JButton("Click Me");
        JButton button3 = new JButton("Click Me");
        JButton button4 = new JButton("Click Me");
        JButton button5 = new JButton("Click Me");
        JButton button6 = new JButton("Click Me");
        JButton button7 = new JButton("Click Me");
        JButton button8 = new JButton("Click Me");
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);

        GridLayout demo = new GridLayout(3,3);
        frame.setSize(300, 300);
        frame.setLayout(demo);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new GirdLayoutDemo();
    }
}
