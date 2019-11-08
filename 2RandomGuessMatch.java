import java.util.Scanner;
public class RandomGuessMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MAX = 20;
		int MIN = 1;
		Scanner number = new Scanner(System.in);
		System.out.println("Guess a number between 1 and 20 ");
		int input = number.nextInt();
		int random = MIN + (int)(Math.random() * MAX);
		if(input == random)
		System.out.println("You were correct! The number was :" + random);
		
		else
			System.out.println("You were incorrect! The number was :" + random);
		
		if(input >= 21 )
			System.out.println("The range is 1 to 20. Please try again.");
	}

}
