package predicateExample;

public class Student {
	
	private String name;
	private double percentage;
	
	public Student(String name,double percentage) {
		this.name=name;
		this.percentage=percentage;
	}

	public String getName() {
		return name;
	}

	public double getPercentage() {
		return percentage;
	}
	
	public String toString() {
		return "Name : "+getName()+" , Percentage : "+getPercentage();
	}
	
	

}
