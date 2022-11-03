package Operadores.Ejercicios;

import java.util.Scanner;

public class SalarioSemanal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double horaSemana, salarioPorHora;
        System.out.print("Ingrese las horas trabajadas: ");
        horaSemana = input.nextDouble();
        System.out.print("Ingrese Salario por hora: ");
        salarioPorHora = input.nextDouble();
        System.out.println("Salario Semanal: $" + salario(horaSemana,salarioPorHora));
    }

    /**
     *
     * @param horas Ingresar las horas semanal total trabajado
     * @param salarioHora  Ingresar el salario pagado por hora
     * @return el salario total por la semana trabajada
     */
    private static double salario(double horas, double salarioHora){
        return  horas * salarioHora;
    }
}
