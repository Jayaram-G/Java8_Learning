package predicateChainingExample;

import java.util.function.Predicate;

public class PredicateChainingExamples {
	//campus interview select -> YES
	//degree complete -> YES
	
	Predicate<String> campusInterviewSelected;
	Predicate<String> degreeCompleted;
	Predicate<Boolean> opposite;
	
	public void andExample() {
		
		campusInterviewSelected = interviewInput->interviewInput.equalsIgnoreCase("yes");
		degreeCompleted = degreeInput->degreeInput.equalsIgnoreCase("yes");
		
		System.out.println("And Example Can I join company ? "+
		campusInterviewSelected.and(degreeCompleted).test("yes"));
	}
	
	public void orExample() {
		
		campusInterviewSelected = interviewInput->interviewInput.equalsIgnoreCase("yes");
		degreeCompleted = degreeInput->degreeInput.equalsIgnoreCase("no");
		
		System.out.println("Or Example Can I join company ? "+
		campusInterviewSelected.or(degreeCompleted).test("yes"));
		
	}
	
	public void negateExample() {
		
		opposite = input->input;
		System.out.println("Negate :" +opposite.negate().test(true));
		
	}
	

	public static void main(String[] args) {
		
		PredicateChainingExamples examples = new PredicateChainingExamples();
		examples.andExample();
		examples.orExample();
		examples.negateExample();
		

	}

}
