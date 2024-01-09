/*Program which enter sales made by a any salesman that calculate and print the 
commission, according to following rules -
 sale up to 25000, commission is 5% of sale, otherwise it is & 7% of sales
  output format -
        commission = .......Rs */

import java.util.*;
public class Q21
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the sales :");
        int sale=sc.nextInt();
        if(sale<=25000)
        {
            double commis=(sale*5)/100;
            System.out.println("Commission ="+commis+"Rs.");
        }
        else
        {
            double commis=(sale*7)/100;
            System.out.println("Commission ="+commis+" Rs.");
        }
    
    }
}

