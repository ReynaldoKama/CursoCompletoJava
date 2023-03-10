/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodoinsercion;

import java.util.Scanner;

/**
 *
 * @author FOX5
 */
public class MetodoInsercion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[],nElem,pos,aux;
        
        nElem = entrada.nextInt();
        
        arreglo = new int[nElem];
        System.out.println("Digite el arreglo: ");
        for(int i=0;i<nElem;i++){
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i]=entrada.nextInt();
        }
        
        //ORDENAMIENTO POR INSERCION
        for(int i=0;i<nElem;i++){
            pos=i;
            aux = arreglo[i];
            
            while((pos>0)&&(arreglo[pos-1]>aux)){
                arreglo[pos]=arreglo[pos-1];
                pos--;
            }
            arreglo[pos]=aux;
        }
        System.out.println("Arreglo ordenado creciente");
        for(int i:arreglo){
            System.out.println(i);
        }
    }
    
}
