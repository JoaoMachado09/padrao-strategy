package padroescomportamentais.strategy;

public class PagamentoCartaoCredito implements FormaPagamento {

    public float calcular(float valor) {
        return valor + (valor * 0.20f);
    }
}
