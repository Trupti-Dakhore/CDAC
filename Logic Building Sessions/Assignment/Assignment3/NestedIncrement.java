class NestedIncrement {
 public static void main(String[] args) {
 int a = 10;
 int b = 5;
 int result = ++a * b-- - --a + b++;
 System.out.println(result);
 }
} 
/*
a = 10;b = 5;
++a=11(pre increment the value and then value of a updates to 11)
b--=5(value of b is initially 5, post decrement it get updates to 4)
--a=10(pre decrement the value of a is 10 )
b++=5(the value of b is initially 4 then post increment to 5)
Output:-
11+5-10+4=49.
*/