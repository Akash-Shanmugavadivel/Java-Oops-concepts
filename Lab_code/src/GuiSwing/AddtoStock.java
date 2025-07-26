package GuiSwing;

import java.util.ArrayList;

public class AddtoStock {
    private static ArrayList<Products> stock = new ArrayList<>();

    public static Products getProductById(int id) {
        for (Products product : stock) {
            System.out.println("Checking product ID: " + product.getId());
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }


    public static void addProduct(Products product) {
        stock.add(product);
    }

    public static ArrayList<Products> getStock() {
        return stock;
    }
}
