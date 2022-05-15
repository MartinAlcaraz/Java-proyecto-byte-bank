// la clase Cliente implementa la interface Autenticacion al igual 
// que la clase Gerente y Administrador. De esta forma se obtiene el 
// polimorfismo a partir de las funciones contenidas en la interface
// Autenticacion ahora comunes a las clases Cliente Gerente y Administrador


public class Cliente implements Autenticacion {

	private AutenticacionUtil autenticador;

	public Cliente() {
		this.autenticador = new AutenticacionUtil();
	}

	@Override
	public void setContraseña(int contraseña) {
		this.autenticador.setContraseña(contraseña);
	}

	@Override
	public boolean autenticar(int contraseña) {
		if (this.autenticador.autenticar(contraseña)) {
			return true;
		} else {
			return false;
		}
	}

}
