import java.io.*;
import java.util.*;

class Leap_year_IfSw{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the year= ");
       int day=sc.nextInt();
       int ch=0;
       if((day%4==0  && day%100==0) || (day%400==0))
        {
          ch=0;
        }
        else 
         {
           ch=1;  
         } 
             switch(ch){
                case 0:
                    System.out.println(day+" is a leap year");
                    break;
                    case 1:
                         System.out.println(day+" is not a leap year");
                        break;
                        default:
                             System.out.println("invalid year");

             }
       }

    }