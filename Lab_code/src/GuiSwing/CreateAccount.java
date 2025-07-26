package GuiSwing;

import javax.swing.*;
import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateAccount extends JFrame {
    private JTextField Fname, Lname, UName, eMail, ReMail, phoneNo;
    private JPasswordField passWord, CpassWord;
    private JButton Create, Cancel, Reset;
    private JLabel EFname, ELname, EUName, EEEmail, EReMail, EPhoneNo, EPassWord, ECpassWord, Etoday;
    public CreateAccount() {
        setTitle("Create Account");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Panel and layout manager
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5); // Padding

        // First Name
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("First Name:"), gbc);
        Fname = new JTextField(20);
        gbc.gridx = 1;
        panel.add(Fname, gbc);
        EFname = new JLabel();  // Error label for First Name
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(EFname, gbc);

        // Last Name
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("Last Name:"), gbc);
        Lname = new JTextField(20);
        gbc.gridx = 1;
        panel.add(Lname, gbc);
        ELname = new JLabel();  // Error label for Last Name
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(ELname, gbc);

        // User Name
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("User Name:"), gbc);
        UName = new JTextField(20);
        gbc.gridx = 1;
        panel.add(UName, gbc);
        EUName = new JLabel();  // Error label for User Name
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(EUName, gbc);

        // Email
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("Email:"), gbc);
        eMail = new JTextField(20);
        gbc.gridx = 1;
        panel.add(eMail, gbc);
        EEEmail = new JLabel();  // Error label for Email
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(EEEmail, gbc);

        // Recovery Email
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("Recovery Email:"), gbc);
        ReMail = new JTextField(20);
        gbc.gridx = 1;
        panel.add(ReMail, gbc);
        EReMail = new JLabel();  // Error label for Recovery Email
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(EReMail, gbc);

        // Date of Birth field
        DateFormat dateFormat = new SimpleDateFormat("dd MMM YYYY");
        JFormattedTextField today = new JFormattedTextField(dateFormat);
        today.setColumns(10);
        today.setValue(new Date());
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("Date:"), gbc);
        gbc.gridx = 1;
        panel.add(today, gbc);
        Etoday = new JLabel();  // Error label for Date of Birth
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(Etoday, gbc);

        // Phone Number
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("Phone Number:"), gbc);
        phoneNo = new JTextField(20);
        gbc.gridx = 1;
        panel.add(phoneNo, gbc);
        EPhoneNo = new JLabel();  // Error label for Phone Number
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(EPhoneNo, gbc);

        // Password
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("Enter Password:"), gbc);
        passWord = new JPasswordField(20);
        gbc.gridx = 1;
        panel.add(passWord, gbc);
        EPassWord = new JLabel();  // Error label for Password
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(EPassWord, gbc);

        // Confirm Password
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("Confirm Password:"), gbc);
        CpassWord = new JPasswordField(20);
        gbc.gridx = 1;
        panel.add(CpassWord, gbc);
        ECpassWord = new JLabel();  // Error label for Confirm Password
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(ECpassWord, gbc);

        // Buttons
        Create = new JButton("Create");
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(Create, gbc);
        Cancel = new JButton("Cancel");
        gbc.gridx = 1;
        panel.add(Cancel, gbc);
        Reset = new JButton("Reset");
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(Reset, gbc);

        add(panel);

        Reset.addActionListener(e ->clearErrorMessages());

        Create.addActionListener(e -> {
            try {
                validateInputs(today);
                JOptionPane.showMessageDialog(this, "Account Created!");
            } catch (Exception ex) {

               JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        Cancel.addActionListener(e -> dispose());  // Close the window
    }
    private void clearErrorMessages() {
        EFname.setText("");
        ELname.setText("");
        EUName.setText("");
        EEEmail.setText("");
        EReMail.setText("");
        EPhoneNo.setText("");
        EPassWord.setText("");
        ECpassWord.setText("");
        Etoday.setText("");
    }
    private void resetFields() {
        Fname.setText("");
        Lname.setText("");
        UName.setText("");
        eMail.setText("");
        ReMail.setText("");
        phoneNo.setText("");
        passWord.setText("");
        CpassWord.setText("");
        Fname.requestFocus();  // Set focus back to the first input
    }

    private void validateInputs(JFormattedTextField today) throws Exception {
        // Check for empty fields
        if (Fname.getText().trim().isEmpty()) {
            EFname.setText("First name can't be empty");
            //throw new Exception("First Name cannot be empty");
        }
        if (Lname.getText().trim().isEmpty()) {
            ELname.setText("Last name can't be empty");
            //throw new Exception("Last Name cannot be empty");
        }
        if (UName.getText().trim().isEmpty()) {
            throw new Exception("User Name cannot be empty");
        }
        if (eMail.getText().trim().isEmpty()) {
            throw new Exception("Email cannot be empty");
        }
        if (ReMail.getText().trim().isEmpty()) {
            throw new Exception("Recovery Email cannot be empty");
        }
        if (today.getText().trim().isEmpty()) {
            throw new Exception("Date of Birth cannot be empty");
        }
        if (phoneNo.getText().trim().isEmpty()) {
            throw new Exception("Phone Number cannot be empty");
        }

        // Validate email format
        String emailPattern = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        if (!eMail.getText().trim().matches(emailPattern)) {
            throw new Exception("Invalid Email Format");
        }

        // Validate phone number (10 digits)
        if (!phoneNo.getText().trim().matches("\\d{10}")) {
            throw new Exception("Phone Number must be 10 digits");
        }

        // Validate passwords
        String password = new String(passWord.getPassword());
        String confirmPassword = new String(CpassWord.getPassword());

        if (password.isEmpty()) {
            throw new Exception("Password cannot be empty");
        } else if (password.length() < 8) {
            throw new Exception("Password must be at least 8 characters long");
        } else if (!password.equals(confirmPassword)) {
            throw new Exception("Passwords do not match");
        }
    }

    public static void main(String[] args) {
        CreateAccount createAccount = new CreateAccount();
        createAccount.setVisible(true);
    }
}
