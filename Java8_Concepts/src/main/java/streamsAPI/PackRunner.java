package streamsAPI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PackRunner {

	static List<Pack> packages;
	
	public static void packUsingMapFunction() {
	List<List<String>> listOfListOfMasalaItems = packages.stream()
		.map(Pack::getItems)
		.collect(Collectors.toList());
		System.out.println(listOfListOfMasalaItems);
	}
	
	public static void packUsingFlatMapFunction() {
		
	List<String> listOfMasalaItems = packages.stream()
		.map(Pack::getItems)
		.flatMap(List::stream)
		.collect(Collectors.toList());
	System.out.println(listOfMasalaItems);
	}
	

	public static void main(String[] args) {

		Pack masalaItems1 = new Pack("MASALA ITEMS",Arrays.asList("Biryani Masala","Idli Podi"));

		Pack masalaItems2 = new Pack("MASALA ITEMS",Arrays.asList("Bajji Mix","Tandoori Masala"));

		packages = Arrays.asList(masalaItems1,masalaItems2);


		System.out.printf("| %-15s | %-15s |%n",
				"NAME","ITEMS");

		for (Pack pack : packages) {
			System.out.printf("| %-15s | %-15s |%n",
					pack.getName(),pack.getItems());
		}

		packUsingMapFunction();
		packUsingFlatMapFunction();
	}

}
