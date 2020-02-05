import java.util.*;
//Micah ALexander
public class Lottery {

	public static void main(String[] args)
    {
        //Make variables to hold data for the numbers entered and calculated...
		Scanner numberString = new Scanner(System.in);
        int intNumber1 = 0;
        int intNumber2 = 0;
        int intNumber3 = 0;
        int Total;
        int not_in_order = 30;
        int exact_order = 33;
        int num1, num2, num3;
       //Generate the numbers and get user input as a guess as to what the outcome will be
        Random number1 = new Random();
        int Number1;
        Number1 = number1.nextInt();
        Random number2 = new Random();
        int Number2;
        Number2 = number2.nextInt(5);
        Random number3 = new Random();
        int Number3;
        Number3 = number3.nextInt(5); 
        System.out.println(" Enter integers");
        num1 = numberString.nextInt();
       // num1 = Convert.ToInt32(numberString);
        System.out.println(" Enter integers");
        num2= numberString.nextInt();
        System.out.println(" Enter integers");
        num3 = numberString.nextInt();
  //logic used to determine the outcome of said lottery 
        if (num1 == Number1)
            intNumber1 = 11;
        else if (num1 == Number2)
            intNumber1 = 10;
        else if (num1 == Number3)
            intNumber1 = 10;
        if (num2 == Number2)
                intNumber2 += 11;
            else if (num2 == Number1)
                intNumber2 += 10;
            else if (num2 == Number3)
                intNumber2 += 10;

        if (num3 == Number3)
            intNumber3 = 11;
        else if (num3 == Number1)
            intNumber3 = 10;
        else if (num3== Number2)
            intNumber3 = 10;

        Total = intNumber1 + intNumber2 + intNumber3;
        if (Total == not_in_order)
        	 System.out.println("You win $1,000");
        if (Total == exact_order)
        	 System.out.println("You win $10,000");
        if (Total == 10)
        	 System.out.println(" You only got one match, You get $10");
        else if (Total ==11)
        	 System.out.println(" You only got one match, You get $10");
        if (Total == 20)
        	 System.out.println(" You only got two match, You get $100");
        else if (Total == 22)
        	 System.out.println(" You only got two match, You get $100");
        else if (Total < 10)
        	 System.out.println("You did not get any right, You get $0");
    }

}
//Hi
