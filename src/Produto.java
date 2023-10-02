import java.util.ArrayList;
import java.util.List;

public class Produto {
    private double peso;
    private double altura;
    private double largura;
    private double preço;
    private int tipoEnvio;

    List<Produto> produtos;

    public Produto(double peso, double altura, double largura, double preço, int tipoEnvio) {
        this.peso = peso;
        this.altura = altura;
        this.largura = largura;
        this.preço = preço;
        this.tipoEnvio = tipoEnvio;
        this.produtos = new ArrayList<>();
    }


    public int getTipoEnvio() {
        return tipoEnvio;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getPreço() {
        return preço;
    }

}
