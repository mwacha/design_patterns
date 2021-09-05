package tk.mwacha.adapter.mercadopago;

import tk.mwacha.adapter.utils.Token;

public interface IMercadoPago {
    Token authToken();
    void sendMercadoPagoPayment();
    void receiveMercadoPagoPayment();
}
