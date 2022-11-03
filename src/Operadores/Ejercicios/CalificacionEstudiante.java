package Operadores.Ejercicios;

import java.util.Scanner;

public class CalificacionEstudiante {
    public static void main(String[] args) {
        float parti, exam1, exam2, examfinal, calFinal;
        Scanner inConsole = new Scanner(System.in);

        System.out.print("Calificacion de participacion \n>");
        parti = inConsole.nextFloat();
        System.out.print("Calificacion de Examen 1 \n>");
        exam1 = inConsole.nextFloat();
        System.out.print("Calificacion de Examen 2 \n>");
        exam2 = inConsole.nextFloat();
        System.out.print("Calificacion de Examen final \n>");
        examfinal = inConsole.nextFloat();
        calFinal = (parti * 0.1f) + (exam1 * 0.25f) + (exam2 * 0.25f) + (examfinal * 0.4f);
        System.out.println("calFinal = " + calFinal);
    }
}
