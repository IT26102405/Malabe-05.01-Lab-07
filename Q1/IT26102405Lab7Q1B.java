import java.util.Scanner;
public class IT26102405Lab7Q1B {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		String overallGrade;
		int mark1, mark2, mark3, mark4;
		double average;
		
		
		int count;
		for (count = 1; count <= 3; count++) {
			System.out.println("Student " + count);
			
			System.out.print("Enter Marks : ");
			mark1 = input.nextInt();
			mark2 = input.nextInt();
			mark3 = input.nextInt();
			mark4 = input.nextInt();
			
			
			System.out.println();
		
			average = (mark1 + mark2 + mark3 + mark4) / 4.0;
			System.out.println("Average is : " + average);
		
			if (average >= 75) {
				overallGrade = "Distinction";
			}
			else if (average < 50) {
				overallGrade = "Fail";
			}
			else {
				overallGrade = "Credit";
			}
		
			System.out.println("Overall grade is : " + overallGrade);
			System.out.println();
			
		}
		
		
	
	}

}