/*Program which enter gender code of a person as M or m for male and F or f for female and then 
test and print whether the given data is of male or female or it was wrong code enter by user (using switch case)*/

import java.util.*;
public class Q33
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the code:");
        char ch=sc.nextLine().charAt(0);
        switch(ch)
        {
            case 'm','M':
             System.out.println("male");
             break;
             case 'f','F':
             System.out.println("female");
             break;
             default:
             System.out.println("Wrong");

        }
     }
    
}