
public class Cliente implements Autenticacion {

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
    
}
