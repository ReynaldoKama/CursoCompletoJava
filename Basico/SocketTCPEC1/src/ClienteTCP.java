
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FOX5
 */
public class ClienteTCP {
    public static void main(String[] args){
        String HOST = "localhost";
        int PUERTO = 5001;
        Scanner entrada = new Scanner(System.in);
        try {
            Socket client = new Socket(HOST, PUERTO);
            boolean continuar = true;
            int cont = 0;
            while(continuar){
                PrintStream toServer = new PrintStream(client.getOutputStream());
                BufferedReader fromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
                String op = entrada.nextLine();
                
                String protocol;
                if("suma".equals(op) || "resta".equals(op) || "multiplicacion".equals(op)){
                    cont +=1;
                    protocol = "operacion:"+op;
                    toServer.println(protocol);
                    String resp = fromServer.readLine();
                    String[] valores = resp.split(":");
                    switch(op){
                        case "suma":{
                            System.out.println("preg "+cont+".- "+valores[2]+" + "+valores[3]);
                            break;
                        }
                        case "resta":{
                            System.out.println("preg "+cont+".- "+valores[2]+" - "+valores[3]);
                            break;
                        }
                        default:{
                            System.out.println("preg "+cont+".- "+valores[2]+" * "+valores[3]);
                            break;
                        }
                    }
                }

                if(!"suma".equals(op)&&!"resta".equals(op)&&!"multiplicacion".equals(op)&&!"terminar".equals(op)){
                    protocol= "operacion:respuesta:"+cont+":"+op;
                    toServer.println(protocol);
                    String evaluacion = fromServer.readLine();
                    String[] eval = evaluacion.split(":");
                    System.out.println(eval[2]);
                }


                if("terminar".equals(op)){
                    protocol= "operacion:terminar";
                    toServer.println(protocol);
                    String terminar = fromServer.readLine();
                    String[] term = terminar.split(":");
                    System.out.println("Correctos "+term[2]);
                    System.out.println("Incorrectos "+term[3]);
                    client.close();
                    continuar = false;
                }
            }  
        } catch (IOException ex) {
            Logger.getLogger(ClienteTCP.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
