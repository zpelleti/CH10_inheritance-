package Rocks;

public class MetamorphicRock extends Rock {

	public MetamorphicRock(int num, double weight) {
		super(num, weight);
		// this.type ="substantially changed rock";
	}

	public void setType(String type) {
		super.type = type;
	}

	public String getType() {
		return super.type;
	}

	/*
	 * @Override public void display() { 
	 * 
	 * System.out.println("Rock number: " + num);
	 * System.out.println("Rock weight: " + weight);
	 * System.out.println("Rock type: " + type);
	 * 
	 * }
	 */
}
