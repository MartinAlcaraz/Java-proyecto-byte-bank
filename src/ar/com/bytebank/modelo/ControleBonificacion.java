package ar.com.bytebank.modelo;

public class ControleBonificacion {
	
	private double suma;
	
	public void registrar(Funcionario f) {
	    double bonificacion = f.getBonificacion();
	    this.suma = this.suma + bonificacion;
	}

	public double getSuma() {
	    return this.suma;
	}
}
