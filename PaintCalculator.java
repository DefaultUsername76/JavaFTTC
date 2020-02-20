import java.util.Scanner;
public class PaintCalculator {

	public static void main(String[] args) {
		int length, width, height; 
		int price;
		//int gallons;
		System.out.println("Welcome to the Paint Store!");
		System.out.println("One gallon of paint is $32 >>>");
		System.out.println("What is the length of the wall?");
		Scanner read = new Scanner(System.in);
		length = read.nextInt();
		System.out.println("What is the width of the wall?");
		width = read.nextInt();
		System.out.println("What is the height of the wall?");
		height = read.nextInt();
		price = CalculateArea(length, width, height);
		System.out.println("The cost to paint a " + length + "-by-" + width + "-foot room with "+ height + "-foot ceilings is $"  + price);
		System.out.println("Thank you.");
	}

	public static int CalculateArea(int length, int height, int width) {
		final int PRICE_GALLON = 32;
		int area = length * height * 2 + width * height * 2;
		int gallons;
		int price;
		gallons = computeGallons(area);
		price = gallons * PRICE_GALLON;
		return price;
	}
	
	public static int computeGallons(int area) {
		final int SQFT_PER_GAL = 350;
		int gallons = area / SQFT_PER_GAL;
		return gallons; 
	}
}
