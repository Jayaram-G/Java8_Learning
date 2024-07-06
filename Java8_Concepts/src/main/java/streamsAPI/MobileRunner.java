package streamsAPI;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import streamsAPI.Mobile.Brand;

public class MobileRunner {

	public static List<Mobile> mobileList = null;

	public static void main(String[] args) {

		Mobile mobile1 = new Mobile(Brand.APPLE,"13 Pro Max",256,1200,12,6.1,"Silver");
		Mobile mobile2 = new Mobile(Brand.APPLE,"14 Pro Max",256,1200,18,6.7,"Black");
		Mobile mobile3 = new Mobile(Brand.SAMSUNG,"Galaxy S23",512,24,50,6.6,"Phantom Black");
		Mobile mobile4 = new Mobile(Brand.SAMSUNG,"Galaxy A12",128,110,8,6.5,"Lavendar");
		Mobile mobile5 = new Mobile(Brand.ONEPLUS,"11 5G",128,699,12,6.6,"Titan Black");
		Mobile mobile6 = new Mobile(Brand.ONEPLUS,"Nord 4",256,399,50,6.6,"Blue Quantum");
		Mobile mobile7 = new Mobile(Brand.XIAOMI,"Redmi Note 13",128,199,100,6.7,"Graphite Grey");
		Mobile mobile8 = new Mobile(Brand.XIAOMI,"Poco X6 Pro 5G",512,300,64,6.6,"Light Blue");
		Mobile mobile9 = new Mobile(Brand.GOOGLE,"Pixel 8 Pro",512,599,12,6.4,"Snow");
		Mobile mobile10 = new Mobile(Brand.GOOGLE,"Pixel 7 Pro",256,499,12,6.2,"Stormy Black");
		Mobile mobile11= new Mobile(Brand.MOTO,"Razr 5G",256,699,50,6.2,"Magenta");
		Mobile mobile12 = new Mobile(Brand.MOTO,"Edge",128,350,32,6.7,"Nebula Blue");
		Mobile mobile13 = new Mobile(Brand.NOKIA,"G10",256,299,50,6.3,"Dusk");
		Mobile mobile14 = new Mobile(Brand.NOKIA,"5.3",256,399,12,6.5,"Charcoal");
		Mobile mobile15 = new Mobile(Brand.APPLE,"13 Mini",128,599,12,6.2,"Red");

		mobileList=Arrays.asList(mobile1,mobile2,mobile3,mobile4,mobile5,mobile6,mobile7,
				mobile8,mobile9,mobile10,mobile11,mobile12,mobile13,mobile14,mobile15);
		displayMobiles();
		lowToHigh();
	}

	public static void displayMobiles() {
		System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s |%n",
				"BRAND","MODEL","MEMORY","CAMERA","PRICE");

		for(Mobile mobile : mobileList) {
			System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s |%n",
					mobile.getBrand(),mobile.getModel(),mobile.getMemory(),mobile.getMegapixel(),mobile.getPrice());
		}
	}
	
	public static void lowToHigh() {
		
		Collections.sort(mobileList);
		System.out.println("After Sorting by Price Low to High");
		
		System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s |%n",
				"BRAND","MODEL","MEMORY","CAMERA","PRICE");

		for(Mobile mobile : mobileList) {
			System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s |%n",
					mobile.getBrand(),mobile.getModel(),mobile.getMemory(),mobile.getMegapixel(),mobile.getPrice());
		}
		
	}
	

}
