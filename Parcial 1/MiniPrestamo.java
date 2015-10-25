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
      public MiniPrestamo( int DocCliente, int ID, int valor,int cuotas ){
    	 super();
    	 //El valor del miniprestamo es menor o igual a 50000
    	 if(valor >0 && valor <= 5000000){
    		 setValor(valor);
    	 }else{
    		 //Valor por defecto en caso de registrar un valor invalido
    		       System.out.println("Por favor ingrese un valor válido o solicite un prestamo hipotecario.");
    	 }
         
         
    	 //Valor extra al cobrar el prestamo es del 10%
    	 setInteres(valor/);
    	 //Paln de pago quincenal
    	 setPlanPago("Mensual");
      }
}
