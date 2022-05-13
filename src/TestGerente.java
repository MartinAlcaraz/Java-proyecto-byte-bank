
public class TestGerente {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNombre("Mario");
        g1.setDocumentoIdentidad("235568413");
        g1.setSalario(5000.0);

        System.out.println(   g1.getBonificacion());
//        System.out.println(g1.getNombre());
//        System.out.println(g1.getDocumentoIdentidad());
//        System.out.println(g1.getSalario());

        g1.setContraseña(2222);
        boolean autenticacion = g1.autenticar(2222);

//        System.out.println(autenticacion);
//
//        System.out.println(g1.getBonificacion());
        
        
    }
    
    

}