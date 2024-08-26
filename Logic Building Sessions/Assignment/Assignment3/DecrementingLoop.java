 class DecrementingLoop {
 public static void main(String[] args) {
 int total = 0;
 System.out.println("total "+total);
 for (int i = 5; i > 0; i--) 
     {
	 //System.out.print("i "+i);
     total += i;
     //System.out.println("total "+total);
        if (i == 3) 
		{
	      //System.out.println("inif"+i);
          continue;
        }
     total -= 1;
     //System.out.println("total "+total);
     }
 //System.out.println("total "+total);
 }
} 
/*
 i   total
      0   
 5	  5   5-1=4 
 4    8   8-1=7
 3    10  
 3     
 2  10+2=12 12-1=11
 1  11+1=12 12-1=11
 0  
total initialize with 0 and i is 5.when i=5 operation is perform as total=total+i then the value of total is 5. 
When i is 4, subtract 1 from total, now the value of total is 4 total=total+i=8 now the value of total=8
now the value of i is 3 the continue statement is excuted and skip that loop and total is 10(7+3)
i=2 and total=total+i 10+2=12 then 12-1=11 now the value of total is 11
i=1 total=12 and for other condition 12-1=11.
output=11.


 
*/
