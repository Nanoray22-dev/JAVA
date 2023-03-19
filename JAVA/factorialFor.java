

public class factorialFor {
    public static void main(String[] args){
        //        int n = 5;
        //        int factorial = 1 ;
        //        for(int i = 1; i <= n; i++){
        //            factorial = factorial * i;
        //        }
        //        System.out.println("El factorial de " + n + " es " + factorial);
        
        //        int numero = 12;
        //
        //        while(numero >= 2){
        //            numero = numero - 2;
        //        }
        //        if(numero == 0){
        //            System.out.println("El numero es par");
        //        }else{
        //            System.out.println("El nuemro es impar");
        //        }
        //        int numero = 100;
        //
        //         do {
        //             numero = (int) (100 * Math.random());
        //             System.out.println("El numero aleatorio es :" + numero);
        //               if ( numero != 25)
        //                   break;
        //         } while( numero != 50);
        
        //        int base = 2;
        //        int exponente = 10;
        //        int potencia = 1;
        //        for(int i = 1; i <= exponente; i++){
        //            potencia = potencia * 1;
        //
        //        }
        //        System.out.println("La potencia es: " + potencia);
        
                for(int i = 1; i <= 10; i++){
                    if( i % 2 != 0)
                        continue;
                    System.out.println("Numero pares: " + i);
        
                }
        
        
            }
}
