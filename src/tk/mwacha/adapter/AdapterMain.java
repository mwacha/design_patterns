package tk.mwacha.adapter;

import tk.mwacha.adapter.adapters.MercadoPagoAdapter;
import tk.mwacha.adapter.adapters.PayoneerAdapter;
import tk.mwacha.adapter.mercadopago.MercadoPago;
import tk.mwacha.adapter.payoneer.Payoneer;
import tk.mwacha.adapter.paypal.IPaypalPayments;
import tk.mwacha.adapter.paypal.Paypal;

public class AdapterMain {
    public static void main(String[] args) {
        IPaypalPayments paymentPaypal = new Paypal();
        paymentPaypal.paypalPayment();
        paymentPaypal.paypalReceive();

        IPaypalPayments paymentPayoneer = new PayoneerAdapter(new Payoneer());
        paymentPayoneer.paypalPayment();
        paymentPayoneer.paypalReceive();

        IPaypalPayments paymentMercadoPago = new MercadoPagoAdapter(new MercadoPago());
        paymentMercadoPago.paypalPayment();
        paymentMercadoPago.paypalReceive();
    }
}
