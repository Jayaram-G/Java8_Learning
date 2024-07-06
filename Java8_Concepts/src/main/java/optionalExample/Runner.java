package optionalExample;
import java.util.Arrays;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

		Person adam = new Person("Adam",20,new Car("civic",new Insurance("HDFC Ergo")));

		System.out.println(adam.getCarInsuranceName(adam));

		Person john = new Person("John",30,null);

		System.out.println(john.getCarInsuranceName(john));

		List<Person> listOfPersons = Arrays.asList(adam,john);

		int result = listOfPersons.stream().reduce(0,(total,person)->total+person.getAge(),Integer::sum);
		
		System.out.println(result);
	}

}
