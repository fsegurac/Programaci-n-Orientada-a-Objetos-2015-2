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
	private static int Totales = 0;
	//Variable estatica que indica el total de productos bancarios activos, cada cuenta o prestamo activo añade 1, al deshabilitarse resta 1 al valor de la variable
	private static int Activos = 0;
    //Documento del cliente asociado
	private int DocCliente;
    //ID, indica a que cuenta se retira o consiga, o cual prestamo se desea pagar
	private int ID;
    //Dinero en una cuenta o el valor de la deuda por un prestamo
	private int Valor;
	//Si la cuenta o prestamo estan activos
    private boolean Activo = true;
    
    //Constructor, establece Documento del cliente asociado e ID, ademas añade 1 al numero de productos bancarios
    public ProductoBancario(int ID, int DocCliente){
    	setDocCliente(DocCliente);
		setID(ID);
		addTotales(1);
		addActivos(1);
    }
    
