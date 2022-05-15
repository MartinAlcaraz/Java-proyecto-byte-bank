
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

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public double getValorImpuesto() {
		return super.saldo * 0.01;
	}
	
}
