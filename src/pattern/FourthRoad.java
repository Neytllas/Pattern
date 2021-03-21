package pattern;

public class FourthRoad extends Notifier
{
    public FourthRoad (int priority)
    {
        super(priority);
    }

    @Override
    public void write(String message)
    {
        System.out.println("Пройденный маршрут: " + message);
    }
}
