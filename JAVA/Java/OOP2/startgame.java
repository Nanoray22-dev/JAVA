package Java.OOP2;

import java.util.Scanner;

public class startgame {
    public static void main(String[] args){

        // logical operator
        //&&

        int temp = 15;

        if(temp > 20){
            System.out.println("its no late to learn");

        }else if(temp >=25 && temp<=30){
            System.out.println("its never late to learn now");

        }else{
            System.out.println("you can achieve it");

        }
        try (// or || operator
        Scanner scanner = new Scanner(System.in)) {
            System.out.println("You are playing a game!  Press q or Q to quit");
            System.out.println("GameOver!  Press b or b or B to Start Again");
            String response = scanner.next();

            if(response.equals("q") || response.equals("Q")){
                System.out.println("You quit the game!");
            }else if(!response.equals("B") && !response.equals("b")){
                System.out.println("You are playing a game!");
            }else{
                System.out.println("You are start again the game!");
            }
        }
    }
    
}
