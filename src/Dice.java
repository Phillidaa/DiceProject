
public class Dice implements IDice {
// roll function that generates random number between 1 and 6//	
	public int roll() {
		int rollValue = 1 + (int) (Math.random() * 6);
		if (rollValue >= 1 && rollValue <= 6)
			return rollValue;
		return rollValue;
	}

}
