import java.util.Scanner;
class TryCatch 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Divider: ");
        int p=sc.nextInt();
        System.out.print("Enter the Dividend: ");
        int q=sc.nextInt();
        try {int r=p/q;}
        catch(ArithmeticException e)
        {
            System.out.println("Division by zero is not allowed!!!");
        }


    }
}
