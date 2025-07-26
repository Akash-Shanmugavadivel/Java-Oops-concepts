package LabExamPractice;

import javax.swing.*;
import java.awt.*;

public class RegisterPage extends JFrame {
    private JTextField nameField, regnoField, mailField;
    private JLabel nameLabel, regnoLabel, mailLabel, passLabel, outputLabel;
    private JButton registerButton, resetButton;
    private JRadioButton[] rButtons;
    private JComboBox<String> comboBox;
    private JCheckBox agreeCheckBox;
    private JList<String> list;
    private JPanel panel;
    private JPasswordField passwordField;

    RegisterPage() {
        // Frame settings
        setTitle("Register");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel initialization with GridBagLayout
        panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();


        // Name field
        nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(nameLabel, gbc);
        gbc.gridx = 1;
        panel.add(nameField, gbc);

        // Register number field
        regnoLabel = new JLabel("Register No:");
        regnoField = new JTextField(20);
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(regnoLabel, gbc);
        gbc.gridx = 1;
        panel.add(regnoField, gbc);

        // Email field
        mailLabel = new JLabel("Mail:");
        mailField = new JTextField(20);
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(mailLabel, gbc);
        gbc.gridx = 1;
        panel.add(mailField, gbc);

        // Password field
        passLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(passLabel, gbc);
        gbc.gridx = 1;
        panel.add(passwordField, gbc);

        // Radio buttons
        rButtons = new JRadioButton[2];
        rButtons[0] = new JRadioButton("Batch1");
        rButtons[1] = new JRadioButton("Batch2");
        ButtonGroup bg = new ButtonGroup();
        bg.add(rButtons[0]);
        bg.add(rButtons[1]);
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(rButtons[0], gbc);
        gbc.gridx = 1;
        panel.add(rButtons[1], gbc);

        // Combo box for department
        String[] departments = {"CT", "IT", "ECE", "EIE", "PT"};
        comboBox = new JComboBox<>(departments);
        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(new JLabel("Department:"), gbc);
        gbc.gridx = 1;
        panel.add(comboBox, gbc);

        // List
        list = new JList<>(departments);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(new JLabel("Select Dept (List):"), gbc);
        gbc.gridx = 1;
        panel.add(new JScrollPane(list), gbc);

        // Checkbox for agreement
        agreeCheckBox = new JCheckBox("Do you agree?");
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        panel.add(agreeCheckBox, gbc);

        // Buttons
        registerButton = new JButton("Register");
        resetButton = new JButton("Reset");
        gbc.gridy = 8;
        gbc.gridwidth = 1;
        panel.add(registerButton, gbc);
        gbc.gridx = 1;
        panel.add(resetButton, gbc);

        // Output label
        outputLabel = new JLabel();
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 2;
        panel.add(outputLabel, gbc);

        // Add panel to frame
        add(panel);

        // Button action listeners
        registerButton.addActionListener(e -> handleRegister());
        resetButton.addActionListener(e -> reset());
    }

    private void handleRegister() {
        String name = nameField.getText().trim();
        String regNo = regnoField.getText().trim();
        String email = mailField.getText().trim();
        boolean isAgreed = agreeCheckBox.isSelected();
        String department = (String) comboBox.getSelectedItem();
        String selectedListDept = list.getSelectedValue();
        String batch = rButtons[0].isSelected() ? "Batch1" : rButtons[1].isSelected() ? "Batch2" : "None";

        // Basic validation
        if (name.isEmpty() || regNo.isEmpty() || email.isEmpty() || batch.equals("None")) {
            JOptionPane.showMessageDialog(this, "Please fill all fields and select a batch.", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!isAgreed) {
            JOptionPane.showMessageDialog(this, "You must agree to proceed.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            outputLabel.setText("<html>Name: " + name + "<br>Reg No: " + regNo + "<br>Email: " + email +
                    "<br>Department (ComboBox): " + department + "<br>Selected Dept (List): " +
                    (selectedListDept != null ? selectedListDept : "None") + "<br>Batch: " + batch + "</html>");
        }
    }

    private void reset() {
        nameField.setText("");
        regnoField.setText("");
        mailField.setText("");
        passwordField.setText("");

        for (JRadioButton button : rButtons) {
            button.setSelected(false);
        }

        comboBox.setSelectedIndex(0);
        list.clearSelection();
        agreeCheckBox.setSelected(false);
        outputLabel.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RegisterPage().setVisible(true));
    }
}
