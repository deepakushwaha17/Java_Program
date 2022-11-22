/*Program which enter two integers then perform following calculation -
        1 - Addition
        2 - Subtraction
        3 - Multiplication
        4 - division
        5 - Mod
    output should be in form of equation.
    Input format –
            Enter two integers .... & .....
    output format -
            ..... + .... = .......
            ..... - .... = .......
            ..... * .... = .......
            ..... / .... = .......
            ..... % .... = ....... */

import java.util.*;
public class Q15 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.printf("Enter two integers %d & %d \n",num1,num2);
        int sum=num1+num2;
        int sub=num1-num2;
        int mul=num1*num2;
        double div=num1/num2;
        float mod=num1%num2;
        System.out.println(num1+" + "+num2+" = "+sum);
        System.out.println(num1+" - "+num2+" = "+sub);
        System.out.println(num1+" * "+num2+" = "+mul);
        System.out.println(num1+" / "+num2+" = "+div);
        System.out.println(num1+" % "+num2+" = "+mod);


    }

    
}
