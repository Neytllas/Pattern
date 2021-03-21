package pattern;

public class FirstRoad extends Notifier
{
    public FirstRoad (int priority)
    {
        super(priority);
    }

    @Override
    public void write(String message)
    {
        System.out.println("Пройденный маршрут: " + message);
    }
}
