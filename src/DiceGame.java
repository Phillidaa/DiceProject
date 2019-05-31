
public class DiceGame implements IDiceGame {
	private IDice dice1 = null;
	private IDice dice2 = null;
	private int point = 0;
	private int round = 0;
	private int total = 0; // declare total variable to store total from dice1 and dice2//

// Constructor that takes the two inputs from dice1 and dice2//
	public DiceGame(IDice dice1, IDice dice2) {
		this.dice1 = dice1;
		this.dice2 = dice2;
	}

//Play function -  rolls the dice till the player either loses or wins the game//
	public void play() {
		while (true) {
// Incrementer to continue playing next rounds//			
			round++;
			total = dice1.roll() + dice2.roll();
// total from two dice, round being played//		
			int result = GetResult(total, round);
// result of 1 is for win, -1 for Lose, then end the game else continue the next round//		
			if (result == 1 || result == -1)
				break;
		}
	}

// Win message if the total is 7 or 11 in round 1//
	public int GetResult(int total, int round) {
		if ((total == 7 || total == 11) && round == 1) {
			System.out.println("You rolled " + total + " the first time");
			System.out.println("Congratulations!You win!");
			return 1;

// Lose message if the total is 2 or 3 or 12 in round 1//					
		} else if ((total == 2 || total == 3 || total == 12) && round == 1) {
			System.out.println("You rolled a " + total + " the first time");
			System.out.println("You lose!");
			return -1;

// Lose message if the total is 7 in round >1//				
		} else if (round > 1 && total == 7) {
			System.out.println("Since you rolled a " + total + " in your successive attempts");
			System.out.println("You lose!");
			return -1;
// If the number in the next roll matched the point// 			
		} else if (point == total) {
			System.out.println("You rolled a " + total + ". Your POINT value is also " + point);
			System.out.println("You Win!");
			return 1;
// Message to capture the point value if the player did not win or lose in round 1//			
		} else if (round == 1) {
			point = total;
			System.out.println("You rolled " + total + ". Your POINT value is fixed as " + point);
			return 0;
// Message to capture the number rolled in rounds>1, if the total != point value// 			
		} else {
			System.out.println("You rolled " + total + ". But your POINT value is " + point);
			return 0;
		}

	}

}