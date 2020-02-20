import java.util.Scanner;
public class Sandwich {
	

	public static void main(String[] args) {
		double tuna = tuna();
		double cheese = cheese();
		double turkey = turkey();
		Scanner read = new Scanner(System.in);
		System.out.println("We offer cheese, tuna, and turkey sandwiches. ");
		System.out.println("The sandwich prices are $" + turkey + " for turkey, $" + tuna + " for tuna, and $" + cheese + " for cheese sandwiches." );
	}

	public static double tuna() {
		double tuna = 4.99;
		return tuna;
	}
	public static double cheese() {
		double cheese = 3.59;
		return cheese;
	}
	public static double turkey() {
		double turkey = 5.99;
		return turkey;
	}
	
}
