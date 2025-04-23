package Expi;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class Pra {
    public Pra() throws FontFormatException {
        JFrame frame = new JFrame();
        frame.setTitle("Login Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("User Login");
        label.setFont(new Font("Poppins", "Sans-Serif", Font.BOLD, 20));


        frame.add(label);

        frame.setSize(500, 500);
        frame.setVisible(true);
        FlowLayout fL = new FlowLayout(FlowLayout.CENTER);
        frame.setLayout(fL);






    }

    public static void main(String[] args) {
        new Pra();
    }
}