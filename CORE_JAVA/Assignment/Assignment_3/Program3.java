
import java.util.Scanner;

class BMITracker
{   
    double weight;
	double height;
	double BMI;
	Scanner sc=new Scanner(System.in);
	public void acceptRecord() {
		System.out.println("weight in kilograms");
		 weight=sc.nextDouble();
		System.out.println("Height in meter");
		 height=sc.nextDouble();
	}
	public void calculateBmi() {
		BMI=weight/(height*height);
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
public class Program3 {
public static void main(String[] args) {
		BMITracker b1=new BMITracker();
		b1.acceptRecord();
		b1.calculateBmi();
		b1.classifyBmi();
		b1.printRecord();
}
}
