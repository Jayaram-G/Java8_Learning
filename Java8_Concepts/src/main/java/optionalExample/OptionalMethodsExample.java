package optionalExample;
import java.util.Optional;
import org.junit.jupiter.api.Test;

public class OptionalMethodsExample {

	@Test
	public void isPresentExample() {
		Optional<String> optional = Optional.of("Ram");
		System.out.println("is Present Example : "+optional.isPresent());
	}

	@Test
	public void isEmptyExample() {
		Optional<String> optional = Optional.of("Ram");
		System.out.println("is Empty Example : "+optional.isEmpty());
	}

	@Test
	public void ifPresentExample() {
		Optional<String> optional = Optional.of("Ram");
		optional.ifPresent(str->System.out.println("if Present Example : "+str.length()));
	}

	@Test
	public void orElseExample() {
		String name = null;
		String result = Optional.ofNullable(name).orElse("Ram");
		System.out.println("or Else Example : "+result);
	}

	@Test
	public void getExample() {
		Optional<String> optional = Optional.of("Dhoni");
		optional.ifPresent(str->System.out.println("Get Example : "+optional.get()));
	}
	
	@Test
	public void orElseGetExample() {
		String name = "Or Else Get Example Ram";
		name=null;
		String result = Optional.ofNullable(name).orElseGet(()->"Ram is not present.So I'm getting returned");
		System.out.println("Or Else Get Example :" +result);
	}
	@Test
	public void orElseThrowExample() {
		String name ="I'm not NULL";
		String result = Optional.ofNullable(name).orElseThrow(()-> new IllegalArgumentException());
		System.out.println("Or Else Throw Example : "+result);
	}

}
