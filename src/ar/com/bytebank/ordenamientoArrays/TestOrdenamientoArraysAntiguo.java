package ar.com.bytebank.ordenamientoArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ar.com.bytebank.modelo.Cliente;
import ar.com.bytebank.modelo.Cuenta;
import ar.com.bytebank.modelo.CuentaAhorro;
import ar.com.bytebank.modelo.CuentaCorriente;

/**
 * Esta forma de ordenamiento se utiliza para java anterior 
 * a la version 8 (la version 1.8);
 * Este forma se utiliza en sistemas que utilizan un java antiguo
 * @author Martin
 * Aqui se utiliza la Clase Collections, que usa el orden natural de los objetos
 * Si la lista no tiene un orden natural, se crea un orden natural. 
 * No confundir con la interface Collection sin "s".
 */
public class TestOrdenamientoArraysAntiguo {

	public static void main(String[] args) {
				
		List<Integer> listaNumeros = new ArrayList<>();
		listaNumeros.add(4);
		listaNumeros.add(3);
		listaNumeros.add(7);
		listaNumeros.add(1);
		
	// esta forma antigua de ordenamiento utiliza el metodo sort de la 
	// clase Collections. 
	// Este metodo sort ordena la lista a partir del orden natural de los
	// objetos, si es que lo tienen, como por ejemplo una lista de numeros.
	// En el caso de las cuentas, estas no tienen un order natural por defecto.
	// Entonces lo que se hace es crear un criterio de order natural usando
	// la Interface "Comparable" en la clase Cuenta.
	// Esta interface implementa el metodo " compareTo() " y aqui es donde 
	// se especifica el criterio de ordenamiento natural de las cuentas. 
	// Ver la implementacion el la clase Cuenta
		
		System.out.println("Lista de numeros sin ordenar");
		for (Integer n : listaNumeros) {
			System.out.println(n);
		}
		System.out.println();
		
		Collections.sort(listaNumeros);
		System.out.println("Lista de numeros ordenada");
		for (Integer n : listaNumeros) {
			System.out.println(n);
		}
		System.out.println();

		// fin lista de numeros
		// inicio lista de cuentas
		Cuenta cc1 = new CuentaCorriente(33, 73);
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

		Cuenta cc4 = new CuentaAhorro(77, 22);
		cc4.depositar(222.0);
		Cliente cliente4 = new Cliente();
		cliente4.setNombre("Andres");
		cc4.setTitular(cliente4);
		
		List<Cuenta> lista = new ArrayList<>();
		
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		System.out.println("Lista de cuentas sin ordenar");
		for (Cuenta c : lista) {
			System.out.println(c);
		}
		System.out.println();

		// este metodo sort() de la clase Collections ordena la lista por el 
		// orden natural establecido en la clase Cuenta en el metodo compareTo() y 
		// en este caso lo ordena por numero de cuenta.
		// Para cambiar el criterio de ordenamiento hay que modificar el metodo compareTo()
		// -- Si fuera otro tipo de lista, como una lista de numeros, no habria la
		// necesidad de implementar la interface "Comparable" en la clase Cuenta, simplemente
		// se manda a ordenar con el metodo sort() de la clase Collections.
		Collections.sort(lista);
		
		System.out.println("Lista de cuentas ordenadas por numero");
		for (Cuenta c : lista) {
			System.out.println(c);
		}
		System.out.println();

	}
}
