package padroescomportamentais.strategy;

public class PagamentoCartaoDebito implements FormaPagamento {

    public float calcular(float valor) {
        return valor;
    }
}
