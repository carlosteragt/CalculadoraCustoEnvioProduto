public class Produto {
    private double peso;
    private double altura;
    private double largura;
    private double preço;
    private int tipoEnvio;

    public Produto(double peso, double altura, double largura, double preço, int tipoEnvio) {
        this.peso = peso;
        this.altura = altura;
        this.largura = largura;
        this.preço = preço;
        this.tipoEnvio = tipoEnvio;
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
