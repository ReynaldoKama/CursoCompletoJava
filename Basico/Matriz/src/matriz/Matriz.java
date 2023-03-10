/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz;

import java.util.Scanner;

/**
 *
 * @author FOX5
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][]={{1,2,3},{4,5,6},{7,8,9}};
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        
        int matriz1[][],nFilas,nColum;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite la cantidad de filas: ");
        nFilas = entrada.nextInt();
        System.out.print("Digite la cantidad de columnas: ");
        nColum = entrada.nextInt();
        
        System.out.println("Digite la matriz: ");
        matriz1 =new int[nFilas][nColum];
        for(int i=0;i<nFilas;i++){
            for(int j=0;j<nColum;j++){
                System.out.print("matriz["+i+"]["+j+"]: ");
                matriz1[i][j]=entrada.nextInt();
            }
        }
        
        for(int i=0;i<nFilas;i++){
            for(int j=0;j<nColum;j++){
                System.out.print(matriz1[i][j]);
            }
            System.out.println("");
        }
    }
    
}
