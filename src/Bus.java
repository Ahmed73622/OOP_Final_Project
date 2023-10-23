public class Bus
{
    private int BusId;
    private int BusNumber;
    private String DriverName;
    private String Destination;
    private int TotalSeats;
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
