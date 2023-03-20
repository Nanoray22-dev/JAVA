import java.util.Scanner;

public class NewClass {
    public static void main(String[] args){
        //Swap two variables
        
        String x = "Raysell";
        String y = "Erika";
        String temp;

        temp = x;
        x = y;
        y = temp;
        
        System.out.println("x " + x);
        System.out.println("y " + y);

        // Input and output in console

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your name");
        String name = scanner.nextLine();


        System.out.println("Type your age");
        Integer age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Type your country");
        String country = scanner.nextLine();

        System.out.println(name + "tienes " + age + " Años y vives en la " + country);

        //expresion
        
        int friends = 10;

        friends++;

        System.out.println(friends);

    }
}
