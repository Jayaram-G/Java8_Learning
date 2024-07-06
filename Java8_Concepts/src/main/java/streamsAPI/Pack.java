package streamsAPI;

import java.util.List;

public class Pack {
	
	private String name;
	private List<String> items;
	
	public Pack(String name, List<String> items) {
		super();
		this.name = name;
		this.items = items;
	}

	public String getName() {
		return name;
	}

	public List<String> getItems() {
		return items;
	}
	
	
	

}
