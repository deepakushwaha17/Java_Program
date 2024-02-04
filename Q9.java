//Program to enter marks in three subjects of a student and calculate its average if the average is 33 or more than print pass otherwise print fail .

import java.util.*;
public class Q9 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three subject marks:");
        System.out.print("1st subject mark:");
        int a=sc.nextInt();
        System.out.print("2nd subject mark:");
        int b=sc.nextInt();
        System.out.print("3rd subject mark:");
        int c=sc.nextInt();
        double average=(a+b+c)/3;
        System.out.println("Average :"+average);
        if(average>=33)
         System.out.println("You are Pass");
         else
          System.out.println("You are fail");
    }
}
