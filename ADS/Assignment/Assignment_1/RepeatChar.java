package a.b.c;

import java.util.Scanner;

public class RepeatChar {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 System.out.println("Enter String:");
	 String str = sc.nextLine();
	 char[] char1 = str.toCharArray();
	System.out.println("Duplicate charechters in String are:  ");
	for(int i=0; i<str.length(); i++) {
		for(int j=i+1; j<str.length(); j++) {
			if(char1[i]==char1[j]) {
				System.out.println(char1[j]+ " ");
				break;
			}
		}
	}
	}
}
