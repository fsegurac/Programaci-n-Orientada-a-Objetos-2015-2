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
	public PrestamoHipoteca( String docCliente, String id, int valor ,int cuotas){
         super(docCliente, id,valor,cuotas);
     //El valor de un prestamo de hipoteca va desde 50000 para arriba
   	 
   	 //Plan de pago mensual
   	 setPlanPago("Semestral");
    }
}
