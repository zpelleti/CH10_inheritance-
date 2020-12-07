package SugarSmash;

public class Player {

	private int ID;
	private String scrName;
	private int[] scores = new int[10];

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getScrName() {
		return scrName;
	}

	public void setScrName(String scrName) {
		this.scrName = scrName;
	}

	// gets the score from array checks if level is within the range
	// returns level
	public int getScores(int level) {
		if (level >= 0 && level < scores.length) {
			return scores[level];
		} else
			System.out.println("Invalid Level");
		return -1;
	}

	// to set the score at a game level :
	public void setScores(int score, int level) {
		// define a boolean variable:
		boolean validScores = false;

		// set the score at index 0 when level = 0:
		if (level == 0) {
			scores[0] = score;
		} else {
			// checks the user's score, returns true if valid :
			for (int i = 0; i < level && !validScores; i++) {
				if (scores[i] > 100) {
					validScores = true;
				}
			}
		
			// set the score to level of the game
			if (validScores) {
				scores[level] = score;
				
			} else {
				// otherwise, set the score at index 0 + Invalid Score
				scores[0] = score;
				System.out.println("Invalid Score");
			}
		}
	}


}
