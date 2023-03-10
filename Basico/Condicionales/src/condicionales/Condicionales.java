/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionales;


import java.util.Scanner;
/*
== : igualdad
!= : Diferencia
> : Mayor
>= Mayor o igual
< : Menor 
<= : Menor o igual
*/

public class Condicionales {

    public static void main(String[] args) {
        int numero, dato = 5;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        numero = entrada.nextInt();
        //SENTENCIA IF
        if(numero == dato){
            System.out.println("El numero es " + dato);
        }else{
            System.out.println("El numero es diferente de " + dato);
        }
        
        //SENTENCIA SWITCH

        switch(numero){
            case 1: {
                System.out.println("Es el numero "+numero);
                System.out.println("Es el numero "+numero);
            }
            break;
            case 2: System.out.println("Es el numro "+numero);
            break;
            case 3: System.out.println("Es el numero "+numero);
            break;
            case 4: System.out.println("Es el numero "+numero);
            break;
            case 5: System.out.println("Es el numero "+numero);
            break;
            default: System.out.println("El numero fuera de rango");
            break;
        }
        
        if(numero%10==0){
            System.out.println("El numero es multiplo de 10");
        }else{
            System.out.println("El numero no es multiplo de 10");
        }
    }
    
}
