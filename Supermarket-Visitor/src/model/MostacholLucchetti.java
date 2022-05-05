package model;

public class MostacholLucchetti implements Fideos{
    private String marca;
    private String tipo;
    private int peso;

    public MostacholLucchetti(String marca, String tipo, int peso) {
        this.marca = "Lucchetti";
        this.tipo = "Mostachol";
        this.peso = 600;
    }

    @Override
    public void accept(ProductsVisitor visitor) {

    }

    @Override
    public String toString() {
        return "MostacholLucchetti{" +
                "marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", peso=" + peso +
                '}';
    }
}
