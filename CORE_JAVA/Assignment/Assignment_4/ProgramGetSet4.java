import java.util.Scanner;

class DiscountCalculation 
{
	private double originalPrice;
	private double discount;
	private double discountAmount;
	private double finalPrice;

	  public double getoriginalPrice(){
			return originalPrice;
		}
		public void setoriginalPrice(Double originalPrice){
			this.originalPrice= originalPrice;
		}
		public double  getdiscount(){
			return  discount;
		}
		public void  setdiscount(Double discount){
			this. discount=discount;
		}
	Scanner sc=new Scanner(System.in);
	public void acceptRecord() {
		System.out.println("originalPrice=");
		setoriginalPrice(sc.nextDouble());
		System.out.println("discount=");
		setdiscount(sc.nextDouble());
}
	public void calculate() {
		 discountAmount =getoriginalPrice() * (getdiscount()/ 100); 
		 finalPrice = getoriginalPrice() - getdiscount();
		
	}
	public void printRecord() {
		System.out.println("Discount Amount="+discountAmount);
		System.out.println("finalPrice="+ finalPrice );
	}
	
}
public class ProgramGetSet4 {
public static void main(String[] args) {
		DiscountCalculation  c1=new DiscountCalculation ();
		c1.acceptRecord();
		c1.calculate();
		c1.printRecord();
}
}
