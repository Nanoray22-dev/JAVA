package JAVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {
    public static void main(String[] args) throws IOException{
     
        
        System.out.println("Type the first number: ");
        Integer number1 = cargarNumber();


        System.out.println("Type the second number: ");
        Integer number2 = cargarNumber();


        System.out.println("Type the third number: ");
        Integer number3 = cargarNumber();

        Integer sumatoria = number1 + number2 + number3;
        Double numeroPromedio = Double.valueOf(sumatoria) / 3;
        System.out.println("El nuemero promedio es: " + numeroPromedio);
        

        
    }

    private static Integer cargarNumber() throws IOException{
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        String strNumber = buffer.readLine();
        Integer number = Integer.parseInt(strNumber);

        return number;
    }

}
    
    

