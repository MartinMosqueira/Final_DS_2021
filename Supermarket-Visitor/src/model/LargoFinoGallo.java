package model;

public class LargoFinoGallo implements Arroz{
    private String marca;
    private String tipo;
    private int peso;

    public LargoFinoGallo(String marca, String tipo, int peso) {
        this.marca = "Gallo";
        this.tipo = "Largo Fino";
        this.peso = 500;
    }

    @Override
    public void accept(ProductsVisitor visitor) {
        visitor.visit_largoFino_gallo(this);
    }

    @Override
    public String toString() {
        return "LargoFinoGallo{" +
                "marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", peso=" + peso +
                '}';
    }
}
