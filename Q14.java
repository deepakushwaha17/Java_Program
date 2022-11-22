// Program which enter the radius of circle than calculate and print area of circle.
import java.util.*;
class Q14
{
    public static void main(String args[])
    {
        float pie=3.14f;
        double r,area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius of Circle:");
        r=sc.nextDouble();
        area=pie*r*r;
        System.out.println("Area of Circle:"+area);
    }    
}
