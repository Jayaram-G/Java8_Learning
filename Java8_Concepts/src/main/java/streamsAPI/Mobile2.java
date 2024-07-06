package streamsAPI;

public class Mobile2 {
	public Brand brand;
	public String model;
	public int memory;
	public int price;
	public int megapixel;
	public double displaySize;
	public String color;
	
	public Mobile2(Brand brand, String model, int memory, int price, int megapixel, double displaySize, String color) {
		super();
		this.brand = brand;
		this.model = model;
		this.memory = memory;
		this.price = price;
		this.megapixel = megapixel;
		this.displaySize = displaySize;
		this.color = color;
	}

	public enum Brand{
		APPLE,SAMSUNG,MOTO,GOOGLE,ONEPLUS,NOKIA,XIAOMI
	}

	public Brand getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getMemory() {
		return memory;
	}

	public int getPrice() {
		return price;
	}

	public int getMegapixel() {
		return megapixel;
	}

	public double getDisplaySize() {
		return displaySize;
	}

	public String getColor() {
		return color;
	}
	
	
	

}
