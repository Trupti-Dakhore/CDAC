package Assignment_2;

import java.util.Scanner;

class Program1{
	public static void main(String[] args) {
		//int n = 3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) 
		  {
			for (int j = 1; j <= i; j++) 
			 {
				System.out.print("*");
				if (j < i) 
				{
					System.out.print("");
				}
			}
			System.out.println();
		}
	}
}
/*
Enter number:3    
*
**
***

Enter number:5
*
**
***
****
*****
*/
