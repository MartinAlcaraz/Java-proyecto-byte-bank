
public class Gerente extends Funcionario{

    private int contrase�a;

    public void setContrase�a(int contrase�a) {
        this.contrase�a = contrase�a;
    }

    public boolean autenticar(int contrase�a) {
        if (this.contrase�a == contrase�a) {
            return true;
        } else {
            return false;
        }
    }
    
    public double getBonificacion() {
        return super.getBonificacion() + super.getSalario();
    }
    
    
    

}