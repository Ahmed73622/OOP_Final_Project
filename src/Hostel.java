public abstract class Hostel
{
    private int StudentId;
    private String BlockNumber;
    private String RoomNumber;

    public String HostelDetails() {
        return "Hostel{" +
                "StudentId=" + StudentId +
                ", BlockNumber='" + BlockNumber + '\'' +
                ", RoomNumber='" + RoomNumber + '\'' +
                '}';
    }
    public boolean CheckIn()
    {
        return false;
    }
    public boolean CheckOut()
    {
        return false;
    }
}
