import java.util.Scanner;

public class ArraySumAvg 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter the number of elements: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements one by one\n");
        int sum=0;
        for(int i=0;i<n;i++)
        {
            System.out.printf("Enter the %dst element: ",i+1);
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.printf("\nSum of the elements: %d\n",sum);
        System.out.println("Average of the array elements is : "+(double)sum/n);


        

    }
}
