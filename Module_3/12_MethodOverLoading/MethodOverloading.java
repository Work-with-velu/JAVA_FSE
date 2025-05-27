public class MethodOverloading 
{
    public static int add(int a,int b)
    {
        return a+b;
    }

    public static double add(double a,double b)
    {
        return a+b;
    }

    public static int add(int a,int b,int c)
    {
        return a+b+c;
    }

    public static void main(String[] args) 
    {
        int result1=0,result2=0;
        double result3=0;
        result1=add(10,20);
        result2=add(10,20,30);
        result3=add(27.5,72.5);
        System.out.println("Result1: "+result1);
        System.out.println("Result2: "+result2);
        System.out.println("Result3: "+result3);

    }
}
