/*Program which store two values 10 and 20. then print them after 
swap(exchange) them using third variable and print them.*/
class Q16
{
    public static void main(String args[])
    {
        int a=10;
        int b=20;
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("swap of number a=10 and b=20 is : a="+a+" b="+b);
    }
}

