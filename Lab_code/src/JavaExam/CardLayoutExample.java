package JavaExam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a CardLayout
        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);

        // Create panels (cards) to be added to the CardLayout
        JPanel card1 = new JPanel();
        card1.add(new JLabel("This is Card 1"));
        JPanel card2 = new JPanel();
        card2.add(new JLabel("This is Card 2"));
        JPanel card3 = new JPanel();
        card3.add(new JLabel("This is Card 3"));

        // Add cards to the panel with a unique name
        cardPanel.add(card1, "Card 1");
        cardPanel.add(card2, "Card 2");
        cardPanel.add(card3, "Card 3");

        // Add buttons to switch between cards
        JPanel buttonPanel = new JPanel();
        JButton nextButton = new JButton("Next");
        JButton previousButton = new JButton("Previous");

        // Add ActionListeners to navigate through the cards
        nextButton.addActionListener(e -> cardLayout.next(cardPanel));
        previousButton.addActionListener(e -> cardLayout.previous(cardPanel));

        buttonPanel.add(previousButton);
        buttonPanel.add(nextButton);

        // Add both panels (buttonPanel and cardPanel) to the frame
        frame.setLayout(new BorderLayout());
        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}

