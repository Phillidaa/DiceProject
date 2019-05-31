import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class DiceGameTest {

	@Test
	public void gettestresult() {

		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		DiceGame dg = new DiceGame(dice1, dice2);
		assertTrue(dg.GetResult(7, 1) == 1);

	}

	@Test
	public void gettestresult1() {
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		DiceGame dg = new DiceGame(dice1, dice2);
		assertTrue(dg.GetResult(11, 1) == 1);
	}

	@Test
	public void gettestresult2() {
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		DiceGame dg = new DiceGame(dice1, dice2);
		assertTrue(dg.GetResult(12, 1) == -1);

	}

	@Test
	public void gettestresult3() {
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		DiceGame dg = new DiceGame(dice1, dice2);
		assertTrue(dg.GetResult(2, 1) == -1);
	}

	@Test
	public void gettestresult4() {
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		DiceGame dg = new DiceGame(dice1, dice2);
		assertTrue(dg.GetResult(3, 1) == -1);
	}

	@Test
	public void gettestresult5() {
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		DiceGame dg = new DiceGame(dice1, dice2);
		assertTrue(dg.GetResult(7, 1) == 1);
	}

	@Test
	public void gettestresult6() {
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		DiceGame dg = new DiceGame(dice1, dice2);
		assertTrue(dg.GetResult(7, 2) == -1);
	}

}