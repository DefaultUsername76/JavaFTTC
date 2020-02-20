import java.util.Scanner;
public class JobPricing {

	public static void main(String[] args) {
		int hours, travelTime, materials;
		System.out.println("How many hours is the job?");
		Scanner val = new Scanner(System.in);
		hours = val.nextInt() * 35;
		System.out.println("Travel time in hours?");
		travelTime = travel() * val.nextInt();
		materials = mats();
		System.out.println("For a " + hours +" dollar construction job, with a price for travel time at " + travelTime + " hours, and " + materials + " for materials.");
		int total = travelTime + hours + materials;
		System.out.println("Your total is $" + total);
		
		

	}

	public static int mats() {
		final int materials = 75;
		return materials;
	}
	public static int travel() {
		final int travelTime = 12;
		return travelTime;
	}
	/*
	 * public static int CalculateHours(int hours) { Scanner val = new
	 * Scanner(System.in); hours = 35 * val.nextInt(); return hours; }
	 */
}
