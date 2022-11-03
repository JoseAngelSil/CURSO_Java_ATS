package Operadores;

import java.util.Scanner;

public class OperadoresAritmaticos {
    public static void main(String[] args) {
        Scanner inputConsole = new Scanner(System.in);
        float n1, n2, sum, res, mul,div;
        System.out.print("Ingrese el valor de n1: ");
        n1 = inputConsole.nextFloat();
        System.out.print("Ingrese el valor de n2: ");
        n2 = inputConsole.nextFloat();
        sum = n1 + n2;
        res = n1 - n2;
        mul = n1 * n2;
        div = n1 / n2;
        System.out.println("La suma es " + sum);
        System.out.println("La resta es " + res);
        System.out.println("La multi es " + mul);
        System.out.println("La div es " + div);


        //Operadores combinados
        System.out.println("Operadores convinados");
        int n = 5;
        n ++;
        System.out.println("n = " + n);
        n += 15;
        System.out.println("n = " + n);
        n *= 2;
        System.out.println("n = " + n);
        n %= 3;
        System.out.println("n = " + n);
        
        //Operador de incremento y decremento
        System.out.println("Incremento y decremento");
        int m = 5;
        System.out.println("m = " + m);
        m ++;
        System.out.println("m = " + m);
        ++m;
        System.out.println("m = " + m);
        --m;
        System.out.println("m = " + m);
        m --;
        System.out.println("m = " + m);
    }
}
