package GuiSwing;

import javax.swing.*;
import java.util.ArrayList;

public class AddToCart {
    private ArrayList<Products> cart;

    public AddToCart() {
        cart = new ArrayList<>();
    }

    public void addProduct(int id) {
        Products product = AddtoStock.getProductById(id);
        if (product != null) {
            cart.add(product);
            JOptionPane.showMessageDialog(null, product.getProductName() + " has been added to the cart.");
        } else {
            JOptionPane.showMessageDialog(null, "Product with ID " + id + " not found in stock.");
        }
    }

    public void removeProduct(Products product) {
        if (cart.contains(product)) {
            cart.remove(product);
            JOptionPane.showMessageDialog(null, product.getProductName() + " has been removed from the cart.");
        } else {
            JOptionPane.showMessageDialog(null, "Product is not in the cart.");
        }
    }

    public void showCart() {
        if (cart.isEmpty()) {
            JOptionPane.showMessageDialog(null, "The cart is empty.");
        } else {
            StringBuilder cartContents = new StringBuilder("Cart contains:\n");
            for (Products product : cart) {
                cartContents.append(product).append("\n");
            }
            JOptionPane.showMessageDialog(null, cartContents.toString());
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Products product : cart) {
            total += product.getPrice();
        }
        return total;
    }

    public ArrayList<Products> getCart() {
        return cart;
    }
}
