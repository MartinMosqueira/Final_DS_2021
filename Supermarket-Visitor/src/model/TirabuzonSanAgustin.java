package model;

public class TirabuzonSanAgustin implements Fideos{
    private String marca;
    private String tipo;
    private int peso;

    public TirabuzonSanAgustin() {
        this.marca = "San Agustin";
        this.tipo = "Tirabuzón";
        this.peso = 500;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPeso() {
        return peso;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public void accept(ProductsVisitor visitor) {
        visitor.visit_tirabuzon_sanAgustin(this);
    }

    @Override
    public String toString() {
        return "TirabuzonSanAgustin{" +
                "marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", peso=" + peso +
                '}';
    }
}
