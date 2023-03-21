// program which enter any code in integer and if it is 5,7,11 or 24 then print Right code otherwise print wrong code.

import java.util.*;
public class Q22 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the integer code: ");
        int i=sc.nextInt();
        if(i==5||i==7||i==11||i==24)
        System.out.println("Right Code");
        else
        System.out.println("Wrong Code");       
    }
    
}
