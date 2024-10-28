public class Dog extends Animal implements Runnable
{
    @Override
    public void makeSound()
    {
        System.out.println("Bark!");
    }

    @Override
    public void eat()
    {
        System.out.println("eating dog food");
    }

    @Override
    public void run()
    {
        System.out.println("chasing the cat");
    }
}
