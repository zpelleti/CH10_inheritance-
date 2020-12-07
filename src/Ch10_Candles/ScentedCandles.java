package Ch10_Candles;

public class ScentedCandles extends Candle {

	private String scent;

	public String getScent() {
		return scent;
	}

	public void setScent(String scent) {
		this.scent = scent;
	}

	@Override // to override : change visibility of both fields
				// to PROTECTED
	public void setPrice(int height) {
		this.price = this.height * 3;

	}
}
