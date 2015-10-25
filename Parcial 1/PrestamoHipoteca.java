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
public class PrestamoHipoteca extends Prestamo{

	//Constructor de un prestamo de hipoteca, recibe documento del cliente, ID y valor del prestamo
	public PrestamoHipoteca( int DocCliente, int ID, int valor ,int cuotas){
        super();
     //El valor de un prestamo de hipoteca va desde 50000 para arriba
   	 if(valor>0 && valor > 5000000 ){
   		 setValor(valor);
   	 }else{
   		        System.out.println("Por favor solicite un miniprestamo"); 
   	 }
   	 //El interes al cobrar el prestamo de hipoteca es del 6%
   	 setInteres(valor/cuotas);
   	 //Plan de pago mensual
   	 setPlanPago("Semestral");
    }
}
