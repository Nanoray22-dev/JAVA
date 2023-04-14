package Meta;
import include.CalculadorImpuestos;

public class TiendaEnLinea {
    private CalculadorImpuestos calculadorImpuestos;
    
    public TiendaEnLinea(CalculadorImpuestos calculadorImpuestos) {
        this.calculadorImpuestos = calculadorImpuestos;
    }
    
    public double calcularPrecioConImpuestos(double precio) {
        double impuestos = calculadorImpuestos.calcularImpuestos(precio);
        return precio + impuestos;
    }
}