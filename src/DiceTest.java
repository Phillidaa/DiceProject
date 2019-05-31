import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DiceTest {

	@Test
	public void Roll_ShouldReturnCorrectValue() {
		Dice d = new Dice();
		int result = d.roll();
		assertTrue(result >= 1 && result <= 6);
	}
}
