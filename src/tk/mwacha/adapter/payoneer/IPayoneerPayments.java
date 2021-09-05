package tk.mwacha.adapter.payoneer;

import tk.mwacha.adapter.utils.Token;

public interface IPayoneerPayments {
    Token authToken();
    void sendPayment();
    void receivePayment();
}
