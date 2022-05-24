package ar.com.bytebank.modelo;


public class Gerente extends Funcionario implements Autenticacion{

    private AutenticacionUtil autenticador;

// aquí se implementa el método que no está definido en la interface Autenticacion 
    @Override
    public void setContraseña(int contraseña) {
        this.autenticador.setContraseña(contraseña);
    }

// aquí se implemanta el método que no está definido en la interface Autenticacion 
    @Override
    public boolean autenticar(int contraseña) {
        if (this.autenticador.autenticar(contraseña)) {
            return true;
        } else {
            return false;
        }
    }
    
    // aquí se define el método que es abstracto en la clase madre.
    public double getBonificacion() {
        return super.getSalario() + super.getSalario() * 0.1;
    }
    
    
    

}