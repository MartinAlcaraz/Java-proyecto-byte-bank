package ar.com.bytebank.arrays;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
	
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Hola");
		lista.add(null);
		lista.add("carl");
		lista.add("Carlson");
		
		lista.forEach((n) -> System.out.println("- "+n));
		
		for (String st : lista) {
			System.out.println("-) "+st);
		}
		lista.remove(null);
		lista.remove(2);
		
		for (int i=0; i < lista.size(); i++) {
			System.out.println("metodo get: "+lista.get(i));
			
		}
	

		ArrayList<Character> lista2 = new ArrayList<>(4);
		lista2.add('a');
		lista2.add('b');
		lista2.add('c');
		lista2.add('d');
		lista2.add('e');
		lista2.add('f');

		
		for (char ch : lista2) {
			System.out.println(ch);
		}
	
		
}
}
