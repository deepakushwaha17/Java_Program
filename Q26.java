/*program which enter sale made by any salesman than calculate and print the commission, 
 according to following rules -
        Sale Commission 
        up to 25000 5% of sales
        25001 - 50000 7% of sales
        50001 - 75000 8% of sales
        75001 10% of sales. */
        
import java.util.*;
public class Q26
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the sales :");
        int sale=sc.nextInt();
        double comissn;
        if(sale<=25000)
        {
            comissn=(sale*5)/100;
            System.out.println("Commission on 5% of sale Rs."+sale+" is Rs."+comissn);
        }
        else if(sale>=25001 && sale<=50000)
        {
            comissn=(sale*7)/100;
            System.out.println("Commission on 7% of sale Rs."+sale+" is Rs."+comissn);
        }
        else if(sale>=50001 && sale<=75000)
        {
            comissn=(sale*8)/100;
            System.out.println("Commission on 8% of sale Rs."+sale+" is Rs."+comissn);
        }
        else
        {
            comissn=(sale*10)/100;
            System.out.println("Commission on 10% of sale Rs."+sale+" is Rs."+comissn);
        }
        
    }
    
}
