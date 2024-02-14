/*Program which enter the age sale made by any person if the sale is upto 2500 then commission is 
5% of sale otherwise it is 7% of sale using Conditional operator[? :]*/

import java.util.*;
public class Q31
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sales :");
        int sale=sc.nextInt();
        double comison=(sale<=25000)?sale*5/100:sale*7/100;
        System.out.println("commission on sales of Rs."+" sale is Rs."+comison);
    }
    
}
