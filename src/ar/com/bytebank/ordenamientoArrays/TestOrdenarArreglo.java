package ar.com.bytebank.ordenamientoArrays;
import java.util.Arrays;

public class TestOrdenarArreglo {

	    public static void main(String[] args)
	    {
	        int[] numeros = new int[]{43, 15, 64, 22, 89};

	        Arrays.sort(numeros); //método utilitário sort

//  System.out.println(numeros.toString()); // imprime direccion de memoria

	        for (int num : numeros) {	// una forma de imprimir el arreglo
	        	System.out.println(num);
	        }
	        
	        System.out.println(Arrays.toString(numeros)); //método utilitário toString
	        
	        //Salida : [15, 22, 43, 64, 89]
	    }
	
}
