
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
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
public class ServidorTCP {
    public static void main(String[] args){
        int PUERTO = 5001;
        ServerSocket server;
        try {
            server = new ServerSocket(PUERTO);
            System.out.println("Se inicio el servidor");
            Socket client;
            PrintStream toClient;
            BufferedReader fromClient;
//            HttpSession sesion = request.getSession();
//            sesion.SetAtribute("curso","valor");
//            HttpSession sesion = request.getSession(false); se pone false para leer
//            String dato = (String)sesion.getAtribute("curso"); recuperamos el valoe en dato           
            while(true){
                client = server.accept();
                System.out.println("Cliente se conecto");
                boolean continuar = true;
                int corr =0;
                int inc = 0;
                int resultado = 0;
                while(continuar){
                    fromClient = new BufferedReader(new InputStreamReader(client.getInputStream()));
                    String mensaje = fromClient.readLine();
                    String[] valores = mensaje.split(":");
                    System.out.println(valores[1]);
                    String op=valores[1];
                    
                    
                    if("suma".equals(op) || "resta".equals(op) || "multiplicacion".equals(op)){
                        int num1 = (int)(Math.random()*10+1);
                        int num2 = (int)(Math.random()*10+1);
                        
                       switch(op){
                            case "suma":{
                                resultado = num1 + num2;
                                toClient = new PrintStream(client.getOutputStream());
                                String protocol = "operacion:pregunta:"+num1+":"+num2+":"+"suma:"+1;
                                toClient.println(protocol);
                                break;
                            }
                            case "resta":{
                                resultado = num1 - num2;
                                toClient = new PrintStream(client.getOutputStream());
                                String protocol = "operacion:pregunta:"+num1+":"+num2+":"+"resta:"+1;
                                toClient.println(protocol);
                                break;
                            }
                            default: {
                                resultado = num1 * num2;
                                toClient = new PrintStream(client.getOutputStream());
                                String protocol = "operacion:pregunta:"+num1+":"+num2+":"+"multiplicacion:"+1;
                                toClient.println(protocol);
                                break;
                            }
                        } 
                    }


                    if("respuesta".equals(op)){
                        System.out.println(valores[3]);
                        int valor = Integer.parseUnsignedInt(valores[3]);
                        if(valor == resultado){
                            corr +=1;
                            toClient = new PrintStream(client.getOutputStream());
                            String protocol = "operacion:evaluacion:correcto:"+1;
                            toClient.println(protocol);
                        }else{
                            inc +=1;
                            toClient = new PrintStream(client.getOutputStream());
                            String protocol = "operacion:evaluacion:incorrecto:"+1;
                            toClient.println(protocol);
                        }
                    }



                    //int valor = Integer.parseUnsignedInt(resp[3]);
                    if("terminar".equals(op)){
                        toClient = new PrintStream(client.getOutputStream());
                        String protocol = "operacion:terminar:"+corr+":"+inc;
                        toClient.println(protocol);
                        client.close();
                        System.out.println("cliente se desconecto");
                        continuar=false;
                    }
                }
                
                
            }
            
        } catch (IOException ex) {
            Logger.getLogger(ServidorTCP.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
