package ar.com.bytebank.arrays;

import java.util.ArrayList;

import ar.com.bytebank.modelo.Cuenta;
import ar.com.bytebank.modelo.CuentaAhorro;

public class TestArrayList2 {

	public static void main(String[] args) {

		ArrayList<CuentaAhorro> lista = new ArrayList<CuentaAhorro>();

		CuentaAhorro ch1 = new CuentaAhorro(1, 15);
		CuentaAhorro ch2 = new CuentaAhorro(2, 24);
		CuentaAhorro ch3 = new CuentaAhorro(3, 15);
		CuentaAhorro ch4 = new CuentaAhorro(4, 50);

		lista.add(ch1);
		lista.add(ch2);
		lista.add(ch4);

		/**
		 * .contains() En este metodo se comparan las referencias de los objetos cuenta.
		 * Las referencias son distintas, pero los valor de las cuentas son iguales,
		 * entonces se agrega otra cuenta igual a la existente. Para evitar esto se
		 * deben comparar los valores de las cuentas. y para lograrlo se sebreescribe el
		 * metodo "equals" en la clase Cuenta, que es utilizada por el metodo
		 * "contains". Hacer hover en contains.
		 */
		if (!lista.contains(ch3)) {
			lista.add(ch3);
			System.out.println("la cuenta se agrego pq no existe");
		} else {
			System.out.println("la cuenta ya existe.");
		}

		// borrar cuenta de lista
		if (lista.contains(ch3)) {
			lista.remove(ch3);
			System.out.println("se borro la cuenta ch3");
		} else {
			System.out.println("la cuenta no existe.");
		}

		

		lista.forEach((Cuenta ca) -> System.out.println(ca));

	}
}
