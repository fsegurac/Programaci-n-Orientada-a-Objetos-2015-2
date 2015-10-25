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
     private int interes;
     //Plan de pago, Mensual, quincenal, etc.
     private String planPago;
     
     private int cuotas;
     
    //Mismo constructor que el ProductoBancario 
    public Prestamo(String docCliente,String id, int valor,int cuotas){
    	super(docCliente,id);
        this.cuotas=cuotas;
        setValor(valor);
        setInteres(valor/cuotas);
    }
     
     public void setInteres(int interes) {
     this.interes = interes;
     }
     
     public int getInteres() {
     return interes;
     }
        
     public void setPlanPago(String planPago){
     this.planPago=planPago;
     }
     
     public String getPlanPago(){
     return planPago;
     }
     
    // public void PedirPrestamo(String docCliente,String id,int valor){
     
     //if(valor>0){    
      //if(valor>0 && valor<=5000000){
        //  System.out.println("Su prestamo será de tipo mini");
          //Scanner c=new Scanner(System.in);
          //cuotas=c.nextInt();
          //System.out.println("Por favor ingrese el número de cuotas");
          //MiniPrestamo p = new MiniPrestamo(docCliente, id,valor,int cuotas);
          //Prestamo.put(id,p);
          
      //}else{ 
        //  System.out.println("Su prestamo será de tipo hipoteca");
          //Scanner c=new Scanner(System.in);
          //cuotas=c.nextInt(); 
          //System.out.println("Por favor ingrese el número de cuotas");
          //PrestamoHipoteca p = new PrestamoHipoteca(docCliente,id,valor,int cuotas);
          //Prestamo.put(id,p);
      //}
     //}else{
       //  System.out.println("Por favor ingrese un valor válido");
     //}

    //}
     
}

