package DynamicPolymophism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            Person person;

            System.out.println("who are u?");
            System.out.print("(1 = Man) or  (2 = Woman) or (3 = kids)");
            int choice = scanner.nextInt();

            if( choice == 1 ){
                 person = new Men();
                 person.speak();
            }else if(choice == 2){
                person = new Women();
                person.speak();
            }else if (choice == 3 ){
                person = new Kids();
                person.speak();
            }else{
                person = new Person();
                System.out.println("Sorry u cant be here");
                person.speak();
            }
        }
    }
}
