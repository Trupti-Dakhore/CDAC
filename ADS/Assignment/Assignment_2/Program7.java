package Assignment_2;

import java.util.Scanner;

class Program7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int reversedNumber = 0;
        int originalNumber = number;

        // Handle negative numbers
        boolean isNegative = number < 0;
        if (isNegative) {
            number = -number;
        }
          while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        if (isNegative) {
            reversedNumber = -reversedNumber;
        }
        System.out.println("Reversed number: " + reversedNumber);
    }
}
/*
Enter a number: 1234567
Reversed number: 7654321

Enter a number: -1234567
Reversed number: -7654321
*/
