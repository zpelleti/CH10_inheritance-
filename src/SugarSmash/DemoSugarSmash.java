package SugarSmash;

public class DemoSugarSmash {

	public static void main(String[] args) {

		//create first player : 
		Player player1 = new Player();	
		
		System.out.println("First player : ");
		
		player1.setScrName("Mike");
		player1.setID(100);
		//create a score < 100 that will generate "Invalid..":
		player1.setScores(50, 0);
		//set score > 100 level 1 : 
		player1.setScores(120, 1);
		//set score > 100 level 2 : 
		player1.setScores(220, 2);
		
		System.out.println("Name : " + player1.getScrName() 
							+ " \nID  : " + player1.getID()
							+ " \nScore 1: " + player1.getScores(0)
							+ " \nScore 2: " + player1.getScores(1)
							+ " \nScore 3: " + player1.getScores(2));
		
		
		System.out.println();
		System.out.println("Second player : (Premium Account)");
		
		PremiumPlayer player2 = new PremiumPlayer(2.99);
		
		player2.setID(200);
		player2.setScrName("Raffi");
		//first: invalid scores + level combination :
		player2.setScores(15, 0);
		System.out.println("Name : " + player2.getScrName()
						    + "\nID : " + player2.getID()
						    + "\nScore 1: " + player2.getScores(0));
		
		System.out.println();
		System.out.println("Third player : (Premium Account)");
		PremiumPlayer player3 = new PremiumPlayer(2.00);
		player3.setID(300);
		player3.setScrName("POOPY");
		player3.setScore(250, 0);
		player3.setScore(150, 1);
		player3.setScore(25, 2);

		System.out.println("Name : " + player3.getScrName()
	    + "\nID : " + player3.getID()
	    + "\nScore 1: " + player3.getScores(0)
	    + "\nScore 2: " + player3.getScores(1)
	    + "\nScore 3: " + player3.getScores(2));
	}
	
	

	

}
