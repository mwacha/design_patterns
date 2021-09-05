package tk.mwacha.adapter.paypal;

import tk.mwacha.adapter.utils.Token;

public interface IPaypalPayments {
    Token authToken();
    void paypalPayment();
    void paypalReceive();
}
