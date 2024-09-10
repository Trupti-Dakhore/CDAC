import java.util.Scanner;

class TollBoothRevenueManager {
	private int carToll;
	private int truckToll;
	private int motorcycleToll;
	private int noCar;
	private int noTruck;
	private int noMotorcycle;
	private int totalRevenue;
	private int totalVehicles;

	public int getnoCar(){
			return noCar;
		}
		public void setonoCar(int noCare){
			this.noCar=noCar;
		}
		public int  getnoTruck(){
			return noTruck;
		}
		public void  setnoTruck(int noTruck){
			this.noTruck=noTruck;
		}
		public int  getnoMotorcycle(){
			return  noMotorcycle;
		}
		public void  setnoMotorcycle(int noMotorcycle){
			this.noMotorcycle=noMotorcycle;
		}
		public int getcarToll(){
			return carToll;
		}
		public void setcarToll(int carToll){
			this.carToll=carToll;
		}
		public int  gettruckToll(){
			return truckToll;
		}
		public void  settruckToll(int truckToll){
			this.truckToll=truckToll;
		}
		public int  getmotorcycleToll(){
			return  motorcycleToll;
		}
		public void  setmotorcycleToll(int motorcycleToll){
			this.motorcycleToll=motorcycleToll;
		}
          
          Scanner sc=new Scanner(System.in);
	      public void acceptRecord() {
          System.out.println("Enter no. of Cars: ");
          setonoCar(sc.nextInt());
          System.out.println("Enter no. of Truck: ");
          setnoTruck(sc.nextInt());
          System.out.println("Enter no. of Motorcycle: ");
		  setnoMotorcycle(sc.nextInt());
		
	}
	public void setTollRates()
	{
		System.out.println("Enter toll rate for car:	");
		setcarToll(sc.nextInt());
		System.out.println("Enter toll rate for truck:	");
		settruckToll(sc.nextInt());
		System.out.println("Enter toll rate for motorcycle:	");
		setmotorcycleToll(sc.nextInt());
	}
	public void calculateRevenue() {
		totalVehicles=(getnoCar() + getnoTruck() + getmotorcycleToll());
		totalRevenue=((getnoCar()*getcarToll())+(getnoTruck()*gettruckToll())+(getnoMotorcycle()*getmotorcycleToll()));
	}
	public void printRecord(){
		System.out.println("Total number of Vehicles: "+totalVehicles);
		System.out.println("Total Revenues:	"+totalRevenue);
	}
}
public class ProgramGetSet5{
public static void main(String args[])
{
	TollBoothRevenueManager t=new TollBoothRevenueManager();
	t.setTollRates();
	t.acceptRecord();
	t.calculateRevenue();
	t.printRecord();
	}
}