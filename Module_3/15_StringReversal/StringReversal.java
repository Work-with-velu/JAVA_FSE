import java.util.Scanner;
public class StringReversal 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.println("Reversed string: "+sb);
    }
}
