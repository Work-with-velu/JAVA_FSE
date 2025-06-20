
import java.util.Scanner;

public class RecursiveFibonacci 
{
    public static int fibonacci(int n)
    {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x=sc.nextInt();
        int result=fibonacci(x);
        System.out.printf("Fibonacci upto %dth term is %d",x,result);
    }
}
