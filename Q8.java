//Program to enter two integers numbers and then calulate and print sum and its average.  
import java.util.*;
class Q8
{
    public static void main(String args[])
    {
        int a,b;
        float avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two integer value:"); 
        a=sc.nextInt();
        b=sc.nextInt();
        int sum=a+b;
        avg=sum/2;
        System.out.println("Sum of the number "+a+" and "+b+" is :"+sum);
        System.out.println("Average of number "+a+" and "+b+" is :"+avg);
    }
    
}
