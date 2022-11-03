package Operadores.Ejercicios;

import java.util.Scanner;

public class SalarioVendedor {
    /**
     * una compañia de venta de carros usados, paga a su personal $1000 de forma mensual
     * mas una comision de $150 por cada carro vendido, mas el 5% del valor por cada carro  vendido.
     * Cada mes el capturista de la empresa ingresa en la computadora los datos pertinentes, hacer un programa
     * que calcule e imprima el salario mensual de un vendedor dado
     */
    public static void main(String[] args) {
        final double salarioMensual = 1000d;
        double cantAutosVendidos, comision, insentivoVenta, costoCarro, total;
        Scanner inputConsole = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de carros vendidos \n>");
        cantAutosVendidos = inputConsole.nextDouble();
        System.out.print("Ingrese el costo de los carros \n>");
        costoCarro = inputConsole.nextDouble();

        comision = 150 * cantAutosVendidos;
        System.out.println("comision = " + comision);
        insentivoVenta = (0.05 * costoCarro) * cantAutosVendidos;
        System.out.println("insentivoVenta = " + insentivoVenta);
        total = salarioMensual + comision + insentivoVenta;
        System.out.println("salarioMensual = " + salarioMensual);
        System.out.println("total = " + total);
    }
}
