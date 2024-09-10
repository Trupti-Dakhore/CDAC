
import java.util.Scanner;
class BMITracker
{   
    double weight;
	double height;
	double BMI;

    public double getweight(){
			return weight;
		}
		public void setweight(Double weight){
			this.weight= weight;
		}
		public double  getheight(){
			return  height;
		}
		public void  setheight(Double  height){
			this. height=  height;
		}
	public void acceptRecord() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Weight:");
		setweight(sc.nextDouble());
		System.out.println("Height:");
		setheight(sc.nextDouble());
	}
	public void calculateBmi() {
		BMI=getweight()/(getheight()*getheight());
		}
	public String classifyBmi() {
		if(BMI<18.5)
			return "Underweight";
		else if(BMI>=18.5 && BMI<=24.9)
			return "Normal Weight";
		else if(BMI>=25 && BMI<=29.9)
			return "Overweight";
		else
			return "You are obese";
		}
	public void printRecord() {
		System.out.println("BMI Value:"+BMI);
		System.out.println("Classification:" + classifyBmi());
		}
    }
public class ProgramGetSet3 {
public static void main(String[] args) {
		BMITracker b1=new BMITracker();
		b1.acceptRecord();
		b1.calculateBmi();
		b1.classifyBmi();
		b1.printRecord();
}
}
