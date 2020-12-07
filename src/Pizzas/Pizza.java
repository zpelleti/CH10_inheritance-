package Pizzas;

public class Pizza {

	private String desc;
	private double price;

	Pizza(String desc, double price) {
		this.desc = desc;
		this.price = price;
	}

	public void display() {
		System.out.println(desc + " : $" + price);

	}
}
