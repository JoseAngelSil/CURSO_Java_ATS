package Operadores.Ejercicios;

import java.util.Scanner;

public class CalcHoras {
    public static void main(String[] args) {
        Scanner inputConsole = new Scanner(System.in);
        int cantHoras, semanas, dias, horas;
        System.out.print("Ingrese la cantidad de horas \n>");
        cantHoras = inputConsole.nextInt();
        semanas = cantHoras / (24 * 7);
        System.out.println("semanas = " + semanas);
        dias = cantHoras % (24*7)/24;
        System.out.println("dias = " + dias);
        horas = cantHoras % 24;
        System.out.println("horas = " + horas);

    }
}
