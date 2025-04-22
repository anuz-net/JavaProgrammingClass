package Layout;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {
    public FlowLayoutDemo() {
        JFrame f = new JFrame();
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");
        JButton b6 = new JButton("Button 6");
        JButton b7 = new JButton("Button 7");
        JButton b8 = new JButton("Button 8");

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);

        FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
        f.setSize(400, 400);
        f.setVisible(true);
        f.setLayout(fl);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        FlowLayoutDemo f = new FlowLayoutDemo();
    }
}
