
public class Gerente extends Funcionario implements Autenticacion{

    private int contraseña;

    @Override
    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }
    
    @Override
    public boolean autenticar(int contraseña) {
        if (this.contraseña == contraseña) {
            return true;
        } else {
            return false;
        }
    }
    
    public double getBonificacion() {
        return super.getSalario() + super.getSalario() * 0.1;
    }
    
    
    

}