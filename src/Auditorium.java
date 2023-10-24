import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Auditorium
{
    public String AuditoriumName;
    public ArrayList<Event> EventsList;
    public Date _Date;
    public Time _Time;
    public int TotalSeats;
    public int DepartmentId;
    public boolean BookEvents(Event event)
    {
        EventsList.add(event);
        return true;
    }
}
class Event
{
    public String EventName;
    public Date _Date;
    public Time _Time;
    public String description;
}
