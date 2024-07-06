package streamsAPI;

import java.util.Comparator;

public class SortByPriceLowToHigh implements Comparator<Mobile2> {

	@Override
	public int compare(Mobile2 obj1, Mobile2 obj2) {
		
		return obj1.getPrice()-obj2.getPrice();
	}
	
	

}
