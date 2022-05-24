package ar.com.bytebank.ordenamientoArrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import ar.com.bytebank.modelo.Cliente;
import ar.com.bytebank.modelo.Cuenta;
import ar.com.bytebank.modelo.CuentaAhorro;
import ar.com.bytebank.modelo.CuentaCorriente;

public class TestOrdenacionConLambda {

	public static void main(String[] args) {
		Cuenta cc1 = new CuentaCorriente(22, 33);
		cc1.depositar(333.0);
		Cliente cliente1 = new Cliente();
		cliente1.setNombre("Pedro");
		cc1.setTitular(cliente1);

		Cuenta cc2 = new CuentaAhorro(12, 44);
		cc2.depositar(444.0);
		Cliente cliente2 = new Cliente();
		cliente2.setNombre("Juan");
		cc2.setTitular(cliente2);

		Cuenta cc3 = new CuentaCorriente(52, 11);
		cc3.depositar(111.0);
		Cliente cliente3 = new Cliente();
		cliente3.setNombre("Mario");
		cc3.setTitular(cliente3);

		Cuenta cc4 = new CuentaAhorro(2, 22);
		cc4.depositar(222.0);
		Cliente cliente4 = new Cliente();
		cliente4.setNombre("Andres");
		cc4.setTitular(cliente4);
		
		List<Cuenta> lista = new ArrayList<>();
		
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		System.out.println("Lista sin ordenar");
		for (Cuenta c : lista) {
			System.out.println(c);
		}
		System.out.println();
		
		Comparator<Cuenta> comparadorPorNumero = new NumeroDeCuentaComparator();
	
		lista.sort(comparadorPorNumero);
		System.out.println("Lista ordenada por numero de cuenta");
		for (Cuenta c : lista) {
			System.out.println(c);
		}
		System.out.println();

		/**
		 * Clases anonimas: es parecido a un metodo anonimo de javaScript.
		 *
		 * Aqui se usa el operador new para instanciar el metodo que se
		 * implementa a continuacion 
		 */
		
		lista.sort(new Comparator<>() {	// clase anonima, es igual a las clases NumeroDeCuentaComparator 
			@Override					// que ordenan la lista
			public int compare(Cuenta c1, Cuenta c2) {
				return c1.getTitular().getNombre().compareTo(c2.getTitular().getNombre());
			}
		});
		
		
		System.out.println("Lista ordenada por nombre de titular con la clase anonima:");
		for (Cuenta c : lista) {
			System.out.println(c);
		}
		System.out.println();
		
		
		// expresion Lamda para ordenar la lista por numero de cuenta
		lista.sort((Cuenta c1 , Cuenta c2) -> {
			return c1.getNumero() - c2.getNumero();
		});
		
		System.out.println("Lista ordenada por numero de cuenta con expresion Lamda:");
		
		// expresion lamda para iterar sobre la lista
		lista.forEach(c -> {
			System.out.println(c);
		});
		
		System.out.println();
		
	}

}
