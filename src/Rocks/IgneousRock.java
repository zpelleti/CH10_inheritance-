package Rocks;

public class IgneousRock extends Rock {

	public IgneousRock(int num, double weight) {
		super(num, weight);

		// this.type ="magmatic rock";

	}

	// instead of setting value for type in constructor, create get and set
	// for type only in the subclass, BY CALLING TYPE SUPERCLASS :

	public void setType(String type) {
		super.type = type;
	}

	public String getType() {
		return super.type;
	}

	/*
	 * NO OVERRIDE DISPLAY IN SOLUTION
	 * 
	 * @Override public void display() {
	 * 
	 * System.out.println("Rock number: " + num);
	 * System.out.println("Rock weight: " + weight);
	 * System.out.println("Rock type: " + type);
	 * 
	 * }
	 */

}
