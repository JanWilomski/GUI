import java.util.*;

public abstract class ClientVehicleList {

    List<Vehicle> vehicleList = new ArrayList<Vehicle>();

    public void addVehicle(Vehicle v) {
        vehicleList.add(v);
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    @Override
    public String toString() {
        return "ClientVehicleList{" + "vehicleList=" + vehicleList + '}';
    }
}
