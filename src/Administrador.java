
// la clase Administrador es hija de la clase abstracta Funcionario.
// e implementa las funcionalidades de la interface Autenticacion.





public class Administrador extends Funcionario implements Autenticacion {

	private AutenticacionUtil autenticador;

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

	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}

}
