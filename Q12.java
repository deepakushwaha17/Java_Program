//Program which enter any integer than calculate and print its square and cube

import java.util.*;
public class Q12 
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter integer number:");
        int num=sc.nextInt();
        if(num<5)
         System.out.println("Cube of "+num+" is "+(num*num*num));
         else
         System.out.println("Square of "+num+" is "+(num*num));
 

    }
    
}
