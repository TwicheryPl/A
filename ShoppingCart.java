import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;
    private User user;

    // Constructors
    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public ShoppingCart(User user) {
        this();
        this.user = user;
    }

    public ShoppingCart(User user, List<Product> products) {
        this.user = user;
        this.products = products;
    }

    // Methods
    public void addProduct(Product product) {
        if (product.getQuantity() > 0) {
            products.add(product);
            product.setQuantity(product.getQuantity() - 1);
        } else {
            System.out.println("Product " + product.getName() + " is out of stock.");
        }
    }

    public void removeProduct(Product product) {
        if (products.remove(product)) {
            product.setQuantity(product.getQuantity() + 1);
        }
    }

    public double pay() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    // Getters
    public List<Product> getProducts() {
        return products;
    }

    public User getUser() {
        return user;
    }
}
