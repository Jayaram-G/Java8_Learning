package optionalExample;
import java.util.Optional;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

public class CreateOptionalObjectsExample {
	
	@Test
	public void testCreateEmpty() {
		
		Optional<String> empty = Optional.empty();
		assertTrue(empty.isEmpty());
	}
	
	@Test
	public void testUsingOf() {
		String name ="Ram";
		//name=null;
		Optional<String> nonNullable = Optional.of(name);
		
		assertTrue(nonNullable.isPresent());
	}
	
	@Test
	public void usingOfNullable() {
		String name ="Ram";
		name=null;
		Optional<String> nonNullable = Optional.ofNullable(name);
		
		assertFalse(nonNullable.isPresent());
		
	}

}
