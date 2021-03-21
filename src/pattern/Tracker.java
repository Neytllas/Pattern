package pattern;

public class Tracker
{
    public static void main(String[] args)
    {
        Notifier firstRoadNotifier = new FirstRoad(Priority.Ensk);
        Notifier secondRoadNotifier = new SecondRoad(Priority.Iventsk);
        Notifier thirdRoadNotifier = new ThirdRoad(Priority.Shablonsk);
        Notifier fourthRoadNotifier = new FourthRoad(Priority.Diagramsk);
        Notifier fifthRoadNotifier = new FifthRoad(Priority.Atributsk);

        firstRoadNotifier.setNextNotifier(secondRoadNotifier);
        secondRoadNotifier.setNextNotifier(thirdRoadNotifier);
        thirdRoadNotifier.setNextNotifier(fourthRoadNotifier);
        fourthRoadNotifier.setNextNotifier(fifthRoadNotifier);

        firstRoadNotifier.notifyManager(" Энск->Ивентск", Priority.Ensk);
        secondRoadNotifier.notifyManager(" Энск->Ивентск->Шаблонск", Priority.Iventsk);
        thirdRoadNotifier.notifyManager(" Энск->Ивентск->Шаблонск->Диаграмск", Priority.Shablonsk);
        fourthRoadNotifier.notifyManager(" Энск->Ивентск->Шаблонск->Диаграмск->Атрибутск", Priority.Diagramsk);
        fifthRoadNotifier.notifyManager(" Шаблонск->Атрибутск", Priority.Atributsk);
    }
}
