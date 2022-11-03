package Operadores.Ejercicios;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Calificacion 1: ");
        double numeroA = input.nextDouble();
        System.out.print("Calificacion 2: ");
        double numeroB = input.nextDouble();
        System.out.print("Calificacion 3: ");
        double numeroC = input.nextDouble();
        double resultado = Suma(numeroA,numeroB, numeroC);
        double promedio = Promedio(resultado);
        System.out.println("El promedio del alumno es " + promedio);
    }
    private static double Suma(double a, double b, double c){
        return a + b + c;
    }
    private static double Promedio (double suma){
        return suma/3;
    }
}
