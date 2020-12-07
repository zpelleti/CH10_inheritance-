package Poems;

public class DemoPoems {

	public static void main(String[] args) {

		Poem poem1 = new Poem("The Poo", 84);
		Couplet poem2 = new Couplet("Mrs Billy Jean");
		Limerick poem3 = new Limerick("Patmylove");
		Haiku poem4 = new Haiku("Le Wrah");
		
		display(poem1);
		display(poem2);
		display(poem3);
		display(poem4);

		
		
	}
	
	public static void display(Poem poem) {
		System.out.println("Poem: " + poem.getTitle() + "\tLines: " + poem.getNumLines());
	}

}
