package Ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class ejercicio5semana2 {
    public static void main(String[] args) {
        //Declaracion de variables
        double SalarioB;
        double DescuentoT;
        double Renta = 0.10;
        double SalarioM;
        double Salario1;
        double f;
        double MinutoT;
        double Total;
        Scanner leer = new Scanner(System.in);
        NumberFormat formato = new DecimalFormat("#0.00");
        
        System.out.println("Ingrese el nombre");
        String nombre = leer.nextLine();
        
        System.out.println("Ingrese el salario");
        double Salario = leer.nextDouble();
        
        System.out.println("Ingrese los minutos tardes");
        double Minuto = leer.nextDouble();
        
        //Salario por minuto
        
        MinutoT = Salario / 30;
        Salario1 = MinutoT / 8;
        SalarioM = Salario1 / 60;
        f = SalarioM * Minuto;
        
        //Formula
        
        SalarioB = Salario - f;
        DescuentoT = SalarioB * Renta;
        Total = SalarioB - DescuentoT;
        
        System.out.println("El nombre es: " + nombre);
        
        System.out.println("El descuento por entregas tardias es: " + formato.format(f));
        
        System.out.println("La retencion es: $" + formato.format(DescuentoT));
        
        System.out.println("El salario total es : $" + formato.format(Total) );         
    } 
}