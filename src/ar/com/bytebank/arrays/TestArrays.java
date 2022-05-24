package ar.com.bytebank.arrays;

import ar.com.bytebank.modelo.Cliente;
import ar.com.bytebank.modelo.CuentaAhorro;

public class TestArrays {
	public static void main(String[] args) {
		
		// array de numeros, declaracion Literal
		int[] nums = {1,2,3,4};
		
		for (int i=0 ; i< nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		CuentaAhorro[] cuentas = new CuentaAhorro[4];
		Cliente cliente;
		
		for (int i=0 ; i< cuentas.length; i++) {
			cuentas[i]= new CuentaAhorro(i+1, i*10+20);
			cliente = new Cliente();
			cliente.setNombre("Alguien "+i);
			cuentas[i].setTitular(cliente);
			System.out.println(cuentas[i]);
		}
		CuentaAhorro c = cuentas[0];
		c.depositar(34.44);
		System.out.println(c.getSaldo()+" de saldo");
	}
}
