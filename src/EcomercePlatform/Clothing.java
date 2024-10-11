package EcomercePlatform;

public class Clothing extends Product implements Returnable{
		private String size;
		private String material;
		private String gender;
		
		public Clothing(String productId, String name, double price, String size, String material, String gender) {
			super(productId, name, price);
			this.size = size;
			this.material = material;
			this.gender = gender;
		}
		
		public String getSize() {
			return size;
		}

		public void setSize(String size) {
			this.size = size;
		}

		public String getMaterial() {
			return material;
		}

		public void setMaterial(String material) {
			this.material = material;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		@Override
		public double calculateDiscount() {
			return getPrice()*0.25;
			
		}

		@Override
		public String getDetails() {
			
			return "Clothing Product: " + getName() + ", Size: " + size + ", Material: " + material + ", Gender: " + gender;
	    }
		
		@Override
		public void processReturn() {
			System.out.println(getName() + " has been returned. Size: " + size + ", Material: " + material);
		}
		}
		
		
		

