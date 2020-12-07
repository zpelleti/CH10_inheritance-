package Rocks;

public class Rock {

	protected int num;
	protected String type;
	protected double weight;

	public Rock(int num, double weight) {
		this.num = num;
		this.weight = weight;
		this.type = "Unclassified";

	}

	public int getNum() {
		return num;
	}

	public double getWeight() {
		return weight;
	}

	/*
	 * NO GET AND SET FOR TYPE IN THE SOLUTION
	 * 
	 * public String getType() { return type; }
	 * 
	 * public void setType(String type) { this.type = type; }
	 */

	public String toString() {

		return "The rock sample number " + num + "\nRock weight " + weight + "\nRock type " + type;

	}
}
