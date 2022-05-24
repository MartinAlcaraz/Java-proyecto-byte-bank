package ar.com.bytebank.arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import ar.com.bytebank.modelo.Cuenta;
import ar.com.bytebank.modelo.CuentaCorriente;

public class TestLinkedList {
	public static void main(String[] args) {

		LinkedList<CuentaCorriente> linkedList = new LinkedList<CuentaCorriente>();
	
		CuentaCorriente cuenta0;
		CuentaCorriente cc = new CuentaCorriente(2, 40);
		
		for (int i=0 ; i <10; i++) {
			cuenta0 = new CuentaCorriente(i+1, (i+1) * 10);
			linkedList.add(cuenta0);
		}
		
		
		// modificacion de una cuenta de la lista
		if (linkedList.contains(cc)) {
			System.out.println("la cuenta ya existe");
			
			int i = linkedList.indexOf(cc); 	 // se obtiene el indice de la cuenta		
			System.out.println("indice: "+ i);
			CuentaCorriente cuenta= linkedList.get(i); // obtener el elemento
			cuenta.setNumero(99);							
			linkedList.set(i, cuenta);				// modifica la cuenta existente
			
		}else {
			System.out.println("la cuenta No existe");
		}
				
		System.out.println("Lista de todas las cuentas");
		linkedList.forEach((CuentaCorriente c) -> System.out.println(c));
		
		//linkedList.remove();  borrar una cuenta
		cc.setNumero(5);
		System.out.println("Borrar la cuenta numero 5");
		if (linkedList.contains(cc)) {
			System.out.println("La cuenta numero 5 existe");
			
			int i = linkedList.indexOf(cc); 	 // se obtiene el indice de la cuenta		
			System.out.println("indice: "+ i);
			
			linkedList.remove(i);	// se borra la cuenta
			
		}else {
			System.out.println("la cuenta No existe");
		}
		 
		System.out.println("Lista de todas las cuentas actualizada: ");
		linkedList.forEach((CuentaCorriente c) -> System.out.println(c));
		
	}
}
