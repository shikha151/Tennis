import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TennisClient {

	public static void main(String[] args) {
		System.out.println("Give the input string");
		try {
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System. in ));
			String s = bufferRead.readLine();
			ScoreBoard scoreboard = new ScoreBoard();



			for (int i = 0; i < s.length(); i++) {
				if (scoreboard.updateScore(s.charAt(i))) {
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
class ScoreBoard {
	String[] scores = {
		"0", "15", "30", "40", "A", "W"
	};
	int p1Index;
	int p2Index;


	public ScoreBoard() {
		this.p1Index = 0;
		this.p2Index = 0;
	}

	public boolean updateScore(char pointWinner) {
		if (pointWinner == 'D') {
			p1Index++;
		} else {
			p2Index++;
		}

		if (gameIsWon()) {
			if (p1Index > p2Index) {
				System.out.println("D wins the game");
				return true;
			} else {
				System.out.println("F wins the game");
				return true;
			}
		} else if (p1Index == 4 && p2Index == 4) {
			p1Index = 3;
			p2Index = 3;
			System.out.println(scores[p1Index] + " : " + scores[p2Index]);
			return false;
		} else {
			System.out.println(scores[p1Index] + " : " + scores[p2Index]);
			return false;
		}


	}

	public boolean gameIsWon() {
		boolean gtThanForty = p1Index > 3 || p2Index > 3;
		boolean diffGtThanOne = Math.abs(p1Index - p2Index) >= 2;

		return gtThanForty && diffGtThanOne;
	}
}
