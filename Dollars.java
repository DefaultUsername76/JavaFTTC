import java.util.Scanner;
public class Dollars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Used to read user input with scanner class "keyword is 'keyboard' "
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a dollar amount: ");
		int dollar = keyboard.nextInt();
		System.out.println("Your dollar amount was " + keyboard);
		int twenty = dollar / 20;
		dollar -= twenty *20;		
		int ten =   dollar / 10;
		dollar -= ten*10;		
		int five = dollar/5;
		dollar -= five*5;
		int one =dollar;
		System.out.println("Twenties: " + twenty);
		System.out.println("Tens: " + ten);
		System.out.println("Fives: " + five);
		System.out.println("Ones: " + one);
		
	}

}
