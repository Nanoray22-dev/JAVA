package Java.OOP2;


import java.util.Scanner;



public class Ejercicio5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number");
        int number = scanner.nextInt();

        int factorial = 1;
        for(int i = 0; i < number; i++){
            factorial *= (i+1);
        }
        System.out.println("! = " + factorial);
    }
}
