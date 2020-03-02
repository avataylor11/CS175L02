package februrary;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcMyGPA {

	public static void main(String[] args) {
		
		//calculated by dividing the total amount of grade points earned by the total amount of credit hours attempted
		
		//You must accumulate the credit hours and grade points to use in the GPA calculation at the end
		//After all course have been entered, (course name = End), print the 10 credit hours, total grade points and GPA
		//Try to get it to look like the table below.

		
		Scanner kb = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		String courseInfo;
		
		
		System.out.println("Enter the number of courses you took: ");
		double numCourses = kb.nextDouble();
		
		
		double totalHours = 0;
		double totalPoints = 0;
		for(int i=1; i<=numCourses; i++) {
		
			double gradePoints = 0;
			
			
			System.out.println("Enter course information separated by commas (title,credit hours,letter grade) or type Q to quit");
			courseInfo = kb.next();
			
			if (courseInfo.equals("Q")) {
				System.out.println("You Quit");
				break;
			}
			
			String array1[] = courseInfo.split(",");
			String title = array1[0].trim();
			String credHours = array1[1].trim();
			double numCredHours = Integer.parseInt(credHours);
			String letter = array1[2].trim();
			totalHours += numCredHours;
			
			System.out.println("Course Title: " + title);
			System.out.println("Credit Hours: " + numCredHours);
			System.out.println("Letter Grade: " + letter);
		
			
			if (letter.equals("A")) {
				gradePoints = numCredHours * 4.00;
				totalPoints += gradePoints;
			}
			else if (letter.equals("A-")) {
				gradePoints = numCredHours * 3.70;
				totalPoints += gradePoints;
			}
			else if (letter.equals("B+")) {
				gradePoints = numCredHours * 3.33;
				totalPoints += gradePoints;
			}
			else if (letter.equals("B")) {
				gradePoints = numCredHours * 3.00;
				totalPoints += gradePoints;
			}
			else if (letter.equals("B-")) {
				gradePoints = numCredHours * 2.70;
				totalPoints += gradePoints;
			}
			else if (letter.equals("C+")) {
				gradePoints = numCredHours * 2.30;
				totalPoints += gradePoints;
			}
			else if (letter.equals("C")) {
				gradePoints = numCredHours * 2.00;
				totalPoints += gradePoints;
			}
			else if (letter.equals("C-")) {
				gradePoints = numCredHours * 1.70;
				totalPoints += gradePoints;
			}
			else if (letter.equals("D+")) {
				gradePoints = numCredHours * 1.30;
				totalPoints += gradePoints;
			}
			else if (letter.equals("D")) {
				gradePoints = numCredHours * 1.00;
				totalPoints += gradePoints;
			}
			else if (letter.equals("D-")) {
				gradePoints = numCredHours * 0.70;
				totalPoints += gradePoints;
			}
			else if (letter.equals("WF") || letter.equals("F")) {
				gradePoints = numCredHours * 0;
				totalPoints += gradePoints;
			}
			else {
				gradePoints = 0;
			}
			System.out.println(" ");
			System.out.println("Total Grade Points: " + totalPoints);
			System.out.println("Total Credit Hours: " + totalHours);
			System.out.println("");
			
		}
		double gpa = (totalPoints / totalHours);
		System.out.println("Your GPA is " + df.format(gpa));
		
		
	}

}
