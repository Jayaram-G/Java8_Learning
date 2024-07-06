package optionalExample;

import java.util.Optional;

public class Person {

	private String name;
	
	private int age;

	private Optional<Car> car;

	public Person(String name,int age, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.car = Optional.ofNullable(car);
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public Optional<Car> getCar() {
		return car;
	}

	public String getCarInsuranceName(Person person) {

		Optional<Person> optPerson = Optional.ofNullable(person);

		return	optPerson
				.flatMap(Person::getCar)
				.flatMap(Car::getInsurance)
				.map(Insurance::getName)
				.orElse("One of the value is NULL");

	}
}
