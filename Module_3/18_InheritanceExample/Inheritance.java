class Animal
{
    public void makeSound()
    {
        System.out.println("Animal's sound");
    }
}

class Dog extends Animal
{
    public void makeSound()
    {
        System.out.println("Bark");
    }
}

public class Inheritance 
{
    public static void main(String[] args) 
    {
        Animal a1=new Animal();
        a1.makeSound();
        Dog d1=new Dog();
        d1.makeSound();
    }
}
