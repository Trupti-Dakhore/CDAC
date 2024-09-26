package a.b.c;

import java.util.*;

class Factorial {
	public static void main(String[] args) {
		int n;
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number	:");
		n = sc.nextInt();
		for(int i = 1; i<=n;i++) {
			fact = fact * i;
			}
		System.out.println("factorial of given number:" +fact);
	}

}

/*
 * class Recursion2{
static int fact(int n)
{
if(n<=1)
return 1;
else 
return n*fact(n-1);
}
public static void main(String[] args){
System.out.println(fact(5));
}
}
 */
