package ar.com.bytebank.modelo;

public class CuentaCorriente extends Cuenta implements Tributacion{

	public CuentaCorriente (int num, double saldo) {
		super(num, saldo);
	}
	
	
	@Override
	public void retirar(double valor) {
		double valorAretirar = valor + 20;
		super.retirar(valorAretirar);
		System.out.println("se ejecuta metodo overrride");
	}
	
	/**
	 * Sobreescritura del metodo toString para distinguir esta cuenta 
	 * de las demas. Funcionamiento: 
	 * Se llama al metodo padre a traves de super.toString() y el resultado
	 * devuelto se concatena con el texto "Cuenta Corriente: "  
	 * @author Martin 
	 */
	@Override
	public String toString() {
		return "Cuenta Corriente: "+ super.toString();
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public double getValorImpuesto() {
		return super.saldo * 0.01;
	}
	
}
