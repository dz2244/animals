public class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("walk");
    }

    @Override
    public void makeSound()
    {
        System.out.println("meow");

    }
    public void eat()
    {
        System.out.println("fish");
    }
}
