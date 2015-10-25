package unbank;

public abstract class Cuenta extends ProductoBancario {

	// Costo por el retiro de dinero, lo establece el tipo de cuenta
	private int Costos;

	public int getCostos() {
		return Costos;
	}

	public void setCostos(int costos) {
		Costos = costos;
	}

	// Informacion que se imprime de una cuenta cuando el cliente solicita su
	// informacion
	public void Info() {
		System.out.print("Documento del cliente: " + getDocCliente()
				+ ", ID de cuenta: " + getID() + ", Dinero: " + getValor()
				+ ", Estado: ");
		// Imprimir estado de la cuenta, activo o inactivo
		if (isActivo() == true) {
			System.out.println("Activo");
		} else {
			System.out.println("Inactivo");
		}
		;
	};

	// Constructor de cuenta, recibe el documento del cliente asociado, ID Y
	// dinero inicial
	public Cuenta(String DocCliente, String ID, int Valor) {
		// constructor de ProductoBancario
		super(ID, DocCliente);
		setValor(Valor);
	};

	// Cerrar una cuenta bancaria
	public void CerrarCuenta() {
		// Valor de la cuenta es cero, se retira todo el dinero
		setValor(0);
		// se deshabilita la cuenta
		setActivo(false);
		// restar 1 al numero de productos bancarios activos
		ProductoBancario.addActivos(-1);
	}

	// Costo por transaccion segun el tipo de cuenta, metodo abstracto
	public abstract int getCostoTransaccion(int valor);
}
