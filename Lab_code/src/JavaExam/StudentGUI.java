package JavaExam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentGUI extends JFrame {
    private JTextField[][] markFields;  // 2D array to hold marks for two assessments and five subjects
    private JLabel[] averageLabels;     // Labels to display average for each subject
    private JLabel leastAverageLabel;   // Label to display the least average subject

    StudentGUI() {
        setTitle("Student Marks Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(6, 6));  // 6 rows, 6 columns (2 assessments + labels)
        markFields = new JTextField[2][5];  // 2 assessments, 5 subjects

        // Labels for subjects
        inputPanel.add(new JLabel("Subjects"));
        for (int i = 0; i < 5; i++) {
            inputPanel.add(new JLabel("Subject " + (i + 1)));
        }

        // Fields for Assessment 1
        inputPanel.add(new JLabel("Assessment 1"));
        for (int i = 0; i < 5; i++) {
            markFields[0][i] = new JTextField(5);
            inputPanel.add(markFields[0][i]);
        }

        // Fields for Assessment 2
        inputPanel.add(new JLabel("Assessment 2"));
        for (int i = 0; i < 5; i++) {
            markFields[1][i] = new JTextField(5);
            inputPanel.add(markFields[1][i]);
        }

        add(inputPanel, BorderLayout.NORTH);

        // Panel to display averages
        JPanel resultPanel = new JPanel(new GridLayout(6, 1));
        averageLabels = new JLabel[5];

        for (int i = 0; i < 5; i++) {
            averageLabels[i] = new JLabel("Average for Subject " + (i + 1) + ": ");
            resultPanel.add(averageLabels[i]);
        }

        // Label for least average
        leastAverageLabel = new JLabel("Least Average Subject: ");
        resultPanel.add(leastAverageLabel);

        add(resultPanel, BorderLayout.CENTER);

        // Button to calculate the average and least average
        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateAverages();
            }
        });

        add(calculateButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    // Method to calculate averages and display the least average subject
    private void calculateAverages() {
        double[] averages = new double[5];
        double leastAverage = Double.MAX_VALUE;
        int leastSubjectIndex = -1;

        // Calculate averages for each subject
        for (int i = 0; i < 5; i++) {
            try {
                int mark1 = Integer.parseInt(markFields[0][i].getText());
                int mark2 = Integer.parseInt(markFields[1][i].getText());
                averages[i] = (mark1 + mark2) / 2.0;
                averageLabels[i].setText("Average for Subject " + (i + 1) + ": " + averages[i]);

                // Check if it's the least average
                if (averages[i] < leastAverage) {
                    leastAverage = averages[i];
                    leastSubjectIndex = i;
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid marks for Subject " + (i + 1));
                return;
            }
        }

        // Display the least average subject
        if (leastSubjectIndex != -1) {
            leastAverageLabel.setText("Least Average Subject: Subject " + (leastSubjectIndex + 1));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StudentGUI());
    }
}
