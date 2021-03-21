package pattern;

public class FifthRoad extends Notifier
{
    public FifthRoad (int priority)
    {
        super(priority);
    }

    @Override
    public void write(String message)
    {
        System.out.println("Пройденный маршрут: " + message + " В настоящее авиамаршрут Шаблонск->Атрибутск временно не функционирует.\n" +
                "Не волнуйтесь, посылка будет отправлена, как только снабжение восстановится.\n");
    }
}
