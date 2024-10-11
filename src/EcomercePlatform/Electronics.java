package EcomercePlatform;

public  class Electronics extends Product implements Returnable {
	
	
	private String brand;
	private int warrantyPeriod;
	
	

	public Electronics(String productId, String name, double price, String brand, int warrantyPeriod) {
		super(productId, name, price);
		this.brand = brand;
		this.warrantyPeriod = warrantyPeriod;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}


	public void setWarrantyPeriod(int warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}


	@Override
	public double calculateDiscount() {
		return getPrice()*0.1;
	}

	@Override
	public String getDetails() {
		return "Electronics Product: " + getName() + ", Brand: " + brand + ", Warranty: " + warrantyPeriod + " months";
	}
	
	@Override
	public void processReturn() {
		 System.out.println(getName() + " has been returned. Warranty period: " + warrantyPeriod + " months.");
	}

}
