class CalculateSum{
public static void main(String[] args)
   {
	 int sum=0;
	 int num=9876;
     for(int i=0;i<=num;i++) 
	 {
		 int count=num%10;
		 sum=sum+count;
		 num=num/10;
	 }	
	 System.out.println(sum);
   }
}
/*Output:
30
*/