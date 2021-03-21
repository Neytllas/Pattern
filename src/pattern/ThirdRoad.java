package pattern;

public class ThirdRoad extends Notifier
{
    public ThirdRoad (int priority)
    {
        super(priority);
    }

    @Override
    public void write(String message)
    {
        System.out.println("Пройденный маршрут: " + message);
    }
}
