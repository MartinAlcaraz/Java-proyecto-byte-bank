package ar.com.bytebank.ordenamientoArrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestOrdenacionConIterator {

	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<>();
		nombres.add("Super Mario");
		nombres.add("Yoshi");
		nombres.add("mario");
		nombres.add("Donkey Kong");
		

		/** Un Iterator es un objeto que tiene al menos dos métodos: 
		 * hasNext() y next(). 
		 * Es decir, puede usarlo para preguntar si hay un próximo elemento 
		 * y pedir el próximo elemento. La buena noticia es que funciona con 
		 * TODAS las implementaciones y esa es la gran ventaja. Sirve para
		 * iterar sobre colas, conjuntos o mapas.
		 */
		Iterator<String> it = nombres.iterator();
		
		while(it.hasNext()) { 
			System.out.println(it.next());
		}
		
		System.out.println();
		
		boolean marioEsta = false;
		for (String st : nombres) {
			if (st == "mario") {
				marioEsta = true;
				break;
			}
		}
		
		if (marioEsta) {
			nombres.remove("mario");
			System.out.println("mario se borro");
			System.out.println();
		}
		
		nombres.forEach(n -> System.out.println(n));
		
		//////// iteracion en un conjunto ///////////
		
		Set<String> conjuntoNombres = new HashSet<>();
		
		conjuntoNombres.add("Super Mario");
		conjuntoNombres.add("Yoshi"); 
		conjuntoNombres.add("Donkey Kong"); 

		Iterator<String> it2 = nombres.iterator();

		System.out.println();
		System.out.println("Conjunto: ");
		while(it2.hasNext()) {
		  System.out.println(it2.next());
		}

		// se vuelve a asignar el iterador porque cuando
		// se termina de iterar no inicia otra vez
		it2 = nombres.iterator();		
		
		// intentando ingresar otra ver el string "Yoshi"
		// que no se agrega porque en los conjuntos no 
		// se repiten los valores existentes.
		conjuntoNombres.add("Yoshi");	
		System.out.println();
		System.out.println("Conjunto 2 : ");
		while(it2.hasNext()) {
		   System.out.println(it2.next());
		}
			
		
		
	}
}
