import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class BlackJackExampleTest {
	@Test
	public void exampleTest1() {
		assertEquals(new String[]{"Player 1"},
				CardGame.getBlackJackWinners(
						new String[]{"J", "A"},
						new String[]{"8", "J", "7"},
						new String[]{"2", "4", "K", "10"},
						new String[]{"K", "8"},
						"10", "6", "A", "8", "9", "A", "3", "Q", "5", "2", "3", "8", "6", "J", "K", "2", "8", "7", "7", "K", "Q"));
	}
	@Test
	public void exampleTest2() {
		assertEquals(new String[]{"Player 2", "Player 3"},
				CardGame.getBlackJackWinners(
						new String[]{"J", "2", "K"},
						new String[]{"A", "5", "A", "5", "7"},
						new String[]{"J", "A"},
						new String[]{"2", "Q"},
						"4", "10", "Q", "K", "2", "8", "9", "8", "9", "4", "K", "7", "10", "A", "4", "9", "5", "A", "Q", "Q", "3"));
	}
	@Test
	public void exampleTest3() {
		assertEquals(new String[]{},
				CardGame.getBlackJackWinners(
						new String[]{"6", "A", "2", "Q", "3"},
						new String[]{"5", "8"},
						new String[]{"6", "Q", "2"},
						new String[]{"3", "10"},
						"A", "4", "10", "5", "4", "A", "Q", "2", "6", "A", "5", "7", "9", "Q", "2", "8", "9", "A", "K", "2", "8"));
	}
}