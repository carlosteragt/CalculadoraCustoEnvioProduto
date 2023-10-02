public class CalculadoraFrete {
    double freteProduto;


    public double calcularCustoEnvio(double peso, double altura, double largura, double preço, int tipoEnvio){
            if( tipoEnvio == 1){
                freteProduto = peso * 2;
            }
            else if(tipoEnvio == 2){
                freteProduto = altura * largura;
            }
            else if (tipoEnvio == 3) {
                if(preço > 500){
                    freteProduto = 0;
                }
                else{
                    freteProduto = 20;
                }
            }
            return freteProduto;
    }

}
