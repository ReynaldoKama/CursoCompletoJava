/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author FOX5
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float a,b,suma,resta,mult,div,resto;
        int numero = 10;
        int x = 5, y;
        
        System.out.print("Digite el valor de a: ");
        a=entrada.nextFloat();
        System.out.print("Digite el valor de b: ");
        b=entrada.nextFloat();
        suma=a+b;
        resta = a - b;
        mult = a * b;
        div = a / b;
        resto = a % b;
        
        System.out.println("la suma es: " + suma);
        System.out.println("la resta es: " + resta);
        System.out.println("la multiplicacion es: " + mult);
        System.out.println("la division es: " + div);
        System.out.println("El resto es: " + resto);
        numero += 5; //numero = numero + 5;
        numero -=5;
        numero *=5;
        numero /=5;
        numero %=5;
        System.out.println(numero);
          
        //INCREMENTO Y DECREMENTO
        x++; //x = x + 1;
        x--;
        y = x++;// asigna a y el valor actual y lugo aumente en un el valor de x
        
        System.out.println(y);
        System.out.println(x);
        y = ++x;// primero aumente el valor de x y luego le asigana a y
        System.out.println(y);
        System.out.println(x);
        double raiz = Math.sqrt(9);
        int raiz1 = (int)Math.sqrt(9);
        
        double base =5;
        double exponente=2;
        double resultado = Math.pow(base, exponente);
        
        double num = 4.44;
        long result = Math.round(num);//double a long y de float a int
        float num1 = 4.56f;
        int result1 = Math.round(num1);
        
        double num2 = Math.random();
        System.out.println(raiz);
        System.out.println(raiz1);
        System.out.println(resultado);
        System.out.println(result);
        System.out.println(result1);
        System.out.println("Numero aleatorio: "+num2);
        
    }
    
}
