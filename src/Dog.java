public class Dog extends  Animal {
    @Override
    public void move()
    {
        System.out.println("walk");
    }
    @Override
    public void makeSound()
    {
        System.out.println("bark");

    }
    public void eat()
    {
        System.out.println("meat");
    }

}
