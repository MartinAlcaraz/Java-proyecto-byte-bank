package especial;

import ar.com.bytebank.modelo.Cuenta;
/**
 * CuentaEspecial es hija de Cuenta
 * @author Martin
 */

public class CuentaEspecial extends Cuenta{

	public CuentaEspecial(int numero, double saldo) {
		super(numero, saldo);
		
	}

	@Override
	public void depositar(double valor) {
		super.saldo += valor;
	}

}
