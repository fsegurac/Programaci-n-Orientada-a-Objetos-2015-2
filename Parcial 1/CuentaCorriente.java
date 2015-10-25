package unbank;

public class CuentaCorriente extends Cuenta {

	// Constructor de cuenta corriente, recibe documento del cliente, ID y valor
	public CuentaCorriente(String DocCliente, String ID, int Valor) {
		super(DocCliente, ID, Valor);
		// Costo por retiro de 12000
		setCostos(12000);
	};

	// Para todo retiro, el valor extra es fijo
	public int getCostoTransaccion(int valor) {
		return getCostos();
	};

	// Imprimir informacion: cuenta corriente y datos del metodo de la clase
	// padre
	public void Info() {
		System.out.print("Cuenta Corriente, ");
		super.Info();
	};
}
