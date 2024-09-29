package Assignment_2;

import java.util.Scanner;

class Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.print("Enter the elements:");
		for(int i=0;i<n;i++) 
		    {
			a[i]=sc.nextInt();
			}
		System.out.println("Reverse of array: ");
		for(int i=a.length-1; i>=0; i--) {
			System.out.print(a[i]+" ");
		}
      }
	}
/*
Enter the number of elements:5
Enter the elements:1 2 3 4 5 
Reverse of array: 
5 4 3 2 1 
*/

