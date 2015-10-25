package unbank;

import java.util.HashMap;

public class UNBank {

	// Hashmap de Clientes, el String de direccion corresponde a su atributo
	// documento
	HashMap<String, Cliente> Clientes = new HashMap<String, Cliente>();

	// Conocer los productos bancarios de un cliente dado su documento, solo
	// informacion de prestamos
	public void ProductosBancariosCliente(String DocCliente) {

		// Solo se muestra informacion de los prestamos, los prestamos de un
		// cliente estan en un HashMap como atributo
		for (Prestamo p : Clientes.get(DocCliente).prestamos.values()) {
			// Metodo del prestamo para mostrar informacion
			p.Informacion();
		}
		;
	};

	// Conocer los productos bancarios activos de un cliente dado su docuemnto
	public void ProductosBancariosActivos(String DocCliente) {

		// De igual forma que en la totalidad de productos bancarios, pero
		// comprobando su estado, activo o inactivo.
		for (Prestamo p : Clientes.get(DocCliente).prestamos.values()) {
			if (p.isActivo() == true) {
				p.Informacion();
			}
			;
		}
		;
	};

	// Conocer productos bancarios totales pasando por cada cliente
	public void ProductosBancariosTotales() {
		for (Cliente c : Clientes.values()) {
			ProductosBancariosCliente(c.getDocumento());
		}
		;
	};

	// Conocer productos bancarios activos pasando por cada cliente
	public void ProductosBancariosActivosTotales() {
		for (Cliente c : Clientes.values()) {
			ProductosBancariosActivos(c.getDocumento());
		}
		;
	};

	// Cobrar todos los prestamos activos de un cliente dado su documento
	public void CobroCliente(String DocCliente) {
		// Pasar por cada prestamo activo de un cliente
		for (Prestamo p : Clientes.get(DocCliente).prestamos.values()) {
			// Efectuar el cobro con un metodo del prestamo, se envia el Hashmap
			// de cuentas del cliente a cobrar
			p.Cobro(Clientes.get(DocCliente).cuentas);
		}
		;
	};

	// Cobrar a todos los clientes, de igual forma que el cobro individual,
	// iterando en el hashmap de clientes
	public void CobroClientes() {
		for (Cliente c : Clientes.values()) {
			CobroCliente(c.getDocumento());
		}
		;
	};

	// Numero de productos bancarios que se han hecho
	public void NumeroTotales() {
		// Imprimir atributo estatico de ProductoBancario que indica el numero
		// de subclases de producto bancario que se han creado
		System.out.println("Productos bancarios totales: "
				+ ProductoBancario.getTotales());
	};

	// Numero de productos bancarios activos actuales
	public void NumeroActivos() {
		// Imprimir atributo estatico de ProductoBancario que indica el numero
		// de subclases de producto bancario que se han creado, cuyo estado sea
		// activo actualmente
		System.out.println("Productos bancarios activos: "
				+ ProductoBancario.getActivos());
	};

	// Constructor del banco, necesita crearse por lo menos un cliente y una
	// cuenta para ese cliente
	public UNBank(String nombre, String documento, String contacto, String tipoCliente,
			String Tipo, String IDCuenta, int valor) {
		// Recibe de argumentos: nombre del nuevo cliente, documento, contacto,
		// tipo de cuenta,tipo de cliente, id de nueva cuenta, dinero inicial en la cuenta
		Cliente c1 = new Cliente(nombre, documento, contacto, tipoCliente, Tipo, IDCuenta,
				valor);
		// Añadir cliente al HashMap de clientes
		Clientes.put(documento, c1);
	};

}
