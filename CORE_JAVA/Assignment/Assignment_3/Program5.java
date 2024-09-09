import java.util.Scanner;

class TollBoothRevenueManager {
	private int carToll;
	private int truckToll;
	private int motorcycleToll;
	private int noCar;
	private int noTruck;
	private int noMotorcycle;
	private float totalRevenue;
	private int totVehicles;
	Scanner sc=new Scanner(System.in);
	
	public void acceptRecord() {
          System.out.println("Enter no. of Cars: ");
          noCar=sc.nextInt();
          System.out.println("Enter no. of Truck: ");
          noTruck=sc.nextInt();
          System.out.println("Enter no. of Motorcycle: ");
		  noMotorcycle=sc.nextInt();
		
	}
	public void setTollRates()
	{
		System.out.println("Enter toll rate for car:	");
		carToll=sc.nextInt();
		System.out.println("Enter toll rate for truck:	");
		truckToll=sc.nextInt();
		System.out.println("Enter toll rate for motorcycle:	");
		motorcycleToll=sc.nextInt();
	}
	public void calculateRevenue() {
		totVehicles=noCar+noTruck+noMotorcycle;
		totalRevenue=(noCar*carToll)+(noTruck*truckToll)+(noMotorcycle*motorcycleToll);
	}
	public void printRecord(){
		System.out.println("Total number of Vehicles: "+totVehicles);
		System.out.println("Total Revenues:	"+totalRevenue);
	}
}
public class Program5{
public static void main(String args[])
{
	TollBoothRevenueManager t=new TollBoothRevenueManager();
	t.setTollRates();
	t.acceptRecord();
	t.calculateRevenue();
	t.printRecord();
	}
}