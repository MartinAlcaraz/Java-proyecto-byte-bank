//  Una clase abstracta no es más que una clase común la cual posee
// atributos, métodos, constructores y por lo menos un método abstracto. 
//  Una clase abstracta no puede ser instanciada, solo heredada.

//Gerente Administrador Diseñador y Contador heredan de Funcionario

// Gerente y Administrador Implementan la Interface Autenticacion

// AutenticacionUtil es una clase utilizada por Gerente y Administrador
// para poder autenticarse en el SistemaInterno, ya que se repite el 
// mismo método en Gerente y Administrador. 

/**
 * Clase base para los empleados del banco
 * @author Martin
 * @version 1.0
 */

package ar.com.bytebank.modelo;

public abstract class Funcionario {

    private String nombre;
    private String documentoIdentidad;
    private double salario;

/**
 *  getBonificacion() Los metodos abstractos deben ser implementados 
 *  en la clase hija. 
 * @author Martin
 */
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