package Ch10_Candles;

public class Candle {

	private String color;
	protected int height;
	protected double price;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		
		this.height = height;
	}

	public double getPrice() {
		return price;
	}
	//the price is $2 per inch in height:
	
	public void setPrice(int height) {
		
		this.price = this.height * 2;
		
	}
	
}
