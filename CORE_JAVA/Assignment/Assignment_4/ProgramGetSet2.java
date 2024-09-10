import java.util.Scanner;
class CompoundInterestCalculator
{
	private double initialAmt;
	private double annualInterest;
	private double noOfCompound;
	private int years;
	private double futureValue;
	private double totalInterest;

	   public double getsetinitialAmt(){
			return initialAmt;
		}
		public void setinitialAmt(Double initialAmt){
			this.initialAmt= initialAmt;
		}
		public double getannualInterest(){
			return annualInterest;
		}
		public void setannualInterest(Double annualInterest){
			this.annualInterest= annualInterest;
		}
		public double getnoOfCompound(){
			return noOfCompound;
		}
		public void setnoOfCompound(double noOfCompound){
			this.noOfCompound=noOfCompound;
		}
		public int getyears(){
			return  years;
		}
		public void setyears(int years){
			this. years=   years;
		}
		public void acceptRecord() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Initial Investment Ammount:");
		setinitialAmt(sc.nextDouble());
		System.out.println("Annual Interest Rate:");
		setannualInterest(sc.nextDouble());
		System.out.println("Number of time interest compounded:");
		setnoOfCompound(sc.nextDouble());
		System.out.println("Enter year:");
		setyears(sc.nextInt());
		}
	public void calculateFutureValue() {
		 futureValue= getsetinitialAmt() *Math.pow ((1 +  getannualInterest() /  getnoOfCompound()),( getnoOfCompound() * getyears()));   
		 totalInterest= futureValue -  getsetinitialAmt();
	}
	public void printRecord() {
		System.out.println("Future Value of investment:"+futureValue);
		System.out.println("Total Interest Earned:"+totalInterest);
	}
	}
public class ProgramGetSet2 {
public static void main(String[] args) {
		CompoundInterestCalculator c1=new CompoundInterestCalculator();
		c1.acceptRecord();
		c1.calculateFutureValue();
		c1.printRecord();
}
}
