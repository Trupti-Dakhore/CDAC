class IncrementDecrement {
 public static void main(String[] args) {
 int x = 5;	
int y =  ++x - x-- + --x + x++;
 System.out.println(y);
 }
}

/*
x=5;
++x=6; 1st increment the value then print the value
x--=6; 1st print the value then decrement the value(value is printed as 6 and then decrement by 1. now the value x is 5.)
--x=4the value of x is 5 and --x 1st decrement the value by 1  and then print the value as 4
x++=4;1st printing the value then increment by 1
Output:6-6+4+4=8
*/

