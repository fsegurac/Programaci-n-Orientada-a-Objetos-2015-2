/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectoparcial;

import java.util.Scanner;
/**
 *
 * @author Chesito!!!
 */
public class ProyectoParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op1;
        String docCliente;
        String id;
        int valor;
        
        
        System.out.println("BIENVENIDO AL UNBANK: \n¿Qué operación desea realizar?\n1.Crear Cliente nuevo\n2.Crear un prestamo\n3.Consultar información\n4.Hacer un retiro\n5.Cobrar\n6.Test");
        
        Scanner op1s=new Scanner(System.in);
        op1=op1s.nextInt();
        
      if(op1>0&&op1<=6){
      switch(op1){
          case 1: 
              System.out.println("Por favor ingrese los datos del nuevo cliente");
              
          case 2:
              
              System.out.println("Por favor ingrese los datos del nuevo prestamo(Documento del cliente, id cuenta, valor)");
              Scanner dato=new Scanner(System.in);
              docCliente=dato.nextLine();
              id=dato.nextLine();
              Scanner dato1=new Scanner(System.in);
              valor=dato1.nextInt();
              Cliente pedirP= new PedirPrestamo(docCliente,id,valor);                                                                                                    
              break;
          case 3:
              System.out.println("Ingrese el id del cliente que quiere consultar");
              break;
          case 4:
              System.out.println("Ingrese los datos del retiro(id, valor)");
              break;
          case 5:
              System.out.println("¿Desea cobrar todos los prestamos ahora?");
              break;
          
          case 6:
              
              //Aquí habría que crear en la clase banco un método test sin parámetros, el cual contenga todo
              //lo que David propuso para testear el banco.
              Banco test= new testBanco();
        }
      
      }else{
          System.out.println("Por favor ingrese un valor válido");                  
      }
    }
    
}
