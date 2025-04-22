package Swing;

import javax.swing.*;

public class Demo {
    public Demo(){
        JFrame frame = new JFrame("Demo Program");
        frame.setSize(1000, 800);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        Munu bar
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("File");

        JMenuItem i1 = new JMenuItem("New");
        JMenuItem i2 = new JMenuItem("Open");
        JMenuItem i3 = new JMenuItem("Save");
        JMenuItem i4 = new JMenuItem("Exit");
        m1.add(i1);
        m1.add(i2);
        m1.add(i3);
        m1.add(i4);
        JMenu m2 = new JMenu("Edit");
        JMenuItem i5 = new JMenuItem("Update");
        JMenuItem i6 = new JMenuItem("Delete");
        JMenuItem i7 = new JMenuItem("Delete All");

//        m2.add(i6);
        m2.add(i5);
        m2.add(i7);
        i7.add(i6);



        mb.add(m1);
        mb.add(m2);
        JLabel l = new JLabel("Username");
        l.setBounds(10, 10, 100, 30);
        JTextField tf = new JTextField();
        tf.setBounds(120, 10, 100, 30);
        JButton btn = new JButton("Submit");
        btn.setBounds(120, 420, 100, 30);
        JLabel l1 = new JLabel("Password");
        l1.setBounds(10, 120, 100, 30);
        JPasswordField pf = new JPasswordField();
        pf.setBounds(120, 120, 100, 30);

//        Dorpdown menu

        JLabel l3 = new JLabel("Country");
        l3.setBounds(10, 60, 100, 30);
        String[] countries = {"Nepal", "India", "USA", "UK", "Canada"};
        JComboBox cb = new JComboBox (countries);
        cb.setBounds(120, 60, 100, 30);

//        Table
        JLabel l4 = new JLabel("Employee");
        l4.setBounds(10, 160, 100, 30);
        String col[] = {"ID", "Name", "Address"};
        String data[][] = {
                {"1", "Sashin", "Bharatpur"},
                {"2", "Muskan", "Gaindakot"},
                {"3", "Ashoka", "Gaindakot"},
                {"4", "Anuz", "Chanauli"}
        };
        JTable jt = new JTable (data,col);
//        jt.setBounds(10, 200, 300, 200);
        JScrollPane sp = new JScrollPane(jt);
        sp.setBounds(10, 200, 300, 90);





        frame.setJMenuBar(mb);
        frame.add(sp);
        frame.add(l4);
        frame.add(l1);
        frame.add(pf);
        frame.add(l);
        frame.add(tf);
        frame.add(btn);
        frame.add(l3);
        frame.add(cb);

    }

    public static void main(String[] args) {
        new Demo();
    }
}
