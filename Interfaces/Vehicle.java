package Interfaces;

import org.junit.Test;

public interface Vehicle {
    
    void changeGear(int a);
    void applySpeed(int a);
    void applyBreak(int a);
    void printState();
};

class Bicycle implements Vehicle{
    int speed;
    int gear;
    
    @Test
    public void changeGear(int newGear){
        gear = newGear;
    }
    @Override
    public void applySpeed(int increment){
        speed = speed + increment;
    }
    @Override
    public void applyBreak(int decrement){
        speed = speed + decrement;
    }
    @Override
    public void printState(){
        System.out.println("Speed " + speed + " gear " + gear);
    }

}

class Bike implements Vehicle{
    int speed;
    int gear; 

    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }
    @Override
    public void applySpeed(int increment){
        speed = speed + increment;
    }
    @Override
    public void applyBreak(int decrement){
        speed = speed + decrement;
    }
    @Override
    public void printState(){
        System.out.println("Speed " + speed + " gear " + gear);
    }
}

class GFG{
    public static void main(String[] main){
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(3);
        bicycle.applySpeed(3);
        bicycle.applyBreak(4);

        System.out.println("Bicycle print state");
        bicycle.printState();

        Bike bike = new Bike();
        bike.changeGear(3);
        bike.applySpeed(3);
        bike.applyBreak(4);

        System.out.println("Bicycle print state");
        bike.printState();

    }
}

