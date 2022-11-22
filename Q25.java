/* program which enter marks in three Subject of a student and calculate its average, independent 
on the average check and print the division according to following rule -
        Avg division
        60+ first
        45 -< 60 second
        33 -<45 third
        <33 fail. */
        
import java.util.*;
public class Q25
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter three subject marks:");
        System.out.print("1st subject mark:");
        int a=sc.nextInt();
        System.out.print("2nd subject mark:");
        int b=sc.nextInt();
        System.out.print("3rd subject mark:");
        int c=sc.nextInt();
        double avrg=(a+b+c)/3;
        System.out.println("Average ="+avrg);
        if(avrg>=60)
        System.out.println("First Divison");
        else if(avrg>=45 && avrg<60)
        System.out.println("Second Division");
        else if(avrg>=33 && avrg<45)
        System.out.println("Third Division");
        else
        System.out.println("Fail");
        
    }
    
}
