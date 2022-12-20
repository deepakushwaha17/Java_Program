// Program which enter any integer than calculate and print its and cube.
import java.util.*;
class Q11 
{
    public static void main(String args[])
    {
        int a,cube;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a integer number:");
        a=sc.nextInt();
        cube=a*a*a;
        System.out.println("Cube of "+a+" is:"+cube);
    }
    
}
