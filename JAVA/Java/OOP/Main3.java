package Java.OOP;

public class Main3 {
    public static void main(String[] args){
        Car car = new Car("Chevrolet", "Tranx", "Gray", 2017);

        car.setYear(2022);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getYear());
        System.out.println();
    }
}
