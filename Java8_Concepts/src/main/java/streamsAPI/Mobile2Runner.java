package streamsAPI;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import streamsAPI.Mobile2.Brand;

public class Mobile2Runner {
	
	public static List<Mobile2> mobileList = null;

	public static void main(String[] args) {
		
		Mobile2 mobile1 = new Mobile2(Brand.APPLE,"13 Pro Max",256,1200,12,6.1,"Silver");
		Mobile2 mobile2 = new Mobile2(Brand.APPLE,"14 Pro Max",256,1200,18,6.7,"Black");
		Mobile2 mobile3 = new Mobile2(Brand.SAMSUNG,"Galaxy S23",512,24,50,6.6,"Phantom Black");
		Mobile2 mobile4 = new Mobile2(Brand.SAMSUNG,"Galaxy A12",128,110,8,6.5,"Lavendar");
		Mobile2 mobile5 = new Mobile2(Brand.ONEPLUS,"11 5G",128,699,12,6.6,"Titan Black");
		Mobile2 mobile6 = new Mobile2(Brand.ONEPLUS,"Nord 4",256,399,50,6.6,"Blue Quantum");
		Mobile2 mobile7 = new Mobile2(Brand.XIAOMI,"Redmi Note 13",128,199,100,6.7,"Graphite Grey");
		Mobile2 mobile8 = new Mobile2(Brand.XIAOMI,"Poco X6 Pro 5G",512,300,64,6.6,"Light Blue");
		Mobile2 mobile9 = new Mobile2(Brand.GOOGLE,"Pixel 8 Pro",512,599,12,6.4,"Snow");
		Mobile2 mobile10 = new Mobile2(Brand.GOOGLE,"Pixel 7 Pro",256,499,12,6.2,"Stormy Black");
		Mobile2 mobile11= new Mobile2(Brand.MOTO,"Razr 5G",256,699,50,6.2,"Magenta");
		Mobile2 mobile12 = new Mobile2(Brand.MOTO,"Edge",128,350,32,6.7,"Nebula Blue");
		Mobile2 mobile13 = new Mobile2(Brand.NOKIA,"G10",256,299,50,6.3,"Dusk");
		Mobile2 mobile14 = new Mobile2(Brand.NOKIA,"5.3",256,399,12,6.5,"Charcoal");
		Mobile2 mobile15 = new Mobile2(Brand.APPLE,"13 Mini",128,599,12,6.2,"Red");
		
		
		mobileList=Arrays.asList(mobile1,mobile2,mobile3,mobile4,mobile5,mobile6,mobile7,
				mobile8,mobile9,mobile10,mobile11,mobile12,mobile13,mobile14,mobile15);
		displayMobiles();
		lowToHigh();
		highToLow();

	}
	
	public static void displayMobiles() {
		System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s |%n",
				"BRAND","MODEL","MEMORY","CAMERA","PRICE");

		for(Mobile2 mobile : mobileList) {
			System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s |%n",
					mobile.getBrand(),mobile.getModel(),mobile.getMemory(),mobile.getMegapixel(),mobile.getPrice());
		}
	}
	
	public static void lowToHigh() {
		
		Collections.sort(mobileList,new SortByPriceLowToHigh());
		
		System.out.println("After Sorting by Price Low to High");
		
		System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s |%n",
				"BRAND","MODEL","MEMORY","CAMERA","PRICE");

		for(Mobile2 mobile : mobileList) {
			System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s |%n",
					mobile.getBrand(),mobile.getModel(),mobile.getMemory(),mobile.getMegapixel(),mobile.getPrice());
		}
	}
	
public static void highToLow() {
		
		Collections.sort(mobileList,new SortByPriceHighToLow());
		
		System.out.println("After Sorting by Price High to Low");
		
		System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s |%n",
				"BRAND","MODEL","MEMORY","CAMERA","PRICE");

		for(Mobile2 mobile : mobileList) {
			System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s |%n",
			mobile.getBrand(),mobile.getModel(),mobile.getMemory(),mobile.getMegapixel(),mobile.getPrice());
		}
	}

}
