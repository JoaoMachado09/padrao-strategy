package padroescomportamentais.strategy;

public class Pedido {

    private float valorPago;

    public float getValorPago() {
        return valorPago;
    }

    public void pagarComPix(float valor) {
        Caixa caixa = new Caixa(valor);
        this.valorPago = caixa.calcular(new PagamentoPix());
    }

    public void pagarComBoleto(float valor) {
        Caixa caixa = new Caixa(valor);
        this.valorPago = caixa.calcular(new PagamentoBoleto());
    }

    public void pagarComCartaoDebito(float valor) {
        Caixa caixa = new Caixa(valor);
        this.valorPago = caixa.calcular(new PagamentoCartaoDebito());
    }

    public void pagarComCartaoCredito(float valor) {
        Caixa caixa = new Caixa(valor);
        this.valorPago = caixa.calcular(new PagamentoCartaoCredito());
    }

}
