import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sample products
        Product laptop = new Product("Laptop", 1200.0, 5);
        Product phone = new Product("Phone", 800.0, 10);
        Product tablet = new Product("Tablet", 600.0, 7);

        // Sample users
        User user1 = new User("john_doe", "john@example.com");
        User user2 = new User("jane_doe", "jane@example.com");

        // Create categories
        Category category1 = new Category();
        Category category2 = new Category("Electronics");
        List<Product> products = new ArrayList<>();
        products.add(laptop);
        Category category3 = new Category("Gadgets", products);

        // Add one product to each category
        category1.addProduct(phone);
        category2.addProduct(tablet);

        // Create shopping carts
        ShoppingCart cart1 = new ShoppingCart();
        ShoppingCart cart2 = new ShoppingCart(user1);
        ShoppingCart cart3 = new ShoppingCart(user2, new ArrayList<>());

        // Add products to shopping carts
        cart1.addProduct(laptop);
        cart1.addProduct(phone);
        cart2.addProduct(phone);
        cart2.addProduct(tablet);

        // Remove a product from cart2
        cart2.removeProduct(phone);

        // Pay for purchases
        System.out.println("Total for cart1: $" + cart1.pay());
        System.out.println("Total for cart2: $" + cart2.pay());
    }
}
