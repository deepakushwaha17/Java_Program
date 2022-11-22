//programwhich enter any character and print its ACSII value.

import java.util.*;
public class Q27
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch=sc.nextLine().charAt(0);
        System.out.println("Character "+ch+"'s acsii value is "+(int)ch);
        
    }
    
}
