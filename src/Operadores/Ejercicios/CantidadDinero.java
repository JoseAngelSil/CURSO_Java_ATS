package Operadores.Ejercicios;

import java.util.Scanner;

public class CantidadDinero {
    /**
     * Guillermo tiene N dolares, Luis tiene la mitad de lo que posee Guillermo,
     * Juan tiene la mitad de lo que poseen Luis y Guillermos Juntos.
     * Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres
     */
    public static void main(String[] args) {
        double guillermo, luis, juan, total;
        Scanner inputConsole = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de dolares que posee Guillermo: ");
        guillermo = Double.parseDouble(inputConsole.nextLine());
        
        luis = guillermo / 2;
        System.out.println("luis = " + luis);
        juan = (guillermo + luis) / 2;
        System.out.println("juan = " + juan);
        total = guillermo + luis + juan;
        System.out.println("total = " + total);
    }
}
