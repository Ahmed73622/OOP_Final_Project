import java.util.ArrayList;

public class Parking
{
    private int SlotId;
    private int VehicleNumber;
    private String VehicleOwnerName;
    private ArrayList<Parking> vehicles;
    public void ParkVehicle(Parking vehicle)
    {
        vehicles.add(vehicle);
    }
}
