
package Assignment_2;

import java.util.Scanner;

class Program9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = sc.nextLine();
        //str1 = str1.toLowerCase();
        String str2 = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            str2 += str1.charAt(i);//the charAt method is used to access individual characters of the string.
        }
        boolean isPalindrome = str1.equals(str2);
        System.out.println(isPalindrome);
        sc.close();
    }
}
/*
Enter a string: madam
true
 
Enter a string: heelo
false
*/
