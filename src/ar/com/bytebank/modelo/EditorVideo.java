package ar.com.bytebank.modelo;

public class EditorVideo extends Funcionario {

	@Override
	public double getBonificacion() {
		return super.getSalario() * 0.1;
	}
	
}
