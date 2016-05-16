import java.sql.*;
import java.util.*;
import java.util.Date;

public class Manager {

    private static Connection con;
    private static Manager instance;


    private Manager() throws Exception {
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/TimeManager";
            String login = "postgres";
            String password = "postgres";
            con = DriverManager.getConnection(url, login, password);
        } catch (ClassNotFoundException e) {
            throw new Exception(e);
        } catch (SQLException e) {
            throw new Exception(e);
        }
    }
    // метод getInstance - проверяет, инициализирована ли статическая
    // переменная (в случае надобности делает это) и возвращает ее
    public static synchronized Manager getInstance() throws Exception {
        if (instance == null) {
            instance = new Manager();
        }
        return instance;
    }

    public List<Day> getDays() throws SQLException {
        List<Day> days = new ArrayList<Day>();

        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("Select day_id, day_name, day_date from days");
            while (rs.next()) {
                Day d = new Day();
                d.setDayId(rs.getInt(1));
                d.setDayName(rs.getString(2));
                d.setDayDate(rs.getDate(3));

                days.add(d);
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
        }
        return days;
    }

    public List<User> getUsers() throws SQLException {
        List<User> users = new ArrayList<User>();

        Statement stmt = null;
        ResultSet rs = null;
        try{
            stmt = con.createStatement();
            rs = stmt.executeQuery("Select user_id, user_name from users");
            while (rs.next()){
                User u = new User();
                u.setUserId(rs.getInt(1));
                u.setUserName(rs.getString(2));

                users.add(u);
            }
        } finally {
            if (rs != null){
                rs.close();
            }
            if (stmt != null){
                stmt.close();
            }
        }
        return users;
    }

    public Collection<Event> getEvents() throws SQLException{
        Collection<Event> events = new ArrayList<Event>();

        Statement stmt = null;
        ResultSet rs = null;
        try{
            stmt = con.createStatement();
            rs = stmt.executeQuery("Select event_id, event_name, start_time, end_time, day_id, user_id from events order by day_id, start_time");
            while (rs.next()){
                Event ev = new Event(rs);
                    events.add(ev);
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null){
                stmt.close();
            }
        }
        return events;
    }

    public Collection<Event> getEventForDay(Day day) throws SQLException{
        Collection<Event> events = new ArrayList<Event>();

        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            stmt = con.prepareStatement("Select event_id, event_name, start_time, end_time, day_id, user_id from events where day_id=? order by day_id, start_time");
            stmt.setInt(1, day.getDayId());
            rs = stmt.executeQuery();
            while (rs.next()){
                Event ev = new Event(rs);
                events.add(ev);
            }
        } finally {
            if (rs != null){
                rs.close();
            }
            if (stmt != null){
                stmt.close();
            }
        }
        return events;
    }

    public void deletAllEvents() throws SQLException{
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("Delete * form events");
            stmt.execute();
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public void insertEvent(Event event) throws SQLException {
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("Insert into events (event_name, start_time, end_time, day_id, user_id) values (?, ?, ?, ?, ?) ");
            stmt.setString(1, event.getEventName());
            stmt.setTime(2, (Time) event.getStartTime());
            stmt.setTime(3, (Time) event.getEndTime());
            stmt.setInt(4, event.getDayId());
            stmt.setInt(5, event.getUserId());
            stmt.execute();
        } finally {
            if (stmt != null){
                stmt.close();
            }
        }
    }

    public void updateEvent(Event event) throws SQLException {
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("Update events set eventName=?, start_time=?, end_time=?, day_id=?, user_id=? where event_id=?");
            stmt.setString(1, event.getEventName());
            stmt.setTime(2, (Time) event.getStartTime());
            stmt.setTime(3, (Time) event.getEndTime());
            stmt.setInt(4, event.getDayId());
            stmt.setInt(5, event.getUserId());
            stmt.setInt(6, event.getEventId());
            stmt.execute();
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public void deleteEvent(Event event) throws SQLException {
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("Delete frome events where event_id=?");
            stmt.setInt(1, event.getEventId());
            stmt.execute();
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }
}
