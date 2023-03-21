package Java.OOP;

public class Main3 {
    public static void main(String[] args){
        Garage garage = new Garage();
        Car car = new Car("BMW");
        garage.park(car);
    }
}
