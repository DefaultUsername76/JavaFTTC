
public class Card {

	public static void main(String[] args) {
		int myValue;
		final int CARDS_IN_SUIT = 13;
		myValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);	
		Clubs();
		Diamonds();
		System.out.println(Clubs() + "" + myValue);
		myValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
		System.out.println(Diamonds() + "" + myValue);
		myValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
		System.out.println(Spades() + "" + myValue);
		myValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
		System.out.println(Hearts() + "" + myValue); 
		
		
	}
	public static char Clubs() {
		char cardClubs = 'C';
		return cardClubs;
	}
	public static char Diamonds() {
		char cardDiamonds = 'D';
		return cardDiamonds;
	}
	public static char Spades() {
		char cardSpades = 'S';
		return cardSpades;
	}
	public static char Hearts() {
		char cardHearts = 'H';
		return cardHearts;
	}
	

}
