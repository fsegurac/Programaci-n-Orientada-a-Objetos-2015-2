package unbank;

public class Banco {

	// Test UNBank
	public static void main(String[] args) {

		// Crear un banco, para ello, se crea al mismo tiempo un nuevo cliente y
		// cuenta para el cliente
		UNBank UNBank = new UNBank("Pedro Agustin", "37098013", "3293340", "Plateado",
				"Corriente", "0001", 500000);
		// Cliente 1: Pedro Agustin
		// doc: 37098013
		// Contacto: 3293340
		Cliente c1 = new Cliente("Carlos Morales", "8013439", "2317993","Platino",
				"Joven", "0002", 300000);
		UNBank.Clientes.put("8013439", c1);
		// Cliente 2: Carlos Morales
		// doc: 8013439
		// Contacto: 2317993
		Cliente c2 = new Cliente("Julio Verne", "848484", "5404899","Platino", "Joven",
				"0003", 1000000);
		UNBank.Clientes.put("848484", c2);
		// Cliente 3: Julio Verne
		// doc: 848484
		// Contacto: 5404899
		Cliente c3 = new Cliente("Krang", "6509311", "3212990786","Dorado", "Ahorros",
				"0004", 100000);
		UNBank.Clientes.put("6509311", c3);
		// Cliente 4: Krang
		// doc: 6509311
		// Contacto: 3212990786
		Cliente c4 = new Cliente("Electabuzz", "1038939485", "2156683333","Plateado",
				"Corriente", "0005", 280000);
		UNBank.Clientes.put("1038939485", c4);
		// Cliente 5: Electabuzz
		// doc: 1038939485
		// Contacto: 2156683333

		// Los siguietes metodos imprimiran los productos bancarios totales y
		// activos hasta el momento, 5 y 5.
		UNBank.NumeroTotales();
		UNBank.NumeroActivos();

		// El banco pide informacion de los productos bancarios, como no hay
		// prestamos para ver, no imprime nada
		UNBank.ProductosBancariosTotales();
		// Cobrar a todos los clientes, como no hay prestamos activos, no ocurre
		// nada
		UNBank.CobroClientes();
		// Cliente 1 solicita informacion de sus cuentas, imprime informacion de
		// su cuenta corriente
		UNBank.Clientes.get("37098013").InfoCuentas();
		// Cliente 4 crea una nueva cuenta de Ahorros
		UNBank.Clientes.get("6509311").NuevaCuenta("0006", "Ahorros", 135000);
		// Cliente 4 solicita informacion de sus cuentas, imprime informacion de
		// las dos cuentas que tiene
		UNBank.Clientes.get("6509311").InfoCuentas();
		// Cliente 5 pide un prestamo de hipoteca de 100000
		UNBank.Clientes.get("1038939485").PedirPrestamo("1001", "Hipoteca",
				100000);
		// Imprime numero de productos bancarios activos, 7.
		UNBank.NumeroActivos();
		// Imprime informacion de los prestamos actuales
		UNBank.ProductosBancariosTotales();
		// El cliente 4 cancela la primera cuenta que hizo
		UNBank.Clientes.get("6509311").CancelarCuenta("0004");
		// El cliente 5 intenta cancelar la cuenta que tiene, como tiene un
		// prestamo activo no puede hacerlo, imprime un mensaje.
		UNBank.Clientes.get("1038939485").CancelarCuenta("0005");
		// Imprime 7 y 6 respectivamente, 7 productos bancarios existentes y 1
		// de ellos inactivo, la cuenta de ID 0004.
		UNBank.NumeroTotales();
		UNBank.NumeroActivos();
		// Cliente 5 imprime informacion de sus cuentas, su cuenta sigue activa
		// ya que su prestamo no ha sido pagado
		UNBank.Clientes.get("1038939485").InfoCuentas();
		// El banco cobra al Cliente 5
		UNBank.CobroCliente("1038939485");
		// El Cliente 5 pago su deuda, ahora los productos bancarios activos son
		// 5, imprime 7 y 5.
		UNBank.NumeroTotales();
		UNBank.NumeroActivos();
		// Imprime informacion del prestamo inactivo.
		UNBank.ProductosBancariosTotales();
		// Imprime informacion de las cuentas, el dinero pagado fue descontado
		UNBank.Clientes.get("1038939485").InfoCuentas();
		// Cliente 2 pide un prestamo de hipoteca de 1000000
		UNBank.Clientes.get("8013439").PedirPrestamo("1002", "Hipoteca",
				1000000);
		// Imprimir informaciond del prestamo del Cliente 2
		UNBank.ProductosBancariosCliente("8013439");
		// El banco cobra al cliente 2 el prestamo hecho
		UNBank.CobroCliente("8013439");
		// Imprime informacion del prestamo, el prestamo sigue activo con una
		// multa de 10000 mas.
		UNBank.ProductosBancariosCliente("8013439");
		// Cliente 2 paga el prestamo a totalidad
		UNBank.Clientes.get("8013439").PagarPrestamoTotalidad("1002");
		// Imprime informacion del prestamo, el prestamo esta inactivo
		UNBank.ProductosBancariosCliente("8013439");
		// Imprime 8 productos bancarios existentes y 5 activos actualmente.
		UNBank.NumeroTotales();
		UNBank.NumeroActivos();
		// Cliente 1 crea una cuenta corriente de 530000
		UNBank.Clientes.get("37098013")
				.NuevaCuenta("0008", "Corriente", 530000);
		// Cliente 1 crea una cuenta de ahorros de 280000
		UNBank.Clientes.get("37098013").NuevaCuenta("0009", "Ahorros", 280000);
		// Cliente 1 crea una cuenta joven de 120000
		UNBank.Clientes.get("37098013").NuevaCuenta("0010", "Joven", 120000);
		// Imprime informacion de las cuatro cuentas que Cliente 1 tiene
		UNBank.Clientes.get("37098013").InfoCuentas();
		// Cliente 1 retira 150000 de su cuenta de ID 0009
		UNBank.Clientes.get("37098013").Retirar("0009", 150000);
		// Cliente 1 consigna 215000 a su cuenta de ID 0010
		UNBank.Clientes.get("37098013").Consignar("0010", 215000);
		// Imprime informacion de las cuentas, la cuenta de la que retiro, tiene
		// descontado el monto dado mas el cobro extra por transaccion, la
		// cuenta consignada aumento su valor
		UNBank.Clientes.get("37098013").InfoCuentas();
		// Cliente 1 retira 300000 de su cuenta joven
		UNBank.Clientes.get("37098013").Retirar("0010", 300000);
		// Imprime informacion de las cuentas, de la cuenta joven solo fue
		// descontado el monto del retiro sin cobro extra ya que no sobrepasa
		// los 700000
		UNBank.Clientes.get("37098013").InfoCuentas();
		// Cliente 1 pide un prestamo de hipoteca de 500000
		UNBank.Clientes.get("37098013").PedirPrestamo("1008", "Hipoteca",
				500000);
		// Cliente 2 pide un prestamo de hipoteca de 1200000
		UNBank.Clientes.get("8013439").PedirPrestamo("1009", "Hipoteca",
				1200000);
		// Cliente 3 pide un miniprestamo de 45000
		UNBank.Clientes.get("848484").PedirPrestamo("1010", "Miniprestamo",
				45000);
		// Cliente 4 pide un prestamo de hipoteca de 346000
		UNBank.Clientes.get("6509311")
				.PedirPrestamo("1011", "Hipoteca", 346000);
		// Cliente 5 pide un miniprestamo de 28000
		UNBank.Clientes.get("1038939485").PedirPrestamo("1012", "Miniprestamo",
				28000);
		// Imprime 16 productos bancarios totales y 13 activos
		UNBank.NumeroTotales();
		UNBank.NumeroActivos();
		// El banco cobra a todos los clientes
		UNBank.CobroClientes();
		// Imprime informacion de los prestamos,los prestamos inactivos previos
		// y los nuevos de los cuales 3 estan en multa,y 2 pagados.
		UNBank.ProductosBancariosTotales();
		// Imprime 16 productos bancarios hechos y 11 activos
		UNBank.NumeroTotales();
		UNBank.NumeroActivos();

	}

}
