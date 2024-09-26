package a.b.c;
import java.util.Scanner;
public class Gcd {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter two number:");
     int a = sc.nextInt();
     int b = sc.nextInt();
     int greatest = 0;
     System.out.print("All common factors are : ");
     for(int i=1;i<=a;i++) {
    	 if(a%i==0 && b%i==0) {
    		  greatest = i;
    		  System.out.print("\t"+i);
    	 }
     }System.out.println("\nGCD of "+a+" and "+b+ " is : "+greatest);
}
}
