package a.b.c;
import java.util.Scanner;
public class Armstrong {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number:");
	int num =sc.nextInt();
	int a=num;
	int sumOfCube = 0;
	int reminder;
    while(num>=1) {
    	reminder=num%10;
    	//System.out.println(reminder);
    	sumOfCube = sumOfCube+(reminder*reminder*reminder);
    	//System.out.println(sumOfCube);
    	num=num/10;
    	//System.out.println(num);
    	}
    if(sumOfCube==a) 
    	System.out.println(a+" is Armstrong number");
    else
    	System.out.println(a+" is not Armstrong number");
}
}
