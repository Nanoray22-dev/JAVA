package Java;

import java.util.Scanner;

public class numberPar {
    public static void main(String[] aStrings){
      Scanner input = new Scanner(System.in);
      System.out.println("ingresa un numero");
      int number = input.nextInt();
      System.out.println("los numeros pares desde  " + number + " es: ");
      for(int i = 0; i <= number; i += 2){
        System.out.println(i + " ");
        
        boolean espar = (number <= 20)? true : false;
      String resultNumber = Boolean.toString(espar);
      System.out.println(resultNumber);
      }

    //   boolean esPar = (number % 2) == 0;
      

    //   if( esPar ){
    //     System.out.println("es par");
    //   }else{
    //     System.out.println("es impar");
    //   }
        
    }
      }
