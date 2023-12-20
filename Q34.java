/*Program which enter gender code of a person as M or m for male and F or f for female and then 
test and print whether the given data is of male or female or it was wrong code enter by user (using switch case)*/

import java.util.*;
public class Q34
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the code:");
        char ch=sc.nextLine().charAt(0);
        String s1=Character.toString(ch);
        String str=" ";
        s1=s1.toUpperCase();
        switch(s1)
        {
            case "M":
            str="Male";
            break;
            case "F":
            str="Female";
            break;
            default:
            str="Wrong code";
        }
        System.out.println(str);
        
     }
    
}
