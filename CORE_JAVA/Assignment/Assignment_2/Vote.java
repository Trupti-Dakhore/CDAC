import java.io.*;
import java.util.*;
class Vote
{
  public static void main (String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Emter age:");
    int age = sc.nextInt();
    if(age<18)
    {
        System.out.println("Note eligible for vote ");
    }
    else if(age>=18)
    {
        System.out.println("you are eligible for weight");
    }
    else
    {
        System.out.println("invalid age");
    }
  }
}