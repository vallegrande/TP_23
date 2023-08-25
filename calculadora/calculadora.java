/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab02
 */
public class calculadora {

    int num1, num2;
    double total, resta, multipli, division, resi;

    public void sumar() {

        total = num1 + num2;
    }

    public void restar() {
        resta = num1 - num2;
    }

    public void multiplicacion() {
        multipli = num1 * num2;
    }

    public void division() {
        division = num1 / num2;
    }
    
    public void residuo() {
        resi = num1 % num2 ;
    }

    public void ingresarDatos() {
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte un numero "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte segundo numero "));
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Suma : " + total + "\n Resta : " + resta + "\n Multiplicacion : " + multipli + "\n Division : " + division + "\n Resuido : " + resi);
    }

    public static void main(String[] args) {
        calculadora operacion = new calculadora();

        operacion.ingresarDatos();
        operacion.sumar();
        operacion.restar();
        operacion.multiplicacion();
        operacion.division();
        operacion.residuo();
        operacion.mostrarDatos();
    }
}
