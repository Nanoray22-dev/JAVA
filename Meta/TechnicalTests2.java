package Meta;
import java.util.Scanner;

public class TechnicalTests2 {
    public static void main(String[] main){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("type a high number");
            int n = input.nextInt();
            
            int a = 0, b = 1, c;

            System.out.println("Secuencia de Fibonacci hasta " + n + ": ");

            while (a <= n){
                System.out.println(a + " ");
                c = a + b; 
                a = b; 
                b = c; 
            }
        }
    }
}
