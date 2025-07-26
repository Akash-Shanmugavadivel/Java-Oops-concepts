package GuiSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AddStockGui extends JFrame {
    private JTextArea productArea;
    private JTextField idField, nameField, priceField, descriptionField;

    public AddStockGui() {
        createAddStockGui();
    }

    private void createAddStockGui() {
        // Frame properties
        setTitle("Add Stock");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel for product input
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2));

        // Input fields
        inputPanel.add(new JLabel("Product ID:"));
        idField = new JTextField(10);
        inputPanel.add(idField);

        inputPanel.add(new JLabel("Product Name:"));
        nameField = new JTextField(10);
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Price:"));
        priceField = new JTextField(10);
        inputPanel.add(priceField);

        inputPanel.add(new JLabel("Description:"));
        descriptionField = new JTextField(10);
        inputPanel.add(descriptionField);

        JButton addButton = new JButton("Add Products");
        inputPanel.add(addButton);
        // Add input panel to the frame
        add(inputPanel, BorderLayout.NORTH);

        // Text area for product display
        productArea = new JTextArea(10, 30);
        productArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(productArea);
        add(scrollPane, BorderLayout.CENTER);

        JPanel actionPanel = new JPanel();
        JButton showProductsButton = new JButton("Show Products");
        actionPanel.add(showProductsButton);
        add(actionPanel, BorderLayout.SOUTH);

        // Event listeners
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addProduct();
            }
        });

        showProductsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showProducts();
            }
        });
    }

    private void addProduct() {
        try {
            int id = Integer.parseInt(idField.getText());
            String name = nameField.getText();
            double price = Double.parseDouble(priceField.getText());
            String description = descriptionField.getText();

            // Check for unique ID
            if (AddtoStock.getProductById(id) != null) {
                JOptionPane.showMessageDialog(this, "Product ID already exists. Please enter a unique ID.");
                return;
            }

            Products product = new Products(id, name, price, description);
            AddtoStock.addProduct(product);  // Add product to stock
            clearFields();
            JOptionPane.showMessageDialog(this, "Product added successfully!");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for ID and Price.");
        }
    }

    private void showProducts() {
        productArea.setText(""); // Clear previous product display
        ArrayList<Products> products = AddtoStock.getStock(); // Directly get from stock
        if (products.isEmpty()) {
            productArea.append("No products in stock.\n");
        } else {
            for (Products product : products) {
                productArea.append(product + "\n");
            }
        }
    }

    // Clear input fields
    private void clearFields() {
        idField.setText("");
        nameField.setText("");
        priceField.setText("");
        descriptionField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AddStockGui().setVisible(true);
            }
        });
    }
}
