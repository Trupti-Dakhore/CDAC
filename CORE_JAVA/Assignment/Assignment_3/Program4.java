import java.util.Scanner;

class DiscountCalculation 
{
	private double originalPrice;
	private double discount;
	private double discountAmount;
	private double finalPrice;
	Scanner sc=new Scanner(System.in);
	public void acceptRecord() {
		System.out.println("originalPrice=");
		originalPrice=sc.nextDouble();
		System.out.println("discount=");
		discount=sc.nextDouble();
}
	public void calculate() {
		 discountAmount = originalPrice * (discount / 100); 
		 finalPrice = originalPrice - discount;
		
	}
	public void printRecord() {
		System.out.println("Discount Amount="+discountAmount);
		System.out.println("finalPrice="+ finalPrice );
	}
	
}
public class Program4 {
public static void main(String[] args) {
		DiscountCalculation  c1=new DiscountCalculation ();
		c1.acceptRecord();
		c1.calculate();
		c1.printRecord();
}
}
