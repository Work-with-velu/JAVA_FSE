
import java.util.Scanner;

class InvalidAgeException extends Exception 
{
    public InvalidAgeException(String message) 
    {
        super(message);
    }
}
public class CustomException
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        try
        {
            if(age<18) 
            throw new InvalidAgeException("Age is less than 18!!!");
            else System.out.println("Age is okay");
        }
        catch (InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }
    }    
}
