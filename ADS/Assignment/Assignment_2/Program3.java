package Assignment_2;

import java.util.Scanner;
class Program3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=sc.nextLine();
		char a[]=str.toCharArray();
		System.out.print("after removing white spaces: ");
		for(char c:a) {
			if((c>='A' && c<='Z') ||(c>='a' && c<='z')) {
				System.out.print(c);
			}
		}
	}
}
/*
 Enter String: 
Hello World I am Rossy Marchant .
after removing white spaces: HelloWorldIamRossyMarchant
*/
