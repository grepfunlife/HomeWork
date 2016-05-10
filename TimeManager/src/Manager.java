import java.sql.*;
import java.util.*;

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

    public List<Day> getDays() throws Exception {
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


}
