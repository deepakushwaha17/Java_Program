/*program which enter age of a person if the age is 18 or more then print you are adult otherwise
 print you are minor using Conditional operator [? :] */

import java.util.*;
public class Q29
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age :");
        int age=sc.nextInt();
        boolean flag;
        flag=(age>=18)?true:false;
        //int i;
        //i=(age>=18)?1:0;
        if(flag==true)
        System.out.println("Adult");
        else
        System.out.println("Minor");
        
    }
}
