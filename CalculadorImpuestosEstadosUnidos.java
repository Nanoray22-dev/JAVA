
public class CalculadorImpuestosEstadosUnidos implements CalculadorImpuestos {
    private static final double SALES_TAX = 0.08;
    
    @Override
    public double calcularImpuestos(double precio) {
        return precio * SALES_TAX;
    }
}