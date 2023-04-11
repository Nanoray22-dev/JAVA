package Java.OOP2;
import java.util.Scanner;

public class Busquedabinaria {
    public static void main(String[] args) {

        int[] numeros = {1,2,3,4,6,7,8,9,10,15,17,20,45,51,60,68,74,75};
        int mitad;
        int limiteInferior = 0;
        int limiteSuperior = numeros.length - 1;
        // int numeroBusqueda = 68;
        System.out.println("Type the number");
        try (Scanner number = new Scanner(System.in)) {
            int numeroBusquedas = number.nextInt();
            boolean encontrado = false;
            while ((limiteInferior <= limiteSuperior) && (!encontrado)) {
                mitad = (limiteInferior + limiteSuperior) / 2;
                if (numeros[mitad] == numeroBusquedas) {
                    encontrado = true; // ¡encontrado!
                }
                else if (numeros[mitad] > numeroBusquedas) {
                    limiteSuperior = mitad - 1; // buscar en la primera mitad
                } else {
                    limiteInferior = mitad + 1; // buscar en la segunda mitad
                }
            }
            if (encontrado)
                System.out.println("He encontrado el número ");
            else
                System.out.println("No he encontrado el número");
        }
    }
}
