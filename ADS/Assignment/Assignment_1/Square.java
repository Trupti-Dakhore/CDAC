package a.b.c;
//import java.util.Scanner;
public class Square {
public static void main(String[] args) {
	//Scanner sc = new Scanner(System.in);
	//System.out.println("Enter number :");
	/*double a = sc.nextDouble();
	double square = Math.sqrt(a);
	System.out.println("the sqaure root of " + a + " is " + square);*/
	int num=25;
	System.out.println(num);
	double temp;
	double sr = num/2;//9/2=4
	do {
		temp = sr;//4
		sr = (temp+(num/temp))/2;//(4+(9/4))/2 = (4+2)/2 = 6/2 = 3
		} while((temp-sr)!=0);
	System.out.println("Square root is: "+sr);
}
}
