package supplierExample;
import java.util.Calendar;
import java.util.function.Supplier;

public class SupplierExample  {

	public static void main(String[] args) {

		Supplier<Object> supplier =	()->{Calendar calendar = Calendar.getInstance();
		return calendar.getTime();};
		
		System.out.println(supplier.get());

	}


}
