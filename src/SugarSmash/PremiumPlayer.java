package SugarSmash;

public class PremiumPlayer extends Player {

	private boolean accessLevel;
	private int[] scores = new int[40];

	// Constructor sets pay value needed to accessLevel
	public PremiumPlayer(double pay) {
		if (pay >= 2.99) {
			accessLevel = true;
		} else {
			accessLevel = false;
		}
	}

	// setScore method: checks if player has accessLevel based on scores:
	public void setScore(int score, int level) {
		if (accessLevel) {
			if (level < 0 || level > scores.length) {
				System.out.println("Invalid Level");
			} else {
				scores[level] = score;
			}

		} else {
			System.out.println("Pay 2.99 to access the orther 40 levels!");
		}
	}

	public int getScore(int level) {
		if (level >= 0 && level < scores.length) {
			return scores[level];
		} else {
			System.out.println("Invalid Level");
			return -1;
		}
	}

}
