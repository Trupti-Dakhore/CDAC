import java.io.*;
import java.util.*;

class Leap_year{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the year= ");
       int day=sc.nextInt();
       if(day%4==0) 
        {
          System.out.println("Leap year");
        }
            else if(day%100==0)
           {
             System.out.println("not a leap year");
           } 
             else if(day%400==0)
             {
                System.out.println("leap year");
             }
              else
                {
                 System.out.println("not leap year");
                }
       }

    }