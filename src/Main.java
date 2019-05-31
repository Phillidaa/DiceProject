
public class Main {
	public static void main(String[] args) {
		// Create two dice for the game
		IDice dice1 = new Dice();
		IDice dice2 = new Dice();
		// Create the dice game with the two dice
		IDiceGame dg = new DiceGame(dice1, dice2);
		// Play the dicegame
		dg.play();
	}
}
