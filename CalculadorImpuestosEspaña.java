
public class CalculadorImpuestosEspaña implements CalculadorImpuestos {
    private static final double IVA = 0.21;
    
    @Override
    public double calcularImpuestos(double precio) {
        return precio * IVA;
    }
}