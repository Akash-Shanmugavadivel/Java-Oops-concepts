package Exception_Ex;


// Custom checked exception for out-of-stock products
class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

// Custom unchecked exception for insufficient funds
class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Product class representing each item
class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void reduceStock(int quantity) throws OutOfStockException {
        if (stock < quantity) {
            throw new OutOfStockException(name + " is out of stock.");
        }
        stock -= quantity;
    }
}

// ShoppingCart class to manage cart items and transactions
class ShoppingCart {
    private double totalAmount;
    private double userBalance;

    public ShoppingCart(double userBalance) {
        this.totalAmount = 0;
        this.userBalance = userBalance;
    }

    public void addProduct(Product product, int quantity) throws OutOfStockException {
        product.reduceStock(quantity);
        totalAmount += product.getPrice() * quantity;
        System.out.println(quantity + "x " + product.getName() + " added to the cart.");
    }

    public void checkout() {
        if (userBalance < totalAmount) {
            throw new InsufficientFundsException("Insufficient funds to complete the purchase.");
        }
        userBalance -= totalAmount;
        System.out.println("Purchase successful! Remaining balance: $" + userBalance);
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public double getUserBalance() {
        return userBalance;
    }
}

public class TransactionManagementSystem {
    public static void main(String[] args) {
        // Creating products
        Product laptop = new Product("Laptop", 1200, 5);
        Product phone = new Product("Smartphone", 800, 2);

        // Creating shopping cart with user balance
        ShoppingCart cart = new ShoppingCart(1500);

        try {
            // Adding items to the cart
            cart.addProduct(laptop, 1); // Laptop costs 1200
            cart.addProduct(phone, 1);  // Smartphone costs 800 (this will trigger insufficient funds later)

            // Attempt to checkout (insufficient funds here)
            cart.checkout();
        } catch (OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

