import java.text.DateFormat;
import java.util.Date;

/**
 * Created by love_polyanskaya on 07.05.16.
 */
public class Day {
    private int dayId;
    private String dayName;
    private Date dayDate;

    public int getDayId() {
        return dayId;
    }

    public void setDayId(int dayId) {
        this.dayId = dayId;
    }

    public String  getDayName() {
        return dayName;
    }

    public void setDayName(String  dayName) {
        this.dayName = dayName;
    }

    public Date getDayDate() {
        return dayDate;
    }

    public void setDayDate(Date dayDate) {
        this.dayDate = dayDate;
    }

    @Override
    public String toString(){
        return dayName + " " +
                //DateFormat.getTimeInstance(DateFormat.LONG).format(dayDate);
                DateFormat.getDateInstance(DateFormat.LONG).format(dayDate);
    }
}
