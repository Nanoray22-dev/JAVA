package JAVA;

public class Ejercicio4 {
    public static void main(String[] args){
        
        Integer numeroPrimo = 4;
        boolean esPrimo = true;
        for(int i = 2; i < numeroPrimo; i++){
            if ( numeroPrimo % 1 == 0){
                esPrimo = false;
            }
            if(esPrimo){
                System.out.println("Es primo");
            }else{
                System.out.println("No es primo");
            }



        }
    }
    
}
