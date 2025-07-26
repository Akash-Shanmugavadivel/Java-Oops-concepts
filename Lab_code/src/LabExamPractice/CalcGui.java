package LabExamPractice;

import javax.swing.*;
import java.awt.*;

public class CalcGui extends JFrame {
    private JPanel panel1;
    private JLabel label1,label2,label3;
    private JTextField textField1,textField2;
    private JButton button1;
    CalcGui(){
        setTitle("CAL");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);;
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3,2));
        label1 = new JLabel("Number 1:");
        textField1 = new JTextField(20);
        label2 = new JLabel( "Number 2: ");
        textField2 = new JTextField(20);
        panel1.add(label1);
        panel1.add(textField1);
        panel1.add(label2);
        panel1.add(textField2);
        button1 = new JButton("Add");
        panel1.add(button1);
        label3=new JLabel("Result:");
        panel1.add(label3);
        add(panel1);
        button1.addActionListener(e -> {
            int num1=Integer.parseInt(textField1.getText());
            int num2=Integer.parseInt(textField2.getText());
            int result =num1+num2;
            label3.setText(String.valueOf(result));
        });
    }

    public static void main(String[] args) {
        new CalcGui().setVisible(true);
    }
}
