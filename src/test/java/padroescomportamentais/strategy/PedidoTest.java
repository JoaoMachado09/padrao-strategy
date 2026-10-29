package padroescomportamentais.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveAplicarDescontoPagamentoPix() {
        Pedido pedido = new Pedido();
        pedido.pagarComPix(200.0f);
        assertEquals(180.0f, pedido.getValorPago());
    }

    @Test
    void deveAplicarDescontoPagamentoBoleto() {
        Pedido pedido = new Pedido();
        pedido.pagarComBoleto(200.0f);
        assertEquals(190.0f, pedido.getValorPago());
    }

    @Test
    void deveManterValorPagamentoCartaoDebito() {
        Pedido pedido = new Pedido();
        pedido.pagarComCartaoDebito(200.0f);
        assertEquals(200.0f, pedido.getValorPago());
    }

    @Test
    void deveAplicarAcrescimoPagamentoCartaoCredito() {
        Pedido pedido = new Pedido();
        pedido.pagarComCartaoCredito(200.0f);
        assertEquals(240.0f, pedido.getValorPago());
    }

    @Test
    void naoDevePagarPedidoComValorZero() {
        try {
            Pedido pedido = new Pedido();
            pedido.pagarComPix(0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor inválido", e.getMessage());
        }
    }

    @Test
    void naoDevePagarPedidoComValorNegativo() {
        try {
            Pedido pedido = new Pedido();
            pedido.pagarComCartaoCredito(-50.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor inválido", e.getMessage());
        }
    }

}
