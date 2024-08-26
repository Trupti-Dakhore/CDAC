class LargestDigitInNumber{
public static void main(String[] args)
 {
	 int num=4825;
	 int large=0;
	 for(int i=0;i<=num;i++)
	 {
		 int count=num%10;
		 if(count>large)
		 {
			 large=count;
		 }
		 num=num/10;
		 
		 }
		 System.out.println(large);
 }
}