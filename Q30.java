// program which enter any integer then check and print, whether it is odd no. or even no. using Conditional operator[? :]

import java.util.*;
public class Q30
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        int num=sc.nextInt();
        /*boolean flag;
        flag=(num%2==0)?true:false;
        if(flag==true)
        System.out.println("Even number");
        else
        System.out.println("Odd number"); */
        String str;
        str=(num%2==0)?"even":"odd";
        System.out.println("Number is "+str);
        
    }
    
}
