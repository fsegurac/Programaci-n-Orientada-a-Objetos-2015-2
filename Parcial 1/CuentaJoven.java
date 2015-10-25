package unbank;

public class CuentaJoven extends Cuenta {

	// Constructor de cuenta joven, recibe documento del cliente, ID y valor
	public CuentaJoven(String DocCliente, String ID, int Valor) {
		super(DocCliente, ID, Valor);
		// Costo por retiro de 7000
		setCostos(7000);
	};

	// No se cobra por retiros menores a 700000
	public int getCostoTransaccion(int valor) {
		if (valor < 700000) {
			return 0;
		} else {
			return getCostos();
		}
	};

	// Imprimir informacion: cuenta joven y datos del metodo de la clase padre
	public void Info() {
		System.out.print("Cuenta Joven, ");
		super.Info();
	};
}
