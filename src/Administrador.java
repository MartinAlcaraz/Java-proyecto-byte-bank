
public class Administrador extends Funcionario implements Autenticacion {

	private int contrase�a;

	@Override
	public void setContrase�a(int contrase�a) {
		this.contrase�a = contrase�a;
	}

	@Override
	public boolean autenticar(int contrase�a) {
		if (this.contrase�a == contrase�a) {
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
