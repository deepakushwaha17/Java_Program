//Program which enter any integer from 1-3 and print in word. if the given value is beyond the range than it gives mgs out of rang.

import java.util.*;
public class Q32
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter integer number :");
        int num=sc.nextInt();
        String str=" ";
        switch(num)
        {
            case 1:
            str="One";
            break;
            case 2:
            str="Two";
            break;
            case 3:
            str="Three";
            break;
            default:
            System.out.println("Message out of Range");
        }
        System.out.println(str);
    }
    
}
