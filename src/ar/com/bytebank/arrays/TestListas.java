package ar.com.bytebank.arrays;

import java.util.Arrays;
import java.util.List;

public class TestListas {
	public static void main(String[] args) {
			
		String[] vectorString = {"Hola","mundo"};
		for (String st : vectorString) {
			System.out.print(st+ " ");
		}
		System.out.println("");
		
		 // se convierte un array en una lista 
		
		List<String> lista = Arrays.asList(vectorString);

		lista.forEach((String st) -> System.out.print(st+ " "));
	}
}
