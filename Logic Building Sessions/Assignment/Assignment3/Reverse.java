class Reverse
{
public static void main(String[] args)
  {
    int n=1234,r=0,b;
    while(n!=0)
	{
	 b=n%10;
     r = r * 10 + b;
     n/=10;	 
	}
	System.out.println("Reversed Number: " + r);
  }
}
/*Reversed Number: 4321
*/