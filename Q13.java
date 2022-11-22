/*Program which enter two integers then check and print that how many times 
the first integer can be divided by the second integer and what will be left.*/

import java.util.*;
public class Q13 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two integer number :");
        System.out.print("firt integer:");
        int num1=sc.nextInt();
        System.out.print("second integer:");
        int num2=sc.nextInt();
        int quo,rem;
        quo=num1/num2;
        rem=num1%num2;
        System.out.println("On dividing "+num1+" by "+num2+" the quotient is :"+quo+" and remainder is :"+rem);
    }
    
}
