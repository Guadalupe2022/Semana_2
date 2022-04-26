
package Ejercicios;

import java.util.Scanner;

public class ejercicio1semana2 {
    public static void main(String[] args) {
        double rebaja = 0.15;
        double IVA = 0.13;
        double precioTotal = 0.0;
        double precioIVA;
        double preciofinal;
        double total;
        Scanner leer = new Scanner(System.in);
       
        System.out.println("Imgrese el precio de la computadora");
        double n = leer.nextDouble();
        
        precioTotal = n * IVA;
        precioIVA = n + precioTotal;
        preciofinal = precioIVA * rebaja;
        total = precioIVA - preciofinal;
        
        System.out.println("El total es: $" + total);
        
        
    }
}
