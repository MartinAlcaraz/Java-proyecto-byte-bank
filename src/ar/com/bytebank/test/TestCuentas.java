package ar.com.bytebank.test;

import ar.com.bytebank.modelo.CuentaCorriente;
import ar.com.bytebank.modelo.CuentaAhorro;

public class TestCuentas {

	public static void main(String[] args) {	
		
	    CuentaCorriente cc = new CuentaCorriente(111, 100);
	    cc.depositar(100.0);

	    CuentaAhorro ca = new CuentaAhorro(222, 100);
	    ca.depositar(100.0);
	    
	    System.out.println("saldo cuenta corriente: "+ cc.getSaldo());
	    System.out.println("saldo cuenta ahorro: "+ ca.getSaldo());
	    

	    cc.transferir(10.0, ca);
	    System.out.println("CCorriente: " + cc.getSaldo());
	    System.out.println("CAhorro: " + ca.getSaldo());
	    
	    ca.retirar(50);
	    System.out.println("se retiran 50: ");
	    System.out.println("Saldo Cahorro : "+ ca.getSaldo());
	    
	    System.out.println("Saldo Ccorriente : "+ cc.getSaldo());
	    cc.retirar(50);
	    System.out.println("se retiran 50: ");
	    System.out.println("Saldo Ccorriente : "+ cc.getSaldo());
	    
	    System.out.println(cc.toString());
	    
	}
}
