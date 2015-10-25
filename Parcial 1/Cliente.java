package unbank;

import java.util.HashMap;

public class Cliente {
	// Nombre del cliente
	private String nombre;
	// Documento del cliente, tambien es su Objectkey(direccion) del HashMap de
	// clientes del banco
	private String documento;
	// Contacto del cliente
	private String contacto;
	// Tipo de cliente
	private String tipoCliente;

	// HashMap de Cuentas, el ObjectKey corresponde a el ID de la cuenta
	HashMap<String, Cuenta> cuentas = new HashMap<String, Cuenta>();
	// HashMap de prestamos, el ObjectKey corresponde a el ID del prestamo
	HashMap<String, Prestamo> prestamos = new HashMap<String, Prestamo>();

	// Constructor de cliente, recibe su nombre, contacto, documento, tipo de
	// cliente, tipo de la
	// cuenta nueva, ID de la cuenta nueva y dinero inicial
	public Cliente(String nombre, String documento, String contacto,
			String tipoCliente, String tipo, String IDProBancario, int valor) {
		setNombre(nombre);
		setDocumento(documento);
		setContacto(contacto);
		setTipoCliente(tipoCliente);
		// Metodo de crear cuenta nueva con los argumentos necesarios
		tipo.toLowerCase();
		if (tipo == "Joven" || tipo == "Corriente" || tipo == "Ahorros") {
			NuevaCuenta(IDProBancario, tipo, valor);
		} else if (tipo == "Miniprestamo" || tipo == "Hipoteca") {
			PedirPrestamo(IDProBancario, tipo, valor);
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		tipoCliente.toLowerCase();
		if (tipoCliente == "Platino" || tipoCliente == "Dorado"
				|| tipoCliente == "Plateado") {
			this.tipoCliente = tipoCliente;
		} else {
			System.out.println("Tipo de cliente no valido");
		}
	}

	// Metodo de consignar, recibe el id de cuenta a consignar, si el valor es
	// mayor a cero, añadir al dinero
	public void Consignar(String iDCuenta, int valor) {
		if (valor > 0) {
			// Extraer la cueta del HashMap con su ID, y establecer el valor de
			// la misma con el metodo addValor()
			cuentas.get(iDCuenta).addValor(valor);
		}

	}

	// Metodo de retirar, recibe id de cuenta y el valor a retirar
	public void Retirar(String iDCuenta, int valor) {
		// retirara solo si el valor esta en el rango del valor de la cuenta
		if (valor > 0 && valor < cuentas.get(iDCuenta).getValor()) {
			// Restar con el metodo addValor, el valor que se recibe mas el
			// costo extra por la transaccion que el tipo de cuenta defina
			cuentas.get(iDCuenta)
					.addValor(
							-(valor + cuentas.get(iDCuenta)
									.getCostoTransaccion(valor)));
		}

	}

	// Metodo del cliente para conocer informacion de sus cuentas, recorre todas
	// las cuentas y muestra su informacion con el metodo Info()
	public void InfoCuentas() {
		for (Cuenta c : cuentas.values()) {
			c.Info();
		}

	}

	// Crear una nueva cuenta, recibe el id de la nueva cuenta, el tipo de
	// cuenta y el dinero inicial
	public void NuevaCuenta(String iDCuenta, String tipo, int valor) {
		// El String del tipo se convierte a su representacion en minusculas
		// para comparar correctamente
		tipo = tipo.toLowerCase();
		// Declarar nueva cuenta con potencial de cualquier subclase de Cuenta
		Cuenta c1;
		switch (tipo) {
		// Si el tipo de cuenta es joven, c1 se instancia como una cuenta joven
		// y se inicializa
		case "joven":
			c1 = new CuentaJoven(getDocumento(), iDCuenta, valor);
			// Añadir al HashMap de cuentas con su ID respectivo
			cuentas.put(iDCuenta, c1);
			break;
		// Si el tipo de cuenta corriente, c1 se instancia como una cuenta
		// corriente y se inicializa
		case "corriente":
			c1 = new CuentaCorriente(getDocumento(), iDCuenta, valor);
			// Añadir al HashMap de cuentas con su ID respectivo
			cuentas.put(iDCuenta, c1);
			break;
		// Si el tipo de cuenta es ahorros, c1 se instancia como una cuenta
		// ahorros y se inicializa
		case "ahorros":
			c1 = new CuentaAhorros(getDocumento(), iDCuenta, valor);
			// Añadir al HashMap de cuentas con su ID respectivo
			cuentas.put(iDCuenta, c1);
			break;
		}

	}

	// Cancelar una cuenta, recibe el id de cuenta a cancelar
	public void CancelarCuenta(String idCuenta) {
		// boolean que indica si hay prestamos activos, comienza en false
		boolean activos = false;
		for (Prestamo p : prestamos.values()) {
			// Si algun prestamo esta activo, no cerrar la cuenta y establecer
			// activos en true
			if (p.isActivo()) {
				// Mensaje de error al intentar cerrar cuenta con prestamos
				// activos
				System.out
						.println("No es posible cerrar la cuenta, ya que hay prestamos activos.");
				activos = true;
				break;
			}

		}

		// Si no se encontraron prestamos activos, cerrar la cuenta y retirar el
		// dinero con el metodo CerrarCuenta()
		if (!activos) {
			cuentas.get(idCuenta).CerrarCuenta();
		}

	}

	// Nuevo prestamo, recibe el ID del nuevo prestamo, el tipo de prestamo y el
	// valor
	public void PedirPrestamo(String iDPrestamo, String tipoP, int cuotas) {
		// String de tipo a su representacion en minusculas
		String tipo = tipoP.toLowerCase();
		// Nuevo prestamo pendiente para instanciar
		Prestamo p1;
		switch (tipo) {
		// Si el tipo es miniprestamo
		case "miniprestamo":
			p1 = new MiniPrestamo(getDocumento(), iDPrestamo, cuotas);
			prestamos.put(iDPrestamo, p1);
			break;
		// Si el tipo es hipoteca
		case "hipoteca":
			p1 = new PrestamoHipoteca(getDocumento(), iDPrestamo, cuotas);
			prestamos.put(iDPrestamo, p1);
			break;
		}

	}

	// Pagar prestamo a totalidad, recibe el ID del prestamo
	public void PagarPrestamoTotalidad(String ID) {
		// Cancelar la deuda directamente
		prestamos.get(ID).CancelarDeuda();
	}

}
