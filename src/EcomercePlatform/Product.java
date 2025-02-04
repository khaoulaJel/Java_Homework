package EcomercePlatform;

public abstract class Product {
	private String productId;
	private String name;
	private double price;
	
	public Product(String productId, String name, double price) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	 public abstract double calculateDiscount();
	 public abstract String getDetails();
	
}
