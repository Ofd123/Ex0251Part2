public class Bird extends Animal implements Flyable
{
    @Override
    public void makeSound()
    {
        System.out.println("twit twit");
    }

    @Override
    public void eat()
    {
        System.out.println("eating seeds");
    }

    @Override
    public void fly()
    {
        System.out.println("flying up high!");
    }
}
