package Java;
import java.util.Scanner;
public class MathClass {
    public static void main(String[] args){
       double x;
       double y;
       double z;
    
       Scanner scanner = new Scanner(System.in);

       System.out.println("Type side x: ");
       x = scanner.nextDouble();
       System.out.println("Type side y: ");
       y = scanner.nextDouble();
      

       z = Math.sqrt((x*x)+(y*y)); 

       System.out.println("The Hypotenuse is: " + z);
       
       scanner.close();


    }
}
