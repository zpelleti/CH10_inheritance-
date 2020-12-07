package CollegeCourses;

public class CollegeCourse {

	protected String dept;
	protected int num;
	protected int cred;
	protected double fee = 120.00;

	public CollegeCourse(String dept, int num, int cred) {
		this.dept = dept;
		this.num = num;
		this.cred = cred;
		// fee needs to be multiplied by credit, so no need to
		// include it into Constructor fields :
		this.fee = 120 * cred;

	}

	// method to display :
	public void display() {
		System.out.println("Department: " + dept);
		System.out.println("Course number: " + num);
		System.out.println("Credit score: " + cred);
		System.out.println("Fee: " + fee);
		System.out.println("Summary: \n" + "The course " + dept + String.valueOf(num) + "\n worth " + cred + " credits "
				+ "\nThe full costs will be: $ " + fee);

	}
}
