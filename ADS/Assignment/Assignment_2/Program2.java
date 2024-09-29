package Assignment_2;
import java.util.Scanner;
class Program2 {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.print("Enter the elements:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int l=1;
		for(int i=1;i<n;i++) {
			if(a[i]!=a[i-1]) {
				a[l]=a[i];
				l++;
			}
		}
		System.out.println("new Elements:"+l);
		System.out.print("elements After removing duplicates:");
			for(int i = 0;i<l;i++) {
				System.out.print(a[i]+ " ");
			}
}
    }
/*
Enter the number of elements:8
Enter the elements:1  1 2 2 3  4 4 5
new Elements:5
elements After removing duplicates:1 2 3 4 5 
 */

