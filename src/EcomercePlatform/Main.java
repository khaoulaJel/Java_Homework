package EcomercePlatform;
public class Main {
    public static void main(String[] args) {
        
        Product phone = new Electronics("1", "Smartphone", 999.99, "Samsung", 2);
        Product shirt = new Clothing("2", "T-Shirt", 29.99, "M", "Cotton", "Unisex");
        Product apple = new Groceries("3", "Apple", 1.99, "2024-12-31", true);

        // Create cart
        Cart cart = new Cart();

        // Add products to cart
        cart.addProduct(phone);
        cart.addProduct(shirt);
        cart.addProduct(apple);

        // Display products in the cart
        cart.displayProduct();

        // Apply discounts
        cart.applyDiscounts();

        // Handle returns
        cart.processReturns();
    }
}
