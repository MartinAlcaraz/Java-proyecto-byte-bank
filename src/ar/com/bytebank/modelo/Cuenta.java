package ar.com.bytebank.modelo;
/**
 * Clase base para crear CuentaAhorro y CuentaCorriente
 * @author Martin
 * @version 1.0
 *
 */
public abstract class Cuenta implements Comparable<Cuenta>{
	private int numero;
	protected double saldo;
	private Cliente titular;
	
	public Cuenta (int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;	
	}
	
	@Override
	public int compareTo(Cuenta c) {
		// aqui se especifica el criterio de ordenamiento de la cuenta
		// En este caso se ordena por numero de cuenta
		return Integer.compare(this.numero, c.numero);
		
		// para ordenar de forma natural por nombre de titular de la cuenta se hace lo siguiente
		//return this.titular.getNombre().compareTo(c.titular.getNombre());
		
		// para ordenar por saldo
		//return Double.compare(this.saldo, c.saldo);
		
	}
	
	public abstract void depositar (double valor); 
		//this.saldo += valor;
	
	/**
	 * Metodo para transferir saldo a una cuenta especifica
	 * @param valor cantidad a transferir
	 * @param cuenta la cuenta especifica de un Funcionario o Cliente
	 */
	public void transferir(double valor, Cuenta cuenta) {
		this.saldo -= valor;
		cuenta.depositar(valor);
	}
	
	/**
	 * sobreescritura del metodo toString de la clase Object.
	 * ver el metodo sobreescrito en las clases hijas
	 *@author Martin 
	 */
	@Override
	public String toString() {
		String datosCuenta = "Cuenta numero: "+this.numero+", Titular: "+this.titular.getNombre()+", Saldo: "+this.saldo; 
		return datosCuenta;
	}
	
	/**
	 * Sobreescritura del metodo "equals", que es utilizado por 
	 * el metodo "contains", para comparar los valores de las
	 * cuentas, y ver si son las mismas. 
	 * El metodo equals compara las referencias de los objetos y no 
	 * los valores contenidos en los objetos. 
	 * @author Martin
	 */
	@Override
	public boolean equals(Object obj) {
		Cuenta c = (Cuenta)obj;
		
		if (c.numero == this.numero) {
			return true;
		}
		return false;
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
	public Cliente getTitular() {
		return this.titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	
	
	
	
}
