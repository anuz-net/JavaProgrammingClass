package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Cadl implements KeyListener {
    JFrame frame = new JFrame();
    JTextField t1, t2, t3;
    JLabel l1, l2, l3;
    JButton btn;

    public Cadl() {
        frame.setTitle("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("First Number");
        l2 = new JLabel("Second Number");
        l3 = new JLabel("Result");

        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        t3.setEditable(false);  // User should not edit the result manually.

        btn = new JButton("Okey");

        // Layout and adding components
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(l3);
        frame.add(t3);
        frame.add(btn);

        frame.setSize(500, 400);
        frame.setVisible(true);

        // Add KeyListener to button (or better to the frame)
        btn.addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        int a, b;
        try {
            a = Integer.parseInt(t1.getText());
            b = Integer.parseInt(t2.getText());
        } catch (NumberFormatException e) {
            t3.setText("Invalid Number");
            return;
        }

        if (ke.getKeyChar() == 'a') {
            int c = a + b;
            t3.setText(String.valueOf(c));
        } else if (ke.getKeyChar() == 's') {
            int c = a - b;
            t3.setText(String.valueOf(c));
        } else {
            t3.setText("Wrong Key Entered");
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {}

    @Override
    public void keyReleased(KeyEvent ke) {}

    public static void main(String[] args) {
        new Cadl();
    }
}
