package padroescomportamentais.strategy;

public class Caixa {

    private float valor;

    public Caixa(float valor) {
        this.valor = valor;
    }

    public float calcular(FormaPagamento formaPagamento) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
        return formaPagamento.calcular(valor);
    }
}
