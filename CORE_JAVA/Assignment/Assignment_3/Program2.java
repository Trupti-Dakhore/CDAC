import java.util.Scanner;

class CompoundInterestCalculator
{
	private double initialAmt;
	private double annualInterest;
	private double noOfCompound;
	private int years;
	private double futureValue;
	private double totalInterest;
	Scanner sc=new Scanner(System.in);
	public void acceptRecord() {
		System.out.println("Initial Investment Ammount:");
		initialAmt=sc.nextDouble();
		System.out.println("Annual Interest Rate:");
		annualInterest=sc.nextDouble();
		System.out.println("Number of time interest compounded:");
		noOfCompound=sc.nextDouble();
		System.out.println("Enter year:");
		years=sc.nextInt();
		
	}
	public void calculateFutureValue() {
		 futureValue= initialAmt *Math.pow ((1 + annualInterest / noOfCompound),(noOfCompound * years));   
		 totalInterest=futureValue-initialAmt;
		
	}
	public void printRecord() {
		System.out.println("Future Value of investment:"+futureValue);
		System.out.println("Total Interest Earned:"+totalInterest);
	}
	
}


public class Program2 {
public static void main(String[] args) {
		CompoundInterestCalculator c1=new CompoundInterestCalculator();
		c1.acceptRecord();
		c1.calculateFutureValue();
		c1.printRecord();
}
}
