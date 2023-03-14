package JAVA;

public class Ejercicio4 {
    public static void main(String[] args){
        String resultado = "";
        int contandor = 0;
        int numero = 1;
        while(contandor < 100){
            if(esPrimo(contandor)){
                resultado += numero + " ";
                contandor++;
            }
            numero++;

            }
          System.out.println("Los primeros 100 numeros primos son: " + resultado);

        }
        private static Boolean esPrimo(Integer numero){
            Boolean esUnNumeroPrimo = true;
            for(int i = 2; i < numero; i++){
                if(numero % 2 == 0){
                    esUnNumeroPrimo = false;
                }

            }
            return esUnNumeroPrimo;

    }
    
}
