package Pizzas;

public class PizzaDemo {

	public static void main(String[] args) {

		Pizza p1 = new Pizza("Cheese", 12.99);
		Pizza p2 = new Pizza("Vegetarian", 20.99);
		
		Delivery d1 = new Delivery("Meat lovers", 15.99, "22 Acacia ave");
		Delivery d2 = new Delivery("BillyJean", 12.99, "123 PatMyLove");
		
		p1.display();
		p2.display();
		d1.display();
		d2.display();
		
	}

}
