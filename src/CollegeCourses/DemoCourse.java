package CollegeCourses;

import java.util.Scanner;

public class DemoCourse {

	public static void main(String[] args) {

		String labCourses = "BIO CHM CIS PHY";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the course department");
		String dept = sc.nextLine();
		System.out.println("Please enter course number: ");
		int num = sc.nextInt();
		System.out.println("PLease enter the number of credits: ");
		int cred = sc.nextInt();
		
		if(labCourses.indexOf(dept.toUpperCase()) >= 0) {
			LabCourse course = new LabCourse(dept, num, cred);
			course.display();
		}
		else {
			CollegeCourse course = new CollegeCourse(dept, num, cred);
			course.display();
		}
	}

}
