package ar.com.bytebank.modelo;
/**
 *  La clase Cliente implementa la interface Autenticacion al igual
 *  que la clase Gerente y Administrador. De esta forma se obtiene el  
 *  polimorfismo a partir de las funciones contenidas en la interface  
 *  Autenticacion ahora comunes a las clases Cliente Gerente y 
 *  Administrador   
 * @author Martin
 * @version 1.0
 */


public class Cliente implements Autenticacion {

	private AutenticacionUtil autenticador;
	private String nombre;
	
	public Cliente() {
		this.autenticador = new AutenticacionUtil();
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	@Override
	public void setContrase�a(int contrase�a) {
		this.autenticador.setContrase�a(contrase�a);
	}

	@Override
	public boolean autenticar(int contrase�a) {
		if (this.autenticador.autenticar(contrase�a)) {
			return true;
		} else {
			return false;
		}
	}

}
