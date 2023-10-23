import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Auditorium
{
    private String AuditoriumName;
    private ArrayList<Event> EventsList;
    private Date _Date;
    private Time _Time;
    private int TotalSeats;
    private int DepartmentId;
    public boolean BookEvents(Event event)
    {
        EventsList.add(event);
        return true;
    }
}
class Event
{
    private String EventName;
    private Date _Date;
    private Time _Time;
    private String description;
}
