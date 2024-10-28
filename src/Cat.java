public class Cat extends Animal implements Runnable
{

    @Override
    public void makeSound()
    {
        System.out.println("Meow");
    }

    @Override
    public void eat()
    {
        System.out.println("eating fish");
    }

    @Override
    public void run()
    {
        System.out.println("escaping from the dog");
    }
}
