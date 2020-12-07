package Ch10_Exercise1_Horse;

public class DemoHorses {

	public static void main(String[] args) {

		Horse horse1 = new Horse();

		horse1.setName("Harry");
		horse1.setColor("Brown");
		horse1.setYob(1998);
		// IMPORTANT: parent hasn't got access to child
		// child has access to parent :
		// horse1.setNumRaces(2);

		RaceHorse horse2 = new RaceHorse();

		horse2.setName("Brian");
		horse2.setColor("Spotted");
		horse2.setYob(2009);

		horse2.setNumRaces(10);

		System.out.println(
				horse1.getName() + " is of color " + horse1.getColor() + " and was born on the " + horse1.getYob());
		System.out.println();

		System.out.println((horse2.getName() + " is of color " + horse2.getColor() + " and was born on the "
				+ horse2.getYob() + " and has been in " + horse2.getNumRaces() + " races "));
	}

}
