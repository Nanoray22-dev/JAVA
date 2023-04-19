/*
Write a program that asks the user to enter five integers, 
 stores them in an ArrayList, 
 and then prints out the sum and average of the integers. 
 */ 

package Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExercise {

    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter five integer");
            for(int i = 0; i < 5; i++){
                int number = input.nextInt();
                numbers.add(number);
            }
        }

        int sum = 0;
        for(int number: numbers){
            sum += number;
        }

        double average = sum / numbers.size();
        System.out.println("sum: " + sum);
        System.out.println("average: " + average);
    } 
}
