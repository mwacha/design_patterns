package tk.mwacha.adapter.payoneer;

import tk.mwacha.adapter.utils.Token;

public class Payoneer implements IPayoneerPayments{
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        System.out.println("Enviando Pagamentos via Payoneer");
    }

    @Override
    public void receivePayment() {
        System.out.println("Recebendo Pagamentos via Payoneer");
    }
}
