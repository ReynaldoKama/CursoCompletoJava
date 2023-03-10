/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introduccion;

import java.util.Scanner;

/**
 *
 * @author FOX5
 */
public class Introduccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Introducir Numeros
        Scanner entrada = new Scanner(System.in);
        int ni;
        System.out.print("Digite un numero Entero: ");
        ni = entrada.nextInt();// Introducir el numero con coma 5,6
        float nf;
        System.out.print("Digite un numero Flotante: ");
        nf = entrada.nextFloat();
        double nd;
        System.out.print("Digite un numero Double: ");
        nd = entrada.nextDouble();
        System.out.println("El numero entero es: "+ni);
        System.out.println("El numero flotante es: "+nf);
        System.out.println("El numero Double es: "+nd);
        
        //Introducir cadenas
        //String cadena;
        //System.out.print("Digite una cadena: ");
        //cadena = entrada.next();// solo guarda una cadena sin espacios
        String caden;
        System.out.println("Digite una cadena nueva: ");
        caden = entrada.nextLine();//guarda una cadena con espacios
        char letra;
        System.out.println("Digite un caracter: ");
        letra = entrada.next().charAt(0);
        //System.out.println("La cadena es: "+cadena);
        System.out.println("La cadena completa es: "+caden+" "+letra);
        
    }
    
}
