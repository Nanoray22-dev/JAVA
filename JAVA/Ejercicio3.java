package JAVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3 {

    public static void main(String[] args) throws IOException{
        System.out.println("Type the first number: ");
        Double number = Double.valueOf(cargarNumber());
        
        Boolean esPar = (number % 2) == 0;

        if(esPar){
            System.out.println("El numero es par");

        }else{
            System.out.println("El numero no es par");
        }

       


    }

    private static Integer cargarNumber()throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        String strNumber = buffer.readLine();
        Integer number = Integer.parseInt(strNumber);

        return number;
    }

   

    }
   
    

