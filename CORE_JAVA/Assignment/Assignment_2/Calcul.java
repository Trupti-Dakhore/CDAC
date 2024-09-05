import java.io.*;
import java.util.*;
class Calcul
{
    public static void main(String [] args)
    {   Scanner sc= new Scanner(System.in);
    System.out.println("Enter num 1or 2 or 3 or 4:") ;
        int cal=sc.nextInt();
        int a =3;
        int b=3;
        
        switch(cal){
            case 1:
                cal=a+b;
                System.out.println("Addition is:" +cal);
                break;
            case 2:
                cal=a-b;
                System.out.println("Subtration=" +cal);
                break;
            case 3:
                cal=a*b;
                System.out.println("Multiplication=" +cal);
                break;
            case 4:
                cal=a/b;
                System.out.println("Devision=" +cal);
                break;
            default:
                System.out.println("invalid input");
     }
    }
}