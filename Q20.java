/*Program which enter se code of a person as M or m for male and F or f For female and check and 
 print whether the given data is male, female or it was wrong code entered by the users. */
import java.util.*;
public class Q20 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the code:");
        char ch=sc.nextLine().charAt(0);
        if(ch=='M'|| ch=='m')
        System.out.println("Given data is Male");
        else if(ch=='F'|| ch=='f')
        System.out.println("Given data is Female");
        else 
        System.out.println("Wrong Code");
        
    }
    
}
