
class Car
{
    String make,model;
    int year;
    public Car(String make, String model, int year)
    {
        this.make = make;
        this.model=model;
        this.year=year;
    }
    void disp()
    {
        System.out.println("Make: "+make);
        System.out.println("Model: "+model);
        System.out.println("Year:"+year+"\n");
    }
}

public class ClassObjectDemo 
{
    public static void main(String[] args) 
    {
        Car c1=new Car("BMW","cd1000",2024);
        Car c2=new Car("BMW","a6",2025);
        c1.disp();
        c2.disp();
    }
}
