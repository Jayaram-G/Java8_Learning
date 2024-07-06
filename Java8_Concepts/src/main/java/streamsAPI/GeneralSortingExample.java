package streamsAPI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GeneralSortingExample {

	public static void main(String[] args) {
		
		List<String> superHeros = new ArrayList<String>();
		superHeros.add("WonderWoman");
		superHeros.add("Flash");
		superHeros.add("SuperMan");
		superHeros.add("Batman");
		
		for (String heros : superHeros) {
			System.out.println(heros);
		}
		
		Collections.sort(superHeros);
		System.out.println("===============================");
		for (String heros : superHeros) {
			System.out.println(heros);
		}

	}

}
