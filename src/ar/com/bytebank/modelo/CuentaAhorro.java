package ar.com.bytebank.modelo;

public class CuentaAhorro extends Cuenta {

	public CuentaAhorro(int numero, double saldo) {
		super(numero, saldo);
	}

	@Override
	public void depositar(double valor) {
		super.saldo += valor;
	}

	/**
	 * Sobreescritura del metodo toString para distinguir esta cuenta 
	 * de las demas. Funcionamiento: 
	 * Se llama al metodo padre a traves de super.toString() y el resultado
	 * devuelto se concatena con el texto "Cuenta de Ahorros: "  
	 * @author Martin 
	 */
	@Override
	public String toString() {
		return "Cuenta de Ahorros: "+ super.toString();
	}

	
	
	

}
