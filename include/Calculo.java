package include;
import java.util.Scanner;

public class Calculo {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            // Pedir al usuario las entradas requeridas
            System.out.print("Ingrese el nombre del empleado: ");
            String name = input.nextLine();
            System.out.print("Ingrese el salario mensual del empleado: ");
            double salarioMensual = input.nextDouble();
            System.out.print("Ingrese la cantidad de años trabajados: ");
            int years = input.nextInt();
            System.out.print("Ingrese la cantidad de meses trabajados: ");
            int months = input.nextInt();
            System.out.print("Ingrese la cantidad de días trabajados: ");
            int days = input.nextInt();
            input.nextLine(); // Consumir el caracter de nueva línea pendiente
            System.out.print("¿El empleado ha sido preavisado? (Sí/No): ");
            String preavisado = input.nextLine();
            System.out.print("¿Desea incluir la cesantía en el cálculo? (Sí/No): ");
            String cesantia = input.nextLine();
            System.out.print("¿El empleado ha tomado vacaciones en el último año? (Sí/No): ");
            String vacaciones = input.nextLine();
            System.out.print("¿Desea incluir el salario de navidad en el cálculo? (Sí/No): ");
            String salarioNavidad = input.nextLine();

            // Realizar los cálculos correspondientes
            double tiempoTrabajado = years + (months / 12.0) + (days / 365.0);

            double preaviso;
            if (preavisado.equalsIgnoreCase("Sí")) {
                preaviso = salarioMensual * tiempoTrabajado;
            } else {
                preaviso = Math.min(salarioMensual * tiempoTrabajado * 2, salarioMensual * 12);
            }

            double cesantiaCalculo;
            if (cesantia.equalsIgnoreCase("Sí")) {
                cesantiaCalculo = salarioMensual * years;
            } else {
                cesantiaCalculo = salarioMensual * tiempoTrabajado;
            }

            double vacacionesCalculo;
            if (vacaciones.equalsIgnoreCase("Sí")) {
                vacacionesCalculo = salarioMensual;
            } else {
                vacacionesCalculo = salarioMensual * 1.5;
            }

            double salarioNavidadCalculo;
            if (salarioNavidad.equalsIgnoreCase("Sí")) {
                salarioNavidadCalculo = salarioMensual * 12 / 12.0;
            } else {
                salarioNavidadCalculo = 0;
            }

            double montoTotal = preaviso + cesantiaCalculo + vacacionesCalculo + salarioNavidadCalculo;

            // Imprimir los resultados
            System.out.println("Nombre solicitado: " + name);
            System.out.println("Monto del Preaviso: " + preaviso);
            System.out.println("Monto de la Cesantía: " + cesantiaCalculo);
            System.out.println("Monto de las Vacaciones: " + vacacionesCalculo);
            System.out.println("Monto del Salario de Navidad: " + salarioNavidadCalculo);
            System.out.println("Monto total a recibir: " + montoTotal);
        }
    }

    }

