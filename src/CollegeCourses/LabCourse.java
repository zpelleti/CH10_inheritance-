package CollegeCourses;

public class LabCourse extends CollegeCourse {

	/**
	 * subclass adds $50 to the fee if class is a lab . override display method if
	 * course is lab, and display new data
	 * 
	 */

	// if not entering the fields from parent class, change them to 'protected'
	// instead of 'private'.

	// Constructor with super method to call parent constructor :

	public LabCourse(String dept, int num, int cred) {
		super(dept, num, cred);
		this.dept = dept;
		this.num = num;
		this.cred = cred;
		this.fee = 120 * cred + 50;
	}

	// then, override display method with new fee calculation :
	@Override
	public void display() {
		System.out.println("Department: " + dept);
		System.out.println("Course number: " + num);
		System.out.println("Credit score: " + cred);
		System.out.println("Fee: $" + fee);
		System.out.println("Summary: \n" + "The course " + dept + " " + String.valueOf(num) + " worth " + cred
				+ " credits " + "The full costs - including lab fees - will be: $ " + fee);

	}

}
