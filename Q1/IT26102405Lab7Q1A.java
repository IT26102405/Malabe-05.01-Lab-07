import java.util.Scanner;
public class IT26102405Lab7Q1A {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		String overallGrade;
		double total, average, inputMark;
		total = 0;
		
		System.out.println("Enter marks for four subjects:");
		
		int count;
		for (count = 1; count <= 4; count++) {
			System.out.print("Enter Subject Mark " + count + ": ");
			inputMark = input.nextDouble();
			
			while ((inputMark < 0)||(inputMark > 100)) {
				System.out.println("Invalid Mark. Please enter again.");
				System.out.print("Enter Subject Mark " + count + ": ");
				inputMark = input.nextDouble();
			}
			
			total = total + inputMark;
			
		}
		
		System.out.println();
		
		average = total / 4.0;
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
	
	}

}