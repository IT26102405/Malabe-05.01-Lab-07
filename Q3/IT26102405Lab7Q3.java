import java.util.Scanner;
public class IT26102405Lab7Q3 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		final double DISCOUNT = 0.05;
		final int customerCount = 5;
		
		int count;
		for (count = 1; count <= customerCount; count++) {
			System.out.println("Customer " + count);
			System.out.print("Enter total bill amount: ");
			double billAmt = input.nextDouble();
			
			System.out.print("Enter mode of payment (C for cash, O for other): ");
			char paymentMode = input.next().charAt(0);
			
			if ((paymentMode == 'C')||(paymentMode == 'c')) {
				System.out.println("Discount is : " + DISCOUNT*billAmt);
				System.out.println("Amount to be paid: " + billAmt*(1-DISCOUNT));
			}
			else if ((paymentMode == 'O')||(paymentMode == 'o')) {
				System.out.println("No discount applicable");
				System.out.println("Amount to be paid: " + billAmt);
			}
			else {
				System.out.println("Payment Mode is Not Valid");
			}
			
			System.out.println();
			
		}
	
	}

}