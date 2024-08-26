class Pattern14
{
 public static void main(String[] args)
  { 
	 int n=9;
	 for(int i=1;i<=n;i++)
	 {
		if(i%2!=0)
		{
			for(int j=1;j<=i;j++)
			{
			  System.out.print("*");
			  if(j<i)
			  {
				 System.out.print("");
			  }
		    }
	         System.out.println(); 
	    }
    }
 }
}
/*Output:
*
***
*****
*******
*********
*/