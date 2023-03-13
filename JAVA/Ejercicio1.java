//Cargar un programa que cargue tres numero y diga cual es menor y cual es mayor 

package JAVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException{
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        
        System.out.println("Type the first number: ");
        String strNumber1 = buffer.readLine();
        int number1 = Integer.parseInt(strNumber1);


        System.out.println("Type the second number: ");
        String strNumber2  = buffer.readLine();
        int number2 = Integer.parseInt(strNumber2);


        System.out.println("Type the third number: ");
        String strNumber3 = buffer.readLine();
        int number3 = Integer.parseInt(strNumber3);
        

        int numberMayor = number1;
        if(number2 > numberMayor){
            numberMayor = number2;
        }
         if(number3 > numberMayor){
            numberMayor = number3;
        }
        System.out.println("The mayor number is: " + numberMayor);

        Integer numberLess = number1;

        if(number2 < numberLess){
            numberLess = number2;
        }
        if (number3 < numberLess){
            numberLess = number3;
        }
        System.out.println("The Less number is: " + numberLess);

    }
    
}
