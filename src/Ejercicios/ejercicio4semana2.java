package Ejercicios;

import java.util.Scanner;

public class ejercicio4semana2 {
    public static void main(String[] args) {
        //Declaracion de variables
        double Salario = 300.00;
        double Comision = 50.00;
        double Renta = 0.10;
        double SalarioC;
        double SalarioR;
        double SalarioTotal;
        double comision;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar el nombre de el vendedor");
        String nombre = leer.nextLine();
        
        System.out.println("Cuantas ventas realizó en el mes");
        double Venta = leer.nextDouble();
        
        comision = Venta * Comision;
       
        
        SalarioC = Salario + comision;
        SalarioR = Salario * Renta;
        SalarioTotal = SalarioC - SalarioR;
        
        System.out.println("El salatio total es de: $" + SalarioTotal);
        
        Renta = Salario * Renta;
        
        System.out.println("El monto a pagar de renta es de: $" + Renta);
    }

    public ejercicio4semana2() {
    }
}