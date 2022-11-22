/*program which enter Annual family income and age of a person and if the income is from 1 lakh to 
2 lakh and age is also from 18 to 24 then print eligible for scholarship otherwise print not eligible for 
scholarship.*/

import java.util.*;
public class Q24 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the annual income:");
        int incm=sc.nextInt();
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        if((incm>=100000 && incm<=200000)&&(age>=18 && age<=24))
        System.out.println("Eligible for scholarship");
        else
        System.out.println("Not eligible for scholarship");
        
    }

}
