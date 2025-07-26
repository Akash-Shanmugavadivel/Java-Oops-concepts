package GuiSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz extends JFrame implements ActionListener {
    private JTextField q1;
    private JTextArea q2;
    private JRadioButton[] q3;
    private JCheckBox[] q4;
    private JComboBox<String> q5;
    private JButton submit;
    private int score = 0;

    public Quiz() {
        setTitle("Java Quiz");
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Initialize components
        q1 = new JTextField(20);
        q2 = new JTextArea(5, 20);
        q3 = new JRadioButton[]{
                new JRadioButton("Encapsulation"),
                new JRadioButton("Inheritance"),
                new JRadioButton("Polymorphism"),
                new JRadioButton("Abstraction")
        };
        q4 = new JCheckBox[]{
                new JCheckBox("public"),
                new JCheckBox("private"),
                new JCheckBox("protected"),
                new JCheckBox("No Modifier")
        };

        String[] options = {"class", "static", "this", "new"};
        q5 = new JComboBox<>(options);
        submit = new JButton("Submit");

        // Set layout for the JFrame
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 15, 15, 15);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Add question 1
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("What is the keyword used to inherit a class in Java?"), gbc);
        gbc.gridx = 1;
        add(q1, gbc);

        // Add question 2
        gbc.gridx = 0;
        gbc.gridy++;
        add(new JLabel("What is meant by Access Modifier in Java?"), gbc);
        gbc.gridx = 1;
        add(q2, gbc);

        // Add question 3 (Radio Buttons)
        gbc.gridx = 0;
        gbc.gridy++;
        add(new JLabel("Data hiding is done in:"), gbc);
        gbc.gridx = 1;
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(1, q3.length));
        ButtonGroup bg = new ButtonGroup();  // Grouping the radio buttons
        for (JRadioButton op : q3) {
            bg.add(op);  // Ensure only one option can be selected
            radioPanel.add(op);
        }
        add(radioPanel, gbc);

        // Add question 4 (Checkboxes)
        gbc.gridx = 0;
        gbc.gridy++;
        add(new JLabel("Select Access Modifiers:"), gbc);
        gbc.gridx = 1;
        JPanel checkboxPanel = new JPanel();
        checkboxPanel.setLayout(new GridLayout(1, q4.length));
        for (JCheckBox op : q4) {
            checkboxPanel.add(op);
        }
        add(checkboxPanel, gbc);

        // Add question 5 (ComboBox)
        gbc.gridx = 0;
        gbc.gridy++;
        add(new JLabel("Select a Java keyword:"), gbc);
        gbc.gridx = 1;
        add(q5, gbc);

        // Add submit button
        gbc.gridx = 1;
        gbc.gridy++;
        add(submit, gbc);

        // Register action listener for submit button
        submit.addActionListener(this);

        // Set visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        score = 0;  // Reset score for each submission

        // Question 1
        String q1_ans = q1.getText();
        if (q1_ans.equalsIgnoreCase("extends")) {
            score += 1;
        }

        // Question 2
        String q2_ans = q2.getText();
        if (q2_ans.toLowerCase().contains("access control") || q2_ans.toLowerCase().contains("visibility")) {
            score += 2;
        }

        // Question 3 (Radio Buttons)
        for (JRadioButton option : q3) {
            if (option.isSelected() && option.getText().equals("Encapsulation")) {
                score += 1;
                break;
            }
        }

        // Question 4 (Checkboxes)
        int checkScore = 0;
        if (q4[0].isSelected()) checkScore++;  // public
        if (q4[1].isSelected()) checkScore++;  // private
        if (q4[2].isSelected()) checkScore++;  // protected
        if (q4[3].isSelected()) checkScore--;  // No Modifier (incorrect)
        score += checkScore;

        // Question 5 (ComboBox)
        String q5_ans = (String) q5.getSelectedItem();
        if (q5_ans.equals("new")) {
            score += 1;
        }

        // Show final score
        String message = String.format("Your Total Score is %d/8", score);
        JOptionPane.showMessageDialog(Quiz.this, message, "Final Score", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new Quiz();
    }
}
