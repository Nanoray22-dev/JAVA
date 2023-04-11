package modelsParking;

public class Van extends Vehicle {
    @Override
    public String getType(){
        return "van";
    }
    
    @Override
    public String getSize(){
        return "large";
    }
}
