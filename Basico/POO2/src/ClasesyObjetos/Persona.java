/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesyObjetos;

/**
 *
 * @author FOX5
 */
public class Persona {
    String nombre;
    int edad;
    
    // Metodos
    
    //Metodo constructor
    public Persona(String _nombre, int _edad){
        nombre=_nombre; // se pone this cuando los parametros son el mismo nombre que los atributos
        edad = _edad;
    }
    
    public void mostrar(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
}
