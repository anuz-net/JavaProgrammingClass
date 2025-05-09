package lms;

import javax.swing.JFrame;

public class Main {
    
    public static void main(String[] args) {
        
    JFrame frame = new JFrame("Login");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 500);
    frame.add(new NewJPanel());  // loads your login form
    frame.setLocationRelativeTo(null);  // center on screen
    frame.setVisible(true);
    
    }
}
