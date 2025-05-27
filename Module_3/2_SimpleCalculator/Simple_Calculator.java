import java.util.Scanner;
public class Simple_Calculator 
{
    public static void main(String[] args)
    {
        char opt;
        double num1, num2, result=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        num1 = sc.nextDouble();
        System.out.print("Enter the second number:");
        num2 = sc.nextDouble();
        System.out.println("Enter the operator (+, -, *, /):");
        opt = sc.next().charAt(0);
        switch (opt) 
        {
            case '+':result=num1+num2; break;
            case '-':result=num1-num2; break;
            case '*':result=num1*num2; break;
            case '/':result=num1/num2; break;

    }
    System.out.println("Result: "+result);
    sc.close();
}
}