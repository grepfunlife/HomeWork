import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;

/**
 * Created by love_polyanskaya on 08.05.16.
 */
public class TimeManagerFrame extends JFrame {

//    Manager m = Manager.getInstance();
//
//    private JList dList;
//    private JList evList;
//
//    public TimeManagerFrame(){
//        // Устанавливаем layout для всей клиентской части формы
//        getContentPane().setLayout(new BorderLayout());
//
//        //Создаем верхнюю панель
//        JPanel top = new JPanel();
//        // Устанавливаем для нее layout
//        top.setLayout(new FlowLayout(FlowLayout.LEFT));
//        // Задаем layout и задаем "бордюр" вокруг панели
//        top.setLayout(new BorderLayout());
//        top.setBorder(new BevelBorder(BevelBorder.RAISED));
//        // Получаем день
//        Vector<Day> days = new Vector<Day>(m.getDay(1));
//        // Создаем визуальный список и вставляем его в скроллируемую
//        // панель, которую в свою очередь уже кладем на панель top
//        dList = new JList(days);
//        top.add(new JScrollPane(dList), BorderLayout.CENTER);
//
//        //Создаем нижнюю панель
//        JPanel bot = new JPanel();
//        // Устанавливаем для нее layout
//        bot.setLayout(new FlowLayout(FlowLayout.CENTER));
//        // Задаем layout и задаем "бордюр" вокруг панели
//        bot.setLayout(new BorderLayout());
//        bot.setBorder(new BevelBorder(BevelBorder.RAISED));
//        // Получаем день
//        Vector<Event> events = new Vector<Event>(m.getEventsFromDay(1));
//        // Создаем визуальный список и вставляем его в скроллируемую
//        // панель, которую в свою очередь уже кладем на панель bot
//        evList = new JList(events);
//        bot.add(new JScrollPane(evList), BorderLayout.CENTER);
//
//        // Вставляем верхнюю и нижнюю панели в форму
//        getContentPane().add(top, BorderLayout.NORTH);
//        getContentPane().add(bot, BorderLayout.CENTER);
//
//        // Задаем границы формы
//        setBounds(100, 100, 600, 400);
//
//    }
//
    public static void main(String[] args) {
////        // Запуск формы лучше производить в специальном треде
////        // event-dispatching thread - EDT
////        SwingUtilities.invokeLater(new Runnable() {
////            public void run() {
////                TimeManagerFrame tmf = new TimeManagerFrame();
////                tmf.setDefaultCloseOperation(EXIT_ON_CLOSE);
////                tmf.setVisible(true);
////            }
////        });
        Manager m = Manager.getInstance();
//        //System.out.println(m.getDays());
//
//        //Один день
//        int dayId1=1;
//        m.getDay(dayId1);
//        for (Day d : days) {
//            if (d.getDayId() == dayId1)
//            {
//                System.out.println(d);
//                System.out.println("----------------");
//            }

        System.out.println("Список событий за день");
        System.out.println("*******************");
//Один день
        int dayId=2;
        List<Day> dd = m.getDay(dayId);

        for (Day d : dd) {

            System.out.println(dd);
            System.out.println("----------------");
        }



//Список событий за день

        Collection<Event> events = m.getEventsFromDay(dayId);


        for (Event ev : events) {
            System.out.println(ev);
        }

        }
//
//    }




}
