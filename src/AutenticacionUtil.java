
public class AutenticacionUtil {
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

}