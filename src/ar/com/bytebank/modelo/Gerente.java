package ar.com.bytebank.modelo;


public class Gerente extends Funcionario implements Autenticacion{

    private AutenticacionUtil autenticador;

// aqu� se implementa el m�todo que no est� definido en la interface Autenticacion 
    @Override
    public void setContrase�a(int contrase�a) {
        this.autenticador.setContrase�a(contrase�a);
    }

// aqu� se implemanta el m�todo que no est� definido en la interface Autenticacion 
    @Override
    public boolean autenticar(int contrase�a) {
        if (this.autenticador.autenticar(contrase�a)) {
            return true;
        } else {
            return false;
        }
    }
    
    // aqu� se define el m�todo que es abstracto en la clase madre.
    public double getBonificacion() {
        return super.getSalario() + super.getSalario() * 0.1;
    }
    
    
    

}