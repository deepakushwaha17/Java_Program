//program which enter any code in integer if it is from 5 To 24 then print Right Code otherwise print wrong code.

import java.util.*;
public class Q23 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the code:");
        int i=sc.nextInt();
        if(i>=5 && i<=24)
        System.out.println("Right code");
        else
        System.out.println("Wrong code");
        
    }
    
}
