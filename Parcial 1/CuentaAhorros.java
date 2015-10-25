package unbank;

public class CuentaAhorros extends Cuenta {

	// Constructor de cuenta de ahorros, recibe el documento del cliente
	// asociado, ID y dinero inicial
	public CuentaAhorros(String DocCliente, String ID, int Valor) {
		// Constructor de la clase padre
		super(DocCliente, ID, Valor);
		// Los costos por retiro de la cuenta de ahorros son 5000
		setCostos(5000);
	};

	// para todo retiro, el costo extra es fijo
	public int getCostoTransaccion(int valor) {
		return getCostos();
	};

	// Imprimir informacion: cuenta de ahorros y datos del metodo de la clase
	// padre
	public void Info() {
		System.out.print("Cuenta Ahorros, ");
		super.Info();
	};
}
