package GuiSwing;

public class Products {
    private int id;
    private String productName;
    private double price;
    private String description;

    public Products(int id, String productName, double price, String description) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Product [ID=" + id + ", Name=" + productName + ", Price=" + price + ", Description=" + description + "]";
    }
}
