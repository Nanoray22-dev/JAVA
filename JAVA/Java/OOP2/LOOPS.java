package Java.OOP2;
import java.util.Scanner;;
public class LOOPS {

    public static void main(String[] aStrings){
        // While and Do While

        try (Scanner scanner = new Scanner(System.in)) {
            int rows;
            String symbol = "";

            System.out.println("Enter # of rows: ");
            rows = scanner.nextInt();
            System.out.println("Enter # of columns: ");
            System.out.println("Enter symbol to use: ");
            symbol = scanner.next();

            for(int i=1; i <= rows; i++){
                System.out.println();
                for(int j=1; j <= rows; j++){
                    System.out.println(symbol);
                }

            }
        }

    //    do{
    //         System.out.println("Type your name");
    //         name = scanner.nextLine();
    //     } while(name.isBlank());
    //     System.out.println("Hello " + name);


        // for loop

        // for( int i = 10; i >= 0; i--){
        //     System.out.println(i);
        // }
        // System.out.println("Happy New year ");

        // nested loops = loops inside of a loop

    }
}
