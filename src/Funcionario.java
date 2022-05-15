
//  Una clase abstracta no es m�s que una clase com�n la cual posee
// atributos, m�todos, constructores y por lo menos un m�todo abstracto. 
//  Una clase abstracta no puede ser instanciada, solo heredada.


//Gerente Administrador Dise�ador y Contador heredan de Funcionario

// Gerente y Administrador Implementan la Interface Autenticacion

// AutenticacionUtil es una clase utilizada por Gerente y Administrador
// para poder autenticarse en el SistemaInterno, ya que se repite el 
// mismo m�todo en Gerente y Administrador. 



public abstract class Funcionario {

    private String nombre;
    private String documentoIdentidad;
    private double salario;

// los metodos abstractos deben ser implementados en la clase hija
    public abstract double getBonificacion();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
   
}