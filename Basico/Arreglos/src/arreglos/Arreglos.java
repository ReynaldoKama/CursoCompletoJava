/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author FOX5
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        int[] numeros = new int[3];
        numeros[0] = 7;
        numeros[1] = 10;
        numeros[2] = 13;*/
        int[] numeros = {7,10,13};
        
        for(int i=0;i<3;i++){
            System.out.println(numeros[i]);
        }
        int nElem;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la cantidad de elementos del arreglo: ");
        nElem = entrada.nextInt();
        char[] letras = new char[nElem];
        
        System.out.println("Digite los elementos del arreglo: ");
        for(int i=0;i<nElem;i++){
            System.out.print((i+1)+"/ Digite un caracter: ");
            letras[i] = entrada.next().charAt(0);
        }
        System.out.println("Los caracteres son:");
        for(int i =0;i<nElem;i++){
            System.out.print(letras[i]+" ");
        }
        //BUCLE FOR EACH
        String[] nombres = {"Juan","Luis","Jessica","Luisa","Diana","Lucas","Denil"};
        for(int i=0;i<nombres.length;i++){
            System.out.println(nombres[i]);
        }
        
        
        for(String i:nombres){
            System.out.println(i);
        }//for(Tipo_de_dato_arreglo iterador:nombre_arreglo)
    }
    
}
