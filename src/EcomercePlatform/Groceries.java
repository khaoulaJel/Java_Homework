package EcomercePlatform;



public class Groceries extends Product {
	 private String expirationDate;
	 private boolean isPerishable;
	public Groceries(String productId, String name, double price, String expirationDate, boolean isPerishable) {
		super(productId, name, price);
		this.expirationDate = expirationDate;
		this.isPerishable = isPerishable;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public boolean isPerishable() {
		return isPerishable;
	}
	public void setPerishable(boolean isPerishable) {
		this.isPerishable = isPerishable;
	}
	@Override
    public double calculateDiscount() {
        return isPerishable ? getPrice() * 0.05 : getPrice() * 0.03;
    }

    @Override
    public String getDetails() {
        return "Groceries Product: " + getName() + ", Expiration Date: " + expirationDate + ", Perishable: " + isPerishable;
    }
	 
}
