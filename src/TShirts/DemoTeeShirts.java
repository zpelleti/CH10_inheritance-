package TShirts;

public class DemoTeeShirts {

	public static void main(String[] args) {

		TeeShirt tee1 = new TeeShirt();
		TeeShirt tee2 = new TeeShirt();

		CustomTee tee3 = new CustomTee();
		CustomTee tee4 = new CustomTee();

		tee1.setOrdNum(100);
		tee1.setColor("Black");
		tee1.setSize("L");

		tee2.setOrdNum(200);
		tee2.setColor("Brown");
		tee2.setSize("M");

		tee3.setOrdNum(300);
		tee3.setColor("White");
		tee3.setSize("XL");
		tee3.setMess("Billy Jeean");

		tee4.setOrdNum(400);
		tee4.setColor("Grey");
		tee4.setSize("XXL");
		tee4.setMess("Pat My Love");

		display(tee1);
		display(tee2);
		displayCustom(tee3);
		displayCustom(tee4);

	}

	public static void display(TeeShirt tee) {
		System.out.println("Order #: " + tee.getOrdNum());
		System.out.println("Description: " + tee.getColor() + " " + tee.getSize());
		System.out.println("Price : $ " + tee.getPrice());

	}

	public static void displayCustom(CustomTee tee) {
		display(tee);

		System.out.println("Custom message: " + tee.getMess());
	}

}
