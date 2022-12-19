//Program to take input from user and add two number and print output in this formats:
//  Sum =....+....=......
//  ....+....=....
import java.util.*;
class  Q4
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a and b:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Sum ="+a+"+"+b+"="+c);
        System.out.println(a+"+"+b+"="+c);
    }

}
