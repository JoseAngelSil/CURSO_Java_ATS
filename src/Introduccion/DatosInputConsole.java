package Introduccion;

import java.util.Scanner;
/**
 * Ingresar datos por medio de consola en Java
 */
public class DatosInputConsole {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");

        String nombre = entrada.nextLine();

        System.out.print("Ingrese su edad: ");

        int edad = Integer.parseInt( entrada.next());

        System.out.printf("Hola %s, que bueno que tengas %d años \n",nombre,edad);
    }
}
