package Java.OOP2;
import java.util.Random;
public class RandomNumber {
    public static void main(String[] args){

        Random random = new Random();
        
        // int x = random.nextInt(10);
        // double x = random.nextDouble();
        boolean x = random.nextBoolean();
        Float y = random.nextFloat(10);
         System.out.println(x);
         System.out.println(y);
    }
}
