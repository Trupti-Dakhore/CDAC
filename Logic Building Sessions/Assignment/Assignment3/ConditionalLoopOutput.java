class ConditionalLoopOutput {
 public static void main(String[] args) {
 int num = 1;
	 System.out.println("Start : num "+num);
	 for (int i = 1; i <= 4; i++) 
	 {
		 System.out.println("insideFor : i "+i);
			if (i % 2 == 0) 
				{
					System.out.println("insideIf :mod "+i%2) ;
					num += i;

					System.out.println("insideIf :i "+i);System.out.println("insideIf :num "+num);
				} 
				else {
						System.out.println("insideElse :i "+i);System.out.println("insideElse :num"+num);
						num -= i;System.out.println("insideElse post decrement :num"+num);
					}
	 }
	 
	 System.out.println(num);
}
}

/*
(i%2==0) i=1   num          num   output
	      1     1 (num-=i)   0       0
		  2     0 (num+=1)   2       2
          3		2 (num-=i)  -1      -1
          4	   -1 (num-=i)   3       3
 
 Output:-3
		  

*/ 
