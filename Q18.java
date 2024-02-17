//Program which enter any integer then check and print whether it is odd no. or even no.

import java.util.*;
public class Q18 
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter integer number:");
        int num=sc.nextInt();
        if(num%2==0)
        System.out.println("Even Number");
        else
        System.out.println("Odd Number");
        
    }
}
