package GuiSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class QuizApp extends JFrame {
    private ArrayList<QuestionPanel> questions;
    private int currentQuestionIndex = 0;
    private JButton checkButton, submitButton;
    private JPanel questionContainer, navigationPanel;
    private JLabel reviewLabel;
    private int score = 0;

    public QuizApp() {
        // Setup frame
        setTitle("Quiz Application");
        setSize(500, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set background color for the main frame
        getContentPane().setBackground(new Color(240, 240, 255));

        // Create questions
        questions = new ArrayList<>();
        questions.add(createQuestion1());
        questions.add(createQuestion2());
        questions.add(createQuestion3());
        questions.add(createQuestion4());

        // Container for the question
        questionContainer = new JPanel(new BorderLayout());
        questionContainer.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        questionContainer.setBackground(new Color(255, 255, 240));
        add(questionContainer, BorderLayout.CENTER);

        // Navigation buttons panel
        navigationPanel = new JPanel();
        navigationPanel.setBackground(new Color(240, 240, 255));  // Light background for button area
        navigationPanel.setLayout(new FlowLayout());

        checkButton = new JButton("Check Answer");
        checkButton.setFont(new Font("Arial", Font.BOLD, 16));
        checkButton.setBackground(new Color(102, 205, 170));
        checkButton.setForeground(Color.WHITE);

        submitButton = new JButton("Submit Quiz");
        submitButton.setFont(new Font("Arial", Font.BOLD, 16));
        submitButton.setBackground(new Color(30, 144, 255));
        submitButton.setForeground(Color.WHITE);
        submitButton.setVisible(false); // Show submit only on the last question

        navigationPanel.add(checkButton);
        navigationPanel.add(submitButton);

        reviewLabel = new JLabel("");
        reviewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        reviewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        reviewLabel.setForeground(new Color(50, 50, 150)); // Review text color
        add(reviewLabel, BorderLayout.SOUTH);

        add(navigationPanel, BorderLayout.SOUTH);

        // Display the first question
        updateQuestionPanel();

        // Event Listeners for buttons
        checkButton.addActionListener(new CheckButtonListener());
        submitButton.addActionListener(new SubmitButtonListener());

        setVisible(true);
    }

    // Event listener for the check button
    private class CheckButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            QuestionPanel currentQuestion = questions.get(currentQuestionIndex);
            boolean isCorrect = currentQuestion.checkAnswer();
            String message = isCorrect ? "Correct!" : "Incorrect! The correct answer is: " + currentQuestion.getCorrectAnswer();

            if (isCorrect) {
                score++;
            }

            // Show feedback with styled message
            JOptionPane.showMessageDialog(null, message, "Feedback", JOptionPane.INFORMATION_MESSAGE);

            // Go to the next question or show submit if it's the last question
            if (currentQuestionIndex < questions.size() - 1) {
                currentQuestionIndex++;
                updateQuestionPanel();
            } else {
                checkButton.setVisible(false); // Hide the check button on the last question
                submitButton.setVisible(true); // Show submit button
            }
        }
    }

    // Event listener for the submit button
    private class SubmitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            StringBuilder review = new StringBuilder();

            // Review all questions
            for (int i = 0; i < questions.size(); i++) {
                QuestionPanel qp = questions.get(i);
                if (!qp.checkAnswer()) {
                    review.append("Question " + (i + 1) + ": Correct answer is: " + qp.getCorrectAnswer() + "\n");
                }
            }

            // Final score message
            reviewLabel.setText("Your score is: " + score + "/" + questions.size());
            JOptionPane.showMessageDialog(null, review.toString(), "Quiz Review", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Method to update question panel
    private void updateQuestionPanel() {
        // Remove the current question panel if any
        questionContainer.removeAll();

        // Add the current question panel
        questionContainer.add(questions.get(currentQuestionIndex), BorderLayout.CENTER);

        // Refresh the UI
        questionContainer.revalidate();
        questionContainer.repaint();
    }

    // Create first question - Radio button
    private QuestionPanel createQuestion1() {
        String[] options = {"Berlin", "Paris", "Rome", "Madrid"};
        return new QuestionPanel("What is the capital of France?", options, "Paris", "radio");
    }

    // Create second question - Check boxes
    private QuestionPanel createQuestion2() {
        String[] options = {"Java", "Python", "HTML"};
        return new QuestionPanel("Select programming languages (Choose two):", options, "Java,Python", "checkbox");
    }

    // Create third question - Text field
    private QuestionPanel createQuestion3() {
        return new QuestionPanel("What is your favorite programming language?", null, "Java", "text");
    }

    // Create fourth question - Text area
    private QuestionPanel createQuestion4() {
        return new QuestionPanel("What is Java mostly known for?", null, "Object Oriented Programming", "textarea");
    }

    // Question panel class to represent individual questions
    class QuestionPanel extends JPanel {
        private JLabel questionLabel;
        private JRadioButton[] radioButtons;
        private JCheckBox[] checkBoxes;
        private JTextField textField;
        private JTextArea textArea;
        private String correctAnswer;
        private String questionType;

        public QuestionPanel(String question, String[] options, String correctAnswer, String type) {
            this.correctAnswer = correctAnswer;
            this.questionType = type;
            setLayout(new GridLayout(5, 1));
            setBackground(new Color(255, 250, 240)); // Panel background color

            // Question Label with bold font and color
            questionLabel = new JLabel("<html><b>" + question + "</b></html>");
            questionLabel.setFont(new Font("Arial", Font.PLAIN, 18));
            questionLabel.setForeground(new Color(75, 0, 130)); // Dark purple color
            add(questionLabel);

            // Radio buttons or checkboxes
            if (type.equals("radio") && options != null) {
                ButtonGroup group = new ButtonGroup();
                radioButtons = new JRadioButton[options.length];
                for (int i = 0; i < options.length; i++) {
                    radioButtons[i] = new JRadioButton(options[i]);
                    radioButtons[i].setFont(new Font("Arial", Font.PLAIN, 16));
                    radioButtons[i].setBackground(new Color(255, 250, 240));
                    group.add(radioButtons[i]);
                    add(radioButtons[i]);
                }
            } else if (type.equals("checkbox") && options != null) {
                checkBoxes = new JCheckBox[options.length];
                for (int i = 0; i < options.length; i++) {
                    checkBoxes[i] = new JCheckBox(options[i]);
                    checkBoxes[i].setFont(new Font("Arial", Font.PLAIN, 16));
                    checkBoxes[i].setBackground(new Color(255, 250, 240));
                    add(checkBoxes[i]);
                }
            } else if (type.equals("text")) {
                textField = new JTextField();
                textField.setFont(new Font("Arial", Font.PLAIN, 16));
                add(textField);
            } else if (type.equals("textarea")) {
                textArea = new JTextArea();
                textArea.setFont(new Font("Arial", Font.PLAIN, 16));
                textArea.setRows(3);
                add(textArea);
            }
        }

        // Check if the user answer is correct
        public boolean checkAnswer() {
            if (questionType.equals("radio")) {
                for (JRadioButton rb : radioButtons) {
                    if (rb.isSelected() && rb.getText().equals(correctAnswer)) {
                        return true;
                    }
                }
            } else if (questionType.equals("checkbox")) {
                StringBuilder selectedAnswers = new StringBuilder();
                for (JCheckBox cb : checkBoxes) {
                    if (cb.isSelected()) {
                        selectedAnswers.append(cb.getText()).append(",");
                    }
                }
                if (selectedAnswers.length() > 0) {
                    selectedAnswers.setLength(selectedAnswers.length() - 1); // Remove last comma
                }
                return selectedAnswers.toString().equals(correctAnswer);
            } else if (questionType.equals("text")) {
                return textField.getText().equalsIgnoreCase(correctAnswer);
            } else if (questionType.equals("textarea")) {
                return textArea.getText().equalsIgnoreCase(correctAnswer);
            }
            return false;
        }

        public String getCorrectAnswer() {
            return correctAnswer;
        }
    }

    public static void main(String[] args) {
        new QuizApp();
    }
}
