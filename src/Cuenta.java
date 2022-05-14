
public abstract class Cuenta {
	private int numero;
	protected double saldo;
	private String titular;
	
	public Cuenta (int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;	
	}
	
	public abstract void depositar(double valor); 
		//this.saldo += valor;
	
	
	public void transferir(double valor, Cuenta cuenta) {
		this.saldo -= valor;
		cuenta.depositar(valor);
	}
	
	public void retirar (double valor) {
		this.saldo -= valor;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
	
}
