package JavaExam;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class addition extends JFrame implements ActionListener {
    JTextField a, b, sum;
    JButton add;
    JLabel al, bl, suml;

    addition() {
        al = new JLabel("a");
        bl = new JLabel("b");
        a = new JTextField(10);
        b = new JTextField(20);
        suml = new JLabel("sum");
        sum = new JTextField(30);
        add = new JButton("ADD");
        add(al);
        add(a);
        add(bl);
        add(b);
        add(suml);
        add(sum);
        add(add);
        setLayout(new FlowLayout());
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.GREEN);
        add.addActionListener(this);
        pack();
    }

    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(a.getText());
        int num2 = Integer.parseInt(b.getText());
        int totalSum = num1 + num2;
        sum.setText(Integer.toString(totalSum));
    }
}