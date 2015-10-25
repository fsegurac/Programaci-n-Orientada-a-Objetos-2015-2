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


public abstract class Prestamo extends ProductoBancario{
	 //Cobro extra por prestamo definido por el tipo de prestamo
     private int Interes;
     //Plan de pago, Mensual, quincenal, etc.
     private String PlanPago;
     
     private int cuotas;
     
    //Mismo constructor que el ProductoBancario 
    public Prestamo(int ID, int DocCliente, int cuotas){
    	super();
        this.cuotas=cuotas;
    }
     
    public int getInteres() {
		return Interes;
	}
     
	public void setInteres(int interes) {
		Interes = interes;
	}
}    