package ar.com.bytebank.ordenamientoArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ar.com.bytebank.modelo.Cliente;
import ar.com.bytebank.modelo.Cuenta;
import ar.com.bytebank.modelo.CuentaAhorro;
import ar.com.bytebank.modelo.CuentaCorriente;

public class TestOrdenamientoArraysActual {

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

	//  El metodo sort del ArrayList lista necesita de una implementacion  
	// de la Interface Comparator que maneje como generics la clase Cuenta
	//  Para esto se crea la clase NumeroDeCuentaComparator que implementa
	// la interface Comparator, y este tiene un metodo "compare()" que 
	// compara los objetos Cuenta.
	//  Ver documentacion de sort.
	//lista.sort(Comparator<? super Cuenta> c);	
		lista.sort(comparadorPorNumero);
		System.out.println("Lista ordenada por numero de cuenta");
		for (Cuenta c : lista) {
			System.out.println(c);
		}
		System.out.println();

		Comparator<Cuenta> comparadorPorNombre = new NombreTitularComparator();
		
		// comparadorPorNombre es una implementacion de la interface Comparator
		lista.sort(comparadorPorNombre);
		//  Tambien se puede utilizar el metodo sort de la clase Collections
		// de esta forma
		//Collections.sort(lista, comparadorPorNombre);
		System.out.println("Lista ordenada por nombre del titular");
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
				return Integer.compare(c1.getNumero(), c2.getNumero());
			}
		});
		
		System.out.println("Lista ordenada por numero con la clase anonima:");
		for (Cuenta c : lista) {
			System.out.println(c);
		}
		System.out.println();
		
	}
}


// "Comparator" es una Interface Funcional, es decir que tiene solamente un 
// método abstracto, y que puede implementar uno o más métodos default.

// metodo creado para comparar las cuentas por numero. 
// Este metodo tendria que estar dentro de la clase Cuenta ???
// Esta no es una clase normal, ya que no tiene atributos y no 
// representa un objeto del mundo real. 
class NumeroDeCuentaComparator implements Comparator<Cuenta> {
	/**
	 * Comparator provide an ordering for collections of objects that don't have a
	 * natural ordering.
	 * @author Martin
	 * Compare() este metodo es el implementado por la interface Comparator
	 */
	
	@Override
	public int compare(Cuenta c1, Cuenta c2) {
		return Integer.compare(c1.getNumero(), c2.getNumero());
		// Integer.compare retorna
		// 0 si los numeros son iguales
		// un numero mayor a 0 si el primer numero es mayor
		// un numero menor a 0 si el segundo numero es mayor
		
		/**
		 * Otra forma de hacer la comparacion es la siguiente:
		 * 
		 *	return c1.getNumero() - c2.getNumero();
		 *
		 * esto devuelve 0 , un numero mayor a 0 o un numero menor a 0
		 * igual que la funcion de arriba.
		 */
	}
}
// implementacion de Comparator para comparar las cuentas por nombre de titular
class NombreTitularComparator implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta c1, Cuenta c2) {
		return c1.getTitular().getNombre().compareTo(c2.getTitular().getNombre());
	}
	/**
	 * Metodo compareTo() :
	 * compara lexicograficamente(alfabeticamente) los strings, caracter por caracter
	 * -- Si el primer string es mayor(porque esta primero alfabeticamente) 
	 * devuelve un numero entero positivo 
	 * -- Si el segundo es mayor devuelve un entero negativo
	 * -- Si los string son iguales devuelve cero (0).
	 */
	
}

