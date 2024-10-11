package EcomercePlatform;
import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<Product> products;

	public Cart() {
		products= new ArrayList<>();
		
	}
	public void addProduct(Product product) {
		products.add(product);
        System.out.println(product.getName() + " has been added to the cart.");
	}
	
	public void removeProduct(Product product) {
		products.remove(product);
		System.out.println(product.getName() + " has been deleted from the cart.");
	}
	public void displayProduct() {
		System.out.println("\n--- Cart Products ---");
        for (Product product : products) {
            System.out.println("Product: " + product.getName() + ", Price: $" + product.getPrice() + ", Details: " + product.getDetails());
        }

	}
	
	 public void applyDiscounts() {
	        System.out.println("\n--- Applying Discounts ---");
	        for (Product product : products) {
	            double discount = product.calculateDiscount();
	            double newPrice = product.getPrice() - discount;
	            product.setPrice(newPrice);
	            System.out.println("Applied discount to " + product.getName() + ": New price is $" + newPrice);
	        }
	    }
	 
	 public void processReturns() {
	        System.out.println("\n--- Processing Returns ---");
	        for (Product product : products) {
	            if (product instanceof Returnable) {
	                ((Returnable) product).processReturn();
	            } else {
	                System.out.println(product.getName() + " cannot be returned.");
	            }
	        }
	    }
	
}
