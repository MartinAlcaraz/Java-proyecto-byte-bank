
public class Gerente extends Funcionario{

    private int contraseña;

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public boolean autenticar(int contraseña) {
        if (this.contraseña == contraseña) {
            return true;
        } else {
            return false;
        }
    }
    
    public double getBonificacion() {
        return super.getBonificacion() + super.getSalario();
    }
    
    
    

}