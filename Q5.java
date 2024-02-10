//Program to input age of a person and if age is 18 or more ,then print you are adult otherwise print you are minor.

import java.util.*;
public class Q5 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of person:");
        int a=sc.nextInt();
        if(a>=18)
         System.out.println("You are Adult");
        else
         System.out.println("You are Minor");
    }
    
}
