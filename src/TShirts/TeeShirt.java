package TShirts;

public class TeeShirt {

	private int ordNum;
	private String size;
	private String color;
	private double price;

	public int getOrdNum() {
		return ordNum;
	}

	public void setOrdNum(int ordNum) {
		this.ordNum = ordNum;
	}

	public String getSize() {

		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

//to set a calculation to get the price of t-shirts
	public double getPrice() {

		if (size == "M") {
			price = 10.99;
		} else if (size == "L") {
			price = 12.99;
		} else if (size == "XL") {
			price = 15.99;
		} else if (size == "XXL") {
			price = 20.99;
		}

		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
