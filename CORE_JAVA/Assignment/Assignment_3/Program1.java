/*Implement a system to calculate and display the monthly payments for a mortgage loan.*/

import java.util.Scanner;

class LoanAmortizationCalculator{
        double principalAmt;
        double interest;
        int loanTerm;
        Scanner sc = new Scanner(System.in);
		private double month_interest;
		private int numberMonth;
		private double monthlyPayment;
        
		public void acceptRecord() {
		 System.out.println("Enter principal amount:");
		 this.principalAmt=sc.nextDouble();
		 System.out.println("Enter Annal Interest:");
		 this.interest=sc.nextDouble();
		 System.out.println("Enter Loan Term(In year)");
		 this.loanTerm=sc.nextInt();
		}

		public void calculateMonthlyPayment() {
			month_interest=(interest/100)/12;
			numberMonth=loanTerm*12;
			
		    monthlyPayment = principalAmt *  (month_interest * Math.pow(1 + month_interest, numberMonth)) / 
		            (Math.pow(1 + month_interest, numberMonth) - 1);
			
		}

		public void printRecord() {
			double totalPayment=monthlyPayment*numberMonth;
			
			System.out.printf("Monthly Payment:%.2f",monthlyPayment);
			System.out.printf("\nTotal amount paid over the life of the loan:%.2f",totalPayment);
			
		}
}
public class Program1 {
	public static void main(String[] args) {
		
		LoanAmortizationCalculator L1 = new LoanAmortizationCalculator();
		L1.acceptRecord();
		L1.calculateMonthlyPayment();
		L1.printRecord();
		
		
	}

}
