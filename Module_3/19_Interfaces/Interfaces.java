interface Instrument
{
    void play();
}
class Guitar implements Instrument
{
    public void play()
    {
        System.out.println("Playing guitar");
    }
}
class Piano implements Instrument
{
    public void play()
    {
        System.out.println("Playing piano");
    }
}



public class Interfaces 
{
  public static void main(String args[])
  {
    Instrument guitar=new Guitar();
    Instrument piano=new Piano();
    guitar.play();
    piano.play();   
  }  
}
