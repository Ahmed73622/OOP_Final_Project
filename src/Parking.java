import java.util.ArrayList;

public class Parking
{
    public int SlotId;
    public int VehicleNumber;
    public String VehicleOwnerName;
    public ArrayList<Parking> vehicles;
    public void ParkVehicle(Parking vehicle)
    {
        vehicles.add(vehicle);
    }
}
