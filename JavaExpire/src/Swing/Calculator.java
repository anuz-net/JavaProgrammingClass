package Swing;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Calculator implements ActionListener {
    JFrame f = new JFrame();
    JButton add, subtract, multiply, divide;
    JTextField t1, t2;
    JLabel l1, l2;
    public Calculator(){

        f.setTitle("Abin Calculator ");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(100,500);
        f.setVisible(true);
        l1= new JLabel ("First Number");
        t1 = new JTextField(9);
        l2 = new JLabel ("Second Number");
        t2 = new JTextField(9);

        add = new JButton("Add");
        subtract = new JButton("Subtract");
        multiply = new JButton("Multiply");
        divide = new JButton("Divide");

        FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
        f.setLayout(fl);

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(add);
        f.add(subtract);
        f.add(multiply);
        f.add(divide);
        //------------
        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);



    }
    public void actionPerformed(ActionEvent e){
        Integer num1 = Integer.parseInt(t1.getText());
        Integer num2 = Integer.parseInt(t2.getText());
        if(e.getSource() == add){
            int result = num1 + num2;
            JOptionPane.showMessageDialog(f, "The sum is: " + result);
        }else if (e.getSource() == subtract){
            int result = num1 - num2;
            JOptionPane.showMessageDialog(f, "The subtraction is: " + result);

        } else if (e.getSource() == multiply) {
            int result = num1 * num2;
            JOptionPane.showMessageDialog(f, "The multiplication is: " + result);

        }
        else if (e.getSource() == divide){
            int result = num1 / num2;
            JOptionPane.showMessageDialog(f, "The division is: " + result);
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid Operation");

        }

    }

    public static void main(String[] args) {
        new Calculator();
    }

}
