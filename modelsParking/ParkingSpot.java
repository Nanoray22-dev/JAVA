package modelsParking;

public abstract class ParkingSpot {
    private Vehicle vehicle;

    public boolean isAvailable(){
        return vehicle == null;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    public void parkVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void removeVehicle(){
        this.vehicle = null;
    }
}
