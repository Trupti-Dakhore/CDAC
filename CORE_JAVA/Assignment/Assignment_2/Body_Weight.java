import java.io.*;
import java.util.*;
class Body_Weight 
{
  public static void main (String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Emter weight:");
    int w = sc.nextInt();
    if(w<=35)
    {
        System.out.println("You are in underwight");
    }
    else if((w>=36) && (w<=50))
    {
        System.out.println("you are in normal weight");
    }
    else 
    {
        System.out.println("you are in overweight");
    }
  }
}