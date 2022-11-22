/* program which enter any character then check and print whether it is Capital alphabet, 
 small alphabet, digit or any other special character*/
import java.util.*;
public class Q28
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch=sc.nextLine().charAt(0);
        if(ch>='A'&& ch<='Z')//(Character.isUpperCase(ch))
        System.out.println("entered character is capital alphabet");
        else if(ch>='a' && ch<='z')//Character.isLowerCase(ch))
        System.out.println("entered character is small alphabet");
        else
        System.out.println("entered character is digit and other special character");
    }
    
}
