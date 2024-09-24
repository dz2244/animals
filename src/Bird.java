public class Bird extends Animal{
    @Override
    public void move()
    {
        System.out.println("walk");
    }
    @Override
    public void makeSound()
    {
        System.out.println("twit");

    }
    public void eat()
    {
        System.out.println("meat");
    }
}
