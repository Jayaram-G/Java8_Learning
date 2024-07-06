package predicateExample;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StudentRunner {

	public static void main(String[] args) {
		
		/*
		 * Student ram = new Student("Ram",77); Student deepi = new
		 * Student("Deepi",91.5); Student riya = new Student("Riya",37.6);
		 * 
		 * List<Student> students = new ArrayList<Student>(); students.add(ram);
		 * students.add(deepi); students.add(riya);
		 */
		
		List<Student> studentsList = new ArrayList<Student>();
		studentsList.add(new Student("Ram",77));
		studentsList.add(new Student("Deepi",91.5));
		studentsList.add(new Student("Riya",37.6));
		studentsList.add(new Student("Mani",35.5));
		
		/*
		 * Predicate<Student> lessThan40 = list->list.getPercentage()<40;
		 * 
		 * for (Student student : studentsList) { if(lessThan40.test(student)) {
		 * System.out.println(student.getName()); } }
		 */
		
		//studentsList.forEach(input->System.out.println(input));
		
		Supplier<List<Student>> studentSupplier = ()-> studentsList;
		System.out.println(studentSupplier.get());
		

	}

}
