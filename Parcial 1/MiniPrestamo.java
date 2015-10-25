/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unbank;

/**
 *
 * @author Chesito!!!
 */
public class MiniPrestamo extends Prestamo{
	
	  //Constructor del miniprestamo, recibe documento del cliente, ID y valor
      public MiniPrestamo( String docCliente,String id, int valor,int cuotas ){
    	 super(docCliente,id,valor,cuotas); 
    	 
    	 //Plan de pago
    	 setPlanPago("Mensual");
      }
}
