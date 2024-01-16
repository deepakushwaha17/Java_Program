/*Program which store two values 10 and 20. Then print them after 
swap(exchange) them without using third variable and print them. */

class Q17
{
    public static void main(String args[])
    {
        int a=10;
        int b=20;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("swap of number a=10 and b=20 is : a="+a+" b="+b);
    }
}

