import java.util.Scanner;

public class NumbersDemo1 {

	public static void main(String[] args) {
		System.out.println("Enter a number...");
		Scanner number = new Scanner(System.in);
		int num = number.nextInt();
		int num2 = number.nextInt();
		displayTwiceTheNumber(num);
		displaySquaredNumber(num);
		displayNumberPlusFive(num);
	}
	
	public static void displayTwiceTheNumber(int ketchup) {
		
		System.out.println("Doubled: " + ketchup * 2);
	}
	public static void displaySquaredNumber(int mayo) {
		System.out.println("Squared: " + mayo * mayo);
	}
	public static void displayNumberPlusFive(int mustard) {
		int relish = mustard + 5;
		System.out.println("Plus Five: " + relish);
	}
}
