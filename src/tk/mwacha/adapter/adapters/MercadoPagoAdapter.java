package tk.mwacha.adapter.adapters;

import tk.mwacha.adapter.mercadopago.MercadoPago;
import tk.mwacha.adapter.paypal.IPaypalPayments;
import tk.mwacha.adapter.utils.Token;

public class MercadoPagoAdapter implements IPaypalPayments {

    private Token token;
    private MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago) {
        this.mercadoPago  = mercadoPago;
        System.out.println("Adaptando o MercadoPago utilizando os métodos padrões do Paypal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.mercadoPago.sendMercadoPagoPayment();
    }

    @Override
    public void paypalReceive() {
        this.mercadoPago.receiveMercadoPagoPayment();
    }
}
