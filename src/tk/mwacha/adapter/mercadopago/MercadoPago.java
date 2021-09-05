package tk.mwacha.adapter.mercadopago;

import tk.mwacha.adapter.utils.Token;

public class MercadoPago implements IMercadoPago {
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendMercadoPagoPayment() {
        System.out.println("Enviando Pagamentos via Mercado Pago");
    }

    @Override
    public void receiveMercadoPagoPayment() {
        System.out.println("Recebendo Pagamentos via Mercado Pago");
    }
}
