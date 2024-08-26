 class WhileLoopBreak {
 public static void main(String[] args) {
 int count = 0;
 while (count < 5) {
 System.out.print(count + " ");
 count++;
 if (count == 3) 
	 break;
 }
 System.out.println(count);
 }
}
/*
count = 0
count
0      0
1      1
2      2
3      
4
5=5   (loop terminates)
	   3 
output:-0 1 2 3	   
*/