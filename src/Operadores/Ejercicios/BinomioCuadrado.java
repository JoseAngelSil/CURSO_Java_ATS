package Operadores.Ejercicios;

import java.util.Scanner;

public class BinomioCuadrado {
    /**
     * Calcular el cuadrado de una suma
     */
    public static void main(String[] args) {
        Scanner inConsole = new Scanner(System.in);
        float a, b; double suma;
        System.out.print("Ingrese el valor de a \n>");
        a = inConsole.nextFloat();
        System.out.print("Ingrese el valor de b \n>");
        b = inConsole.nextFloat();
        suma = Math.pow(a, 2) + (2*a*b) + Math.pow(b,2);
        System.out.println("suma = " + suma);
    }
}
