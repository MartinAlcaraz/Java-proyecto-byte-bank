
public class Designer extends Funcionario {

	@Override
	public double getBonificacion() {
		return super.getSalario() * 0.1;
	}

}
