package a.b.c;

import java.util.Scanner;

public class Palindrom {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter number:");
	int n1 = sc.nextInt();
	int r = n1;
	int rem,res=0;
	while(n1>0) {
		rem = n1%10;
		res=res*10+rem;
		n1=n1/10;
	}
	if(r==res) {
		System.out.println("Palindrom");
	}
	else {
		System.out.println("not palindrom");
	}
}
}
