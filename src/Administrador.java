
// la clase Administrador es hija de la clase abstracta Funcionario.
// e implementa las funcionalidades de la interface Autenticacion.





public class Administrador extends Funcionario implements Autenticacion {

	private AutenticacionUtil autenticador;

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

	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}

}
