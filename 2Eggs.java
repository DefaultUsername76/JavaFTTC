
public class Eggs {

	public static void main(String[] args) {		
		System.out.println("How many eggs do you need? A dozen of eggs is $3.25 and individual eggs are $0.45.");
		String eggs = "75";
		int total =Integer.parseInt(eggs); 
		int remainder = total % 12;
		int dozen = total / 12 ;
		System.out.println(eggs + " eggs. " + dozen + " dozen, and " + remainder + " individual eggs." );

	}

}
