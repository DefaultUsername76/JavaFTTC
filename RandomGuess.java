package Chapter1;
public class CarlysMotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog("Guess a number between 1 and 10");
		JOptionPane.showMessageDialog(null, "The number is " + 
				  (1 + (int)(Math.random() * 10)));
	}

}
