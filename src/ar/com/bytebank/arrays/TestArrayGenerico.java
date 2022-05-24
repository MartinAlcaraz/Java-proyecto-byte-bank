package ar.com.bytebank.arrays;

import ar.com.bytebank.modelo.CuentaAhorro;

public class TestArrayGenerico {

	public static void main(String[] args) {

		ArrayGenerico array = new ArrayGenerico(10);
		
		for (int i = 0; i < array.tamano; i++) {
			array.agregar(new CuentaAhorro(i, i * 23.3));
			Object ob = array.obtener(i);
			CuentaAhorro c = (CuentaAhorro)ob;
			System.out.println(c.getSaldo()+ "saldo");
			System.out.println(array.obtener(i));
		}
		
	}
}
