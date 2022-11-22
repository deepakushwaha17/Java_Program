//Program which enter any integer than check and print, whether the given integer is a positive no.,negative no. or zero(0)
 
import java.util.*;
public class Q19 
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter integer number:");
        int num=sc.nextInt();
        if(num==0)
         System.out.println("Zero integer");
         else if(num>0)
         System.out.println("Positive integer");
        else     
         System.out.println("Negative integer");
    }
}

