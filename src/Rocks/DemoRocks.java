package Rocks;

public class DemoRocks {

	public static void main(String[] args) {

		String type = null;

		IgneousRock r1 = new IgneousRock(2, 20.35);
		r1.setType("magmatic rock");
		System.out.println(r1.toString());
		System.out.println();
		SedimentaryRock r2 = new SedimentaryRock(5, 13.20);
		r2.setType("mineral rock");
		System.out.println(r2.toString());
		System.out.println();
		MetamorphicRock r3 = new MetamorphicRock(3, 10.09);
		r3.setType("substantially changed rock");
		System.out.println(r3.toString());
		
	}

}
