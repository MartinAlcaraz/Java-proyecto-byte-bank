package ar.com.bytebank.modelo;

public class CalculadoraDeImpuesto {

    private double totalImpuesto;

    public void registra(Tributacion t) {
        double valor = t.getValorImpuesto();

        System.out.println("valor: "+ valor);
        
        this.totalImpuesto += valor;
    }
    
    public double getTotalImpuesto() {
        return totalImpuesto;
    }

}