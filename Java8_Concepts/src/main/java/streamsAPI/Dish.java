package streamsAPI;

public class Dish {
	
	private String dishName;
	private boolean isVegetarian;
	private Type type;
	private int price;
	
	public enum Type{
		STARTER,MAIN_COURSE,CURRY,DESSERTS,OTHERS
	}

	public Dish(String dishName, boolean isVegetarian, Type type, int price) {
		super();
		this.dishName = dishName;
		this.isVegetarian = isVegetarian;
		this.type = type;
		this.price = price;
	}

	public String getDishName() {
		return dishName;
	}

	public boolean isVegetarian() {
		return isVegetarian;
	}

	public Type getType() {
		return type;
	}

	public int getPrice() {
		return price;
	}
	
	

}
