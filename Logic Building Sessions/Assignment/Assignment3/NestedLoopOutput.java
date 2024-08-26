 class NestedLoopOutput {
 public static void main(String[] args) {
 for (int i = 1; i <= 3; i++) {
 for (int j = 1; j <= 2; j++) {
 System.out.print(i + " " + j + " ");
 }
 System.out.println();
 }
 }
} 
/*
  i  j  
  1  1  
  1  2 
  2  1
  2  2
  3  1
  3  2
We have an nested for loop outer loop with i variable and inner for with variable j.
When i = 1 the inner loop runs twice for j = 1 and j = 2 Its printing 1 1 and 1 2.
When i = 2 the inner loop again runs twice then its printing 2 1 and 2 2.
When i = 3 the inner loop runs twice, printing 3 1 and 3 2.
Output:D:\Assignment\Day3(22.08)>java NestedLoopOutput
1 1 1 2
2 1 2 2
3 1 3 2
*/
