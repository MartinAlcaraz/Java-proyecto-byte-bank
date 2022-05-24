package ar.com.bytebank.arrays;
/**
 * Este array fue creado para entender el funcionamiento interno de 
 * un ArryList. Para trabajar siempre es recomendable utilizar
 * el ArryList que viene por defecto en la libreria java.util
 * @author Martin
 *
 */
public class ArrayGenerico {

	Object[] array;
	protected int tamano;

	public ArrayGenerico(int tamano) {
		array = new Object[tamano];
		this.tamano = tamano;
	}
	
//	public int tamano() {
//		return length;
//	}

	public void agregar(Object obj) {
		int i = 0;
		while (array[i] != null & i < array.length) {
			i++;
		}
		if (i < array.length) {
			array[i] = obj;
		}
	}
	public Object obtener(int indice){
		if (indice < array.length) {
			return array[indice];
		}
		return null;
	}
	
}
