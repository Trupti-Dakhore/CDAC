package a.b.c;
import java.util.*;
class Prime {
	public static void main(String[] args) {
		int n;
		boolean isPrime = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number=");
		n = sc.nextInt();
		if (n <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				} else {
					isPrime = true;
				}
			}
		}
		if (isPrime) {
			System.out.println("number is prime");
		} else {
			System.out.println("number is not prime");
		}
	}

}
