package JavaExam;

import javax.swing.*;
import java.awt.*;

public class sample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Set GridBagLayout as the layout manager
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Button 1 - Positioned at (0,0), spans 1 column and 1 row
        gbc.gridx = 0;  // Column 0
        gbc.gridy = 0;  // Row 0
        gbc.gridwidth = 1;  // Spans 1 column
        gbc.gridheight = 1;  // Spans 1 row
        gbc.weightx = 1.0;   // Will take extra horizontal space
        gbc.weighty = 1.0;   // Will take extra vertical space
        gbc.fill = GridBagConstraints.BOTH;  // Component will grow to fill both directions
        frame.add(new JButton("Button 1"), gbc);

        // Button 2 - Positioned at (1,0), spans 2 columns and 1 row
        gbc.gridx = 1;  // Column 1
        gbc.gridy = 0;  // Row 0
        gbc.gridwidth = 2;  // Spans 2 columns
        gbc.gridheight = 1;  // Spans 1 row
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        frame.add(new JButton("Button 2"), gbc);

        // Button 3 - Positioned at (0,1), spans 1 column and 2 rows
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 2;  // Spans 2 rows
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        frame.add(new JButton("Button 3"), gbc);

        // Button 4 - Positioned at (1,1), spans 1 column and 1 row
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        frame.add(new JButton("Button 4"), gbc);

        // Button 5 - Positioned at (2,1), spans 1 column and 1 row
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        frame.add(new JButton("Button 5"), gbc);

        // Button 6 - Positioned at (1,2), spans 2 columns and 1 row
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        frame.add(new JButton("Button 6"), gbc);

        frame.setVisible(true);
    }
}
