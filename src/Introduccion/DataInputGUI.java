package Introduccion;

import javax.swing.*;

public class DataInputGUI {
    public static void main(String[] args) {
        String nombre;
        int entero;
        char caracter;
        double decimal;

        nombre = JOptionPane.showInputDialog("Ingresa nombre de usuario");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad"));
        caracter = JOptionPane.showInputDialog("Ingresa un caracter").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu salarario quincenal"));

        JOptionPane.showMessageDialog(null, "Nombre: " + nombre);
        JOptionPane.showMessageDialog(null, "Edad: " + entero);
        JOptionPane.showMessageDialog(null, "Caracter: " + caracter);
        JOptionPane.showMessageDialog(null, "Salario: $" + decimal );
    }
}
