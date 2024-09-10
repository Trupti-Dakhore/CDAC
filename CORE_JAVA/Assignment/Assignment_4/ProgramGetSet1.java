import java.util.Scanner;
class LoanAmortizationCalculator{
        double principalAmt;
        double interest;
        int loanTerm;
		int numberMonth ;
		double month_interest;
          public double getPrincipleAmt(){
			return principalAmt;
		}
		public void setPrincipleAmt(Double principalAmt){
			this.principalAmt= principalAmt;
		}
		public double getinterest(){
			return interest;
		}
		public void setinterest(Double interest){
			this.interest= interest;
		}
		public int getloanTerm(){
			return loanTerm;
		}
		public void setloanTerm(int loanTerm){
			this.loanTerm=  loanTerm;
		}

         public void acceptRecord() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter principal amount:");
		setPrincipleAmt(sc.nextDouble());
		 System.out.println("Enter Annal Interest:");
		setinterest(sc.nextDouble());
		 System.out.println("Enter Loan Term(In year)");
		setloanTerm(sc.nextInt());
		}

		public  double calculateMonthlyPayment() {
			month_interest=getPrincipleAmt()/12/100;
			 numberMonth = getloanTerm()*12;
			return getPrincipleAmt() *(month_interest * Math.pow(1 + month_interest, numberMonth)) / 
		    (Math.pow(1 + month_interest, numberMonth) - 1);
			}

		public void printRecord() {
			double monthlyPayment =  calculateMonthlyPayment();
			double totalPayment=monthlyPayment*numberMonth;
			System.out.printf("Monthly Payment:" +monthlyPayment);
			System.out.printf("\nTotal amount paid over the life of the loan:"+totalPayment);
			}
}

public class ProgramGetSet1 {
	public static void main(String[] args) {
		LoanAmortizationCalculator L1 = new LoanAmortizationCalculator();
		L1.acceptRecord();
		//L1.calculateMonthlyPayment();
		L1.printRecord();
		}
}
