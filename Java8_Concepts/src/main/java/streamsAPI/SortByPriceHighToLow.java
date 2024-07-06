package streamsAPI;

import java.util.Comparator;

public class SortByPriceHighToLow implements Comparator<Mobile2>{

	@Override
	public int compare(Mobile2 obj1, Mobile2 obj2) {
		
		return obj2.getPrice()-obj1.getPrice();
	}

}
