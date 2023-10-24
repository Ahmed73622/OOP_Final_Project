import java.util.ArrayList;

public class CollegeManagement
{
    public String CollegeName;
    public String City;
    public String ContactNumber;
    public boolean isOpen;
    public Auditorium auditorium;
    public ArrayList<Parking> parkings;
    public Classroom classroom;
    public Department department;
    public ArrayList<Hostel> hostels;

    public boolean Open()
    {
        return isOpen;
    }

    public String CollegeDetails() {
        return "CollegeManagement{" +
                "CollegeName='" + CollegeName + '\'' +
                ", City='" + City + '\'' +
                ", ContactNumber='" + ContactNumber + '\'' +
                ", isOpen=" + isOpen +
                '}';
    }
}
