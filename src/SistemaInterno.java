
public class SistemaInterno {

    private int contrase�a = 2222;

    public void autenticar(Autenticacion empleado ){

        boolean autentico = empleado.autenticar(this.contrase�a);

        if (autentico) {
            System.out.println("Puede entrar al sistema");
        } else {
            System.out.println("No puede entrar al sistema");
        }
    }

	
}