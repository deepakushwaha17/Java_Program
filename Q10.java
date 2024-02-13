//Program which enter any integer than calculate and print its square.

import java.util.*;
class Q10 
{
    public static void main(String args[])
    {
        int a,sqr;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a integer number:");
        a=sc.nextInt();
        sqr=a*a;
        System.out.println("Square of "+a+" is:"+sqr);
    } 
}
