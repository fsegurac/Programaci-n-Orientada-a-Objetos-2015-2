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
public abstract class ProductoBancario {
	
	//Variable estatica que indica el total de productos bancarios, cada cuenta o prestamo añade 1 al valor de la variable
	private static int totales = 0;
	//Variable estatica que indica el total de productos bancarios activos, cada cuenta o prestamo activo añade 1, al deshabilitarse resta 1 al valor de la variable
	private static int activos = 0;
    //Documento del cliente asociado
	private String docCliente;
    //ID, indica a que cuenta se retira o consiga, o cual prestamo se desea pagar
	private String id;
    //Dinero en una cuenta o el valor de la deuda por un prestamo
	private int valor;
	//Si la cuenta o prestamo estan activos
    private boolean activo = true;
    
    //Constructor, establece Documento del cliente asociado e ID, ademas añade 1 al numero de productos bancarios
    public ProductoBancario(String docCliente, String id){
    	setDocCliente(docCliente);
        setID(id);
        addTotales(1);
        addActivos(1);
    }
    
     public void setDocCliente(String docCliente){
     this.docCliente=docCliente;
     }

     public String getDocCliente(){
     return docCliente;    
     }

     public void setID(String id){
     this.id=id;
     }

     public String getID(){
     return id;
     }
     
     public void setValor(int valor){
     this.valor=valor;
     }
     
     public int setValor(){
     return valor;
     }

     public void addTotales(int t){
     this.totales=totales+t;
     }

     public void addActivos(int a){
     this.activos=activos+a;
     }
}