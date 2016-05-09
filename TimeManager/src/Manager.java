import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.*;

public class Manager {

    private List<Day> days;
    private List<User> users;
    private Collection<Event> events;

    // Для шаблона Singletone статическая переменная
    private static Manager instance;

    //Закрытый конструктор
    private Manager(){
        loadUsers();
        loadDays();
        loadEvents();
    }

    // метод getInstance - проверяет, инициализирована ли статическая
    // переменная (в случае надобности делает это) и возвращает ее
    public static synchronized Manager getInstance() {
        if (instance == null) {
            instance = new Manager();
        }
        return instance;
    }



    public void loadUsers() {
        // Проверяем - может быть наш список еще не создан вообще
        if (users == null) {
            users = new ArrayList<User>();
        } else {
            users.clear();
        }
        User u = null;

        u = new User();
        u.setUserId(1);
        u.setUserName("Любочка");
        users.add(u);

        u = new User();
        u.setUserId(2);
        u.setUserName("Мишаня");
        users.add(u);
    }

    public void loadDays() {
        // Проверяем - может быть наш список еще не создан вообще
        if (days == null) {
            days = new ArrayList<Day>();
        } else {
            days.clear();
        }
        Day d = null;
        Calendar c = Calendar.getInstance();

        d = new Day();
        d.setDayId(1);
        d.setDayName("Понедельник");
        c.set(2016, Calendar.MAY, 9);
        d.setDayDate(c.getTime());
        days.add(d);

        d = new Day();
        d.setDayId(2);
        d.setDayName("Вторник");
        c.set(2016, Calendar.MAY, 10);
        d.setDayDate(c.getTime());
        days.add(d);
    }

    public void loadEvents() {
        if (events == null) {
            // Мы используем коллекцию, которая автоматически сортирует свои элементы
            events = new TreeSet<Event>();
        } else {
            events.clear();
        }

        Event e = null;
        Calendar c = Calendar.getInstance();

        e = new Event();
        e.setEventName("Тренировка");
        e.setEventId(1);
        e.setDayId(1);
        e.setUserId(1);
        c.set(2016, 5, 9, 10, 30);
        e.setStartTime(c.getTime());
        c.set(2016, 5, 9, 11, 30);
        e.setEndTime(c.getTime());
        events.add(e);

        e = new Event();
        e.setEventId(2);
        e.setEventName("Английский");
        e.setDayId(2);
        e.setUserId(2);
        c.set(2016, 5, 9, 20, 00);
        e.setStartTime(c.getTime());
        c.set(2016, 5, 9, 20, 30);
        e.setEndTime(c.getTime());
        events.add(e);

        e = new Event();
        e.setEventName("Маникюр");
        e.setEventId(1);
        e.setDayId(1);
        e.setUserId(1);
        c.set(2016, 5, 9, 12, 00);
        e.setStartTime(c.getTime());
        c.set(2016, 5, 9, 15, 00);
        e.setEndTime(c.getTime());
        events.add(e);
    }

    public List<Day> getDays(){
        return days;
    }

    //Получить день по ИД
    public List<Day> getDay(int dayId){
        List<Day> dd = new ArrayList<Day>();
        for (Day d : dd){
            if (d.getDayId() == dayId){
                dd.add(d);
            }
        }
        return dd;
    }

    // Получить список событий определенного дня
    public Collection<Event> getEventsFromDay(int dayId) {
        Collection<Event> ed = new TreeSet<Event>();
        for (Event e : events) {
            if (e.getDayId() == dayId) {
                ed.add(e);
            }
        }
        return ed;
    }

    public List<User> getUsers(){
        return users;
    }

    public Collection<Event> getEvents(){
        return events;
    }



    // Удалить все события определенного дня
    public void removeEventsFromDay(Day day) {
        // Мы создадим новый список событий БЕЗ тех, которые мы хотим удалить.
        // Возможно не самый интересный вариант. Можно было бы продемонстрировать
        // более элегантный метод, но он требует погрузиться в коллекции более глубоко
        // Здесь мы не ставим себе такую цель
        Collection<Event> tmp = new TreeSet<Event>();
        for (Event ev : events) {
            if (ev.getDayId() != day.getDayId()){
                tmp.add(ev);
            }
        }
        events = tmp;
    }

    // Добавить событие
    public void insertEvent(Event event) {
        // Просто добавляем объект в коллекцию
        events.add(event);
    }

    // Обновить данные о событии
    public void updateEvent(Event event) {
        // Надо найти нужное событие (по его ИД) и заменить поля
        Event updEvent = null;
        for (Event ev : events) {
            if (ev.getEventId() == event.getEventId()) {
                // Вот это событие - запоминаем его и прекращаем цикл
                updEvent = ev;
                break;
            }
        }
        updEvent.setEventName(event.getEventName());
        updEvent.setStartTime(event.getStartTime());
        updEvent.setEndTime(event.getEndTime());
        updEvent.setUserId(event.getUserId());
        updEvent.setDayId(event.getDayId());
    }

    // Удалить событие
    public void deleteEvent(Event event) {
        // Надо найти нужное событие (по его ИД) и удалить
        Event delEvent = null;
        for (Event ev : events) {
            if (ev.getEventId() == event.getEventId()) {
                // Вот это событие - запоминаем его и прекращаем цикл
                delEvent = ev;
                break;
            }
        }
        events.remove(delEvent);
    }




}
