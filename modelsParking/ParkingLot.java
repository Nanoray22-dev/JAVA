package modelsParking;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot{
    private int totalspots;
    private List<ParkingSpot> parkingSpots;
    
    public ParkingLot(int totalspots){
        this.totalspots = totalspots;
        this.parkingSpots = new ArrayList<>(totalspots);
        for(int i = 0; i < totalspots; i++){
            if (i < 2){
                parkingSpots.add(new MotorcycleSpot());
            } else if (i < 8){
                parkingSpots.add(new CompactSpot());
            }else if ( i < 20){
                parkingSpots.add(new RegularSpot());
            }else{
                parkingSpots.add(new LargeSpot());
            }
        }
    }
    public int getRemainigSpots(){
        int count = 0;
        for(ParkingSpot spot : parkingSpots){
            if(spot.isAvailable()){
                count++;
            }
        }
        return count;
    }

    public int getTotalSpots(){
        return totalspots;
    }

    public boolean isFull(){
        return getRemainigSpots() == 0;
    }

    public boolean isEmpty(){
        return getRemainigSpots() == totalspots;
    }

    public boolean isMotorcycleSpotFull(){
        int count = 0;
        for (ParkingSpot spot : parkingSpots){
            if(spot instanceof MotorcycleSpot && !spot.isAvailable()){
                count++;
            }
        }
        return count == 2;
    }

    public int getOccupiedVanSpots(){
        int count = 0;
        for(int i  = 0; i < parkingSpots.size() - 2; i++){
            if(parkingSpots.get(i).isAvailable() && parkingSpots.get(i + 1).isAvailable() && parkingSpots.get(i + 2).isAvailable()){
                parkingSpots.get(i).parkVehicle(new Van());
                parkingSpots.get(i + 1).parkVehicle(new Van());
                parkingSpots.get(i + 2).parkVehicle(new Van());
                count += 3;
            }
        }
        return count;
    }
}