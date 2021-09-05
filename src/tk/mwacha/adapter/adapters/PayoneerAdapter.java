package tk.mwacha.adapter.adapters;

import tk.mwacha.adapter.payoneer.Payoneer;
import tk.mwacha.adapter.paypal.IPaypalPayments;
import tk.mwacha.adapter.utils.Token;

public class PayoneerAdapter implements IPaypalPayments {

    private Token token;
    private Payoneer payoneer;

    public PayoneerAdapter(Payoneer payoneer) {
        this.payoneer  = payoneer;
        System.out.println("Adaptando o Payoneer utilizando os métodos padrões do Paypal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.payoneer.sendPayment();
    }

    @Override
    public void paypalReceive() {
        this.payoneer.receivePayment();
    }
}
