package ar.com.bytebank.boxingUnboxing;

public class TestBoxingUnboxing {
	public static void main(String[] args) {

		Integer ref = Integer.valueOf("3"); //se asigna 3 al objeto Integer
		ref++;  // se suma 1 al objeto 
		System.out.println(ref); // se imprime 4
		/**
		 * Boxing y Unboxing 
		 * Para la suma el objeto se convierte en dato por valor int
		 * se suma 1 y luego se convierte a objeto otra vez
		 * Ocurre unboxing, la suma y boxing nuevamente
		 */
		
		// esto ocurre internamente
		Integer ref2 = 7;
		int valor =  (int)ref2;	//unboxing	
		valor = valor + 1;
		ref2 = Integer.valueOf(valor);  // boxing
		System.out.println(ref2); // se imprime 8
		
		/**
		 * Todos los datos de tipo numéricos heredan de la 
		 * clase java.lang.Number
		 */
	}
}
