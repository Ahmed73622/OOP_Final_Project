public class Bus
{
    public int BusId;
    public int BusNumber;
    public String DriverName;
    public String Destination;
    public int TotalSeats;
    public String BusDetails() {
        return "Bus{" +
                "BusId=" + BusId +
                ", BusNumber=" + BusNumber +
                ", DriverName='" + DriverName + '\'' +
                ", Destination='" + Destination + '\'' +
                ", TotalSeats=" + TotalSeats +
                '}';
    }
    public boolean SeatsAvailability()
    {
        return false;
    }
}
