package a.b.c;

import java.util.Scanner;

public class LeapYear {
 public static void main(String[] args) {
	int y;
	Scanner sc = new Scanner(System.in); 
	System.out.println("Enter year:");
	y = sc.nextInt();
	if(y%4==0) {
		System.out.println("leap year");
	}
	else if(y%100==0) {
		System.out.println("leap Year");
	}
	else {
		System.out.println("not leap year");
	}
}
}

