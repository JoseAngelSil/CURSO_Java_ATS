package Operadores.Ejercicios;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Numero 1: ");
        int numeroA = input.nextInt();
        System.out.print("Numero 2: ");
        int numeroB = input.nextInt();
        int resultado = Suma(numeroA,numeroB);
        System.out.printf("La suma es %d \n",resultado);
    }
    private static int Suma(int a, int b){
        return a + b;
    }
}
