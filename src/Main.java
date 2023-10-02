import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalculadoraFrete calculadoraFrete = new CalculadoraFrete();

        Produto p1 = new Produto(10,10,5,300,1);
        Produto p2 = new Produto(20,15,30,500,2);
        Produto p3 = new Produto(5,5,30,600,3);


        System.out.println("Frete produto 1 = " + calculadoraFrete.calcularCustoEnvio(p1.getPeso(), p1.getAltura(), p1.getLargura(), p1.getPreço(), p1.getTipoEnvio()));
        System.out.println("Frete produto 2 = " + calculadoraFrete.calcularCustoEnvio(p2.getPeso(), p2.getAltura(), p2.getLargura(), p2.getPreço(), p2.getTipoEnvio()));
        System.out.println("Frete produto 3 = " + calculadoraFrete.calcularCustoEnvio(p3.getPeso(), p3.getAltura(), p3.getLargura(), p3.getPreço(), p3.getTipoEnvio()));

    }
}