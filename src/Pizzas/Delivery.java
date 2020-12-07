package Pizzas;

public class Delivery extends Pizza {

	private String address;
	private double fee;

	Delivery(String desc, double price, String address) {
		super(desc, price);
		this.address = address;
		setFee(price);
	}

	public void setFee(double price) {

		if (price > 15.00) {
			fee = 3.00;
		} else
			fee = 5.00;
	}

	public double getFee() {
		return fee;
	}

	@Override
	public void display() {
		super.display();
		System.out.println(" Deliver to: " + address + " extra fee : $" + fee);
	}

}
