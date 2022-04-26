package Ejercicios;

import java.util.Scanner;

public class ejercicio3semana2 {
    public static void main(String[] args) {
        double SalarioBase = 800.00;
        double Salario = 0.0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de autos vendidos");
        double n = leer.nextDouble();
        
        System.out.println("Ingrese el nombre de el vendedor");
        String nombre = leer.next();
        
        //System.out.println("Cuantas ventas realizo en el mes: ");
        //int xVentas = leer.nextInt();
        double com = comisionAutosDos();
        
        //comisionAutosVendidos(n);       
        Salario = SalarioBase + comisionAutosVendidos(n) + com;
        
        System.out.println("El salario es: $" + Salario);
        System.out.println("El nombre  es: " + nombre);
        
        
        
    }
    
    public static double comisionAutosVendidos(double cantidad) {
        //double comi = 170;
        double TotalComision = 170 * cantidad;
        return TotalComision;
    }
    public static double comisionAutosDos() {
        int xVentas = 3;
        double ValorV1 = 5000;
        double ValorV2 = 7000;
        double ValorV3 = 15000;
        
        double comision = (ValorV1 * 0.05) + (ValorV2 * 0.05) + (ValorV3 * 0.05);
        return comision;
    }
}
