package Swing;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class EnventHandeling implements ActionListener {
    JFrame f;
    JTextField t1,t2;
    JButton btn;

    public EnventHandeling(){
        f=new JFrame();
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        btn= new JButton("Copy");
        f.add(t1); f.add(t2); f.add(btn);

        FlowLayout fl = new FlowLayout(FlowLayout.CENTER,20,10);
        f.setSize(250,350);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(fl);
        btn.addActionListener(this);




    }
    public void actionPerformed(ActionEvent ae)
    {
        String s = t1.getText();
        t2.setText(s);

    }

    public static void main(String[] args) {
        new EnventHandeling();
    }
}


