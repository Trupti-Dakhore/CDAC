class PreIncrementPostDecrement
{
 public static void main(String[] args)
 {
	 int a=7;
	 int b=8;
	 int c= ++a * b--;
	 System.out.println("PreIncrementPostDecrement: "+c);
 }
}
/*Output:
PreIncrementPostDecrement: 64
*/