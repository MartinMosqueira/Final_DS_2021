package model;

public class IntegralGallo implements Arroz{
    private String marca;
    private String tipo;
    private int peso;

    public IntegralGallo() {
        this.marca = "Gallo";
        this.tipo = "Integral";
        this.peso = 500;
    }

    @Override
    public void accept(ProductsVisitor visitor) {
        visitor.visit_integral_gallo(this);
    }

    @Override
    public String toString() {
        return "IntegralGallo{" +
                "marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", peso=" + peso +
                '}';
    }
}
