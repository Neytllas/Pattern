package pattern;

public class SecondRoad extends Notifier
{
    public SecondRoad (int priority)
    {
        super(priority);
    }

    @Override
    public void write(String message)
    {
        System.out.println("Пройденный маршрут: " + message);
    }
}
