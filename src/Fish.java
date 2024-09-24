public class Fish extends Animal{
    @Override
    public void move()
    {
        System.out.println("swim");
    }
    @Override
    public void makeSound()
    {
        System.out.println("blop");

    }
    public void eat()
    {
        System.out.println("fish");
    }
}
