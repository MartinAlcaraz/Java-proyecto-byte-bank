package ar.com.bytebank.boxingUnboxing;

public class TestIntegerConstants {

	public static void main(String[] args) {
		/**
		 * Todos los datos de tipo numéricos heredan de la 
		 * clase java.lang.Number
		 */
		
		System.out.println(Integer.MAX_VALUE); // 2^31 - 1
		System.out.println(Integer.MIN_VALUE); //-2^31

		System.out.println(Integer.SIZE); // 32 bits
		System.out.println(Integer.BYTES); //4 Bytes, tamaño en bytes
	}
}
