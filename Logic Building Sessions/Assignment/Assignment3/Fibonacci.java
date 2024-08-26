class Fibonacci
{
public static void main(String[] args)
  {
    int f1=0,f2=1;
	System.out.println("Fibonacci series upto number 21=");
	for(int i=1;i<=21;i++)
	{ 
      int f3=f1+f2;
	  f1=f2;
	  f2=f3;
	  
	  System.out.print(" "+f3);
	}
	
  }
  
}
/*
Fibonacci series upto number 21=
1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711
*/