package Java;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the first number");
        int Number = scanner.nextInt();

        System.out.println("Type the second number");
        int Number2 = scanner.nextInt();

        System.out.println("sum of both number is: " + (Number + Number2));

        

    }
}
