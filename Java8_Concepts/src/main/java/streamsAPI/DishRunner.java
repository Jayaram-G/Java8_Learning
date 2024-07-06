package streamsAPI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DishRunner {

	static List<Dish> menu = null;
	public static void getNonVegItemsByPriceLowToHigh() {

		List<Dish> nonVegLowToHighList = new ArrayList<Dish>();

		//iterate & check the dish is non vegetarian & sort by price low to high

		for(Dish dish:menu) {
			if(!dish.isVegetarian()) {
				nonVegLowToHighList.add(dish);
			}
		}

		Collections.sort(nonVegLowToHighList,new Comparator<Dish>() {
			@Override
			public int compare(Dish dish1, Dish dish2) {
				//return dish1.getPrice()-dish2.getPrice();
				return Integer.compare(dish1.getPrice(), dish2.getPrice());
			}
		});

		for (Dish dish : nonVegLowToHighList) {
			System.out.println(dish.getDishName());
		}
		System.out.println("--END of JAVA 7 MENU--");
	}

	public static void usingJava8() {

		List<String> usingJava8	= menu.stream()
				.filter(dish->dish.isVegetarian()==false)
				.sorted(Comparator.comparing(Dish::getPrice).reversed())
				.map(dish->dish.getDishName())
				.collect(Collectors.toList());

		System.out.println(usingJava8);

	}

	public static void getVegItems() {

		List<Dish> vegList = menu.stream()
				.filter(Dish::isVegetarian)
				.collect(Collectors.toList());

		vegList.forEach(items->System.out.println(items.getDishName()));

		/*
		 * for(Dish dish:vegList) { System.out.println(dish.getDishName()); }
		 */
	}

	public static void main(String[] args) {

		Dish dish1 = new Dish("Chicken Biryani",false,Dish.Type.MAIN_COURSE,120);
		Dish dish2 = new Dish("Panner Biryani",true,Dish.Type.MAIN_COURSE,120);
		Dish dish3 = new Dish("Cheese Pizza",true,Dish.Type.OTHERS,150);
		Dish dish4 = new Dish("French Fries",true,Dish.Type.OTHERS,40);
		Dish dish5 = new Dish("Chicken 555",false,Dish.Type.STARTER,90);
		Dish dish6 = new Dish("Corn Fingers",true,Dish.Type.STARTER,90);
		Dish dish7 = new Dish("Nethili",false,Dish.Type.STARTER,110);
		Dish dish8 = new Dish("Chicken Gravy",false,Dish.Type.CURRY,125);
		Dish dish9 = new Dish("Royal Falooda",true,Dish.Type.DESSERTS,75);
		Dish dish10 = new Dish("Triple sundae",true,Dish.Type.DESSERTS,85);
		Dish dish11 = new Dish("Panner Butter Masala ",true,Dish.Type.CURRY,70);

		menu = Arrays.asList(dish1,dish2,dish3,dish4,dish5,dish6,dish7,dish8,dish9,dish10,dish11);
		/*
		 * System.out.println("-----MENU-----");
		 * 
		 * for (Dish dish : menu) { System.out.println(dish.getDishName()); }
		 * System.out.println("---END OF MENU---");
		 */

		//getNonVegItemsByPriceLowToHigh();
		//usingJava8();
		//getVegItems();
		getDishName();
	}

	private static void getDishName() {

		List<String> names = menu.stream()
				.map(Dish::getDishName)
				.collect(Collectors.toList());

		for (String string : names) {

			System.out.println(string);

		}
	}

}
