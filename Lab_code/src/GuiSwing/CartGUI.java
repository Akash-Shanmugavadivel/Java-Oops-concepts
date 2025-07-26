package GuiSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CartGUI extends JFrame {
    private AddToCart cart;
    private JTextArea cartArea;
    private JTextField idField;

    public CartGUI() {
        cart = new AddToCart();
        createGUI();
    }

    private void createGUI() {
        // Frame properties
        setTitle("Shopping Cart");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel for product input
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2));

        // Input fields
        inputPanel.add(new JLabel("Enter Product ID:"));
        idField = new JTextField(10);
        inputPanel.add(idField);

        JButton addButton = new JButton("Add to Cart");
        inputPanel.add(addButton);

        JButton removeButton = new JButton("Remove from Cart");
        inputPanel.add(removeButton);

        // Add input panel to the frame
        add(inputPanel, BorderLayout.NORTH);

        // Text area for cart contents
        cartArea = new JTextArea(10, 30);
        cartArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(cartArea);
        add(scrollPane, BorderLayout.CENTER);

        // Panel for total price and showing cart
        JPanel actionPanel = new JPanel();
        JButton showCartButton = new JButton("Show Cart");
        JButton calculateTotalButton = new JButton("Calculate Total");
        actionPanel.add(showCartButton);
        actionPanel.add(calculateTotalButton);

        add(actionPanel, BorderLayout.SOUTH);

        // Event listeners
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addProductToCart();
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeProductFromCart();
            }
        });

        showCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showCart();
            }
        });

        calculateTotalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateTotal();
            }
        });
    }

    // Add product to the cart
    private void addProductToCart() {
        try {
            int id = Integer.parseInt(idField.getText());
            cart.addProduct(id);
            clearField();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid product ID.");
        }
    }

    // Remove product from the cart
    private void removeProductFromCart() {
        try {
            int id = Integer.parseInt(idField.getText());
            Products product = AddtoStock.getProductById(id);
            cart.removeProduct(product);
            clearField();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid product ID.");
        }
    }

    // Show cart contents
    private void showCart() {
        cart.showCart();
    }

    // Calculate total price
    private void calculateTotal() {
        double total = cart.calculateTotal();
        JOptionPane.showMessageDialog(this, "Total Price: $" + total);
    }

    // Clear input field
    private void clearField() {
        idField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CartGUI().setVisible(true);
            }
        });
    }
}
