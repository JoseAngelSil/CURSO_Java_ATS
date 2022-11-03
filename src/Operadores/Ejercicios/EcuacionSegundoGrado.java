package Operadores.Ejercicios;

import java.util.Scanner;

public class EcuacionSegundoGrado {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a,b,c;
        double x1,x2;

        System.out.print("Ingrese el valor de A \n>");
        a = in.nextFloat();
        System.out.print("Ingrese el valor de B \n>");
        b = in.nextFloat();
        System.out.print("Ingrese el valor de C \n>");
        c = in.nextFloat();

        x1 = (-b + (Math.sqrt(Math.pow(b,2) - (4*a*c)))) / (2*a);
        System.out.println("x1 = " + x1);
        x2 = (-b - (Math.sqrt(Math.pow(b,2) - (4*a*c)))) / (2*a);
        System.out.println("x2 = " + x2);

    }
}
