package padroescomportamentais.strategy;

public class PagamentoPix implements FormaPagamento {

    public float calcular(float valor) {
        return valor - (valor * 0.10f);
    }
}
