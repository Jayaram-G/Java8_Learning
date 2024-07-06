package interfaceExample;

@FunctionalInterface
public interface Drivable {
	void start();
	
	int hashCode();
	
	boolean equals(Object o);
}
