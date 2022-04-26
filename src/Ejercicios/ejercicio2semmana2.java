
package Ejercicios;

import java.util.Scanner;

public class ejercicio2semmana2 {
    public static void main(String[] args) {
        double DAI;
        double Depreciacion = 0.10;
        double Total1;
        double Total2;
        double Total3;
        double Mul1 = 0.25;
        double Mul2 = 0.10;
        double Total;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar el valor del vehiculo");
        double valorV = leer.nextDouble();
        
        System.out.println("Ingrsar el costo por flete");
        double flete = leer.nextDouble();
        
        System.out.println("Ingresar el valor de seguro");
        double seguro = leer.nextDouble();
        
        DAI = valorV * Depreciacion;
        Total1 = valorV - DAI;
        Total2 = Total1 - flete;
        Total3 = Total2 - seguro;
        Total = Total3 * Mul1;
        
        System.out.println("EL valor por Derecho Arancelario a la importacion es de: $" + Total);
        
        Depreciacion = valorV * Mul2;
        
        System.out.println("El valor de Depreciacion es de: $" + Depreciacion);
        
    }
}
