package a.b.c;
import java.util.Scanner;
class Fibonnaci {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Number:");
        int count = sc.nextInt();
		int i = 0;
//    for(int i = 2; i<count; i++) {
		while (i < count) {
           System.out.print(n3);
			n3 = n1 + n2;
            n1 = n2;
			n2 = n3;
			i++;
        }
	}
}
/*
 class Recusion5{
  static int fib(int n){
    if(n<=1){
	 return n;
	}
     return fib(n-1)+ fib(n-2);  //f(n) = f(n-1)+f(n-2)
  }

public static void main(String[] args){
   int num = 40;
   for(int i = 1;i<=num;i++){
	   System.out.print(fib(i)+" ");
   }
   }
} */
