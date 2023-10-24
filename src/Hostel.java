public abstract class Hostel
{
    public int StudentId;
    public String BlockNumber;
    public String RoomNumber;
    public boolean check;

    public String HostelDetails() {
        return "Hostel{" +
                "StudentId=" + StudentId +
                ", BlockNumber='" + BlockNumber + '\'' +
                ", RoomNumber='" + RoomNumber + '\'' +
                '}';
    }
    public boolean CheckIn()
    {
        return !check;
    }
    public boolean CheckOut()
    {
        return check;
    }
}
