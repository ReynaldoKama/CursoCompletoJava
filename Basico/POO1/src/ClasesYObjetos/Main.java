/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesYObjetos;

import java.util.Scanner;

/**
 *
 * @author FOX5
 */
public class Main {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        Operaciones op = new Operaciones();
        
        int suma = op.sumar(n1, n2);
        int resta = op.restar(n1, n2);
        int mult = op.multiplicar(n1, n2);
        int division=op.dividir(n1, n2);
        op.mostrar(suma, resta, mult, division);
    }
}
