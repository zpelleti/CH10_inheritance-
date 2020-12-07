package Ch10_Candles;

public class DemoCandles {

	public static void main(String[] args) {

		Candle candle1 = new Candle();
		
		candle1.setColor("Blue");
		candle1.setHeight(6);
		candle1.setPrice(0);
		
		ScentedCandles scCandle1 = new ScentedCandles();
		
		scCandle1.setColor("Yellow");
		scCandle1.setHeight(6);
		scCandle1.setPrice(0);
		
		System.out.println("Your purchase: ");
		System.out.println("A candle color " + candle1.getColor() 
							+ " size " + candle1.getHeight() + " inches " 
							+ " Price: " + candle1.getPrice());
		System.out.println();
		System.out.println("Your purchase: ");
		System.out.println("A scented candle color " + scCandle1.getColor() 
							+ " size " + scCandle1.getHeight() + " inches " 
							+ " Price: " + scCandle1.getPrice());
	}

}
