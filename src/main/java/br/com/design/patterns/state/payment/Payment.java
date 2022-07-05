package br.com.design.patterns.state.payment;

import br.com.design.patterns.state.payment.situation.PaymentSituation;

public class Payment {
    private PaymentSituation situation;

    public void setSituation(PaymentSituation situation) {
        this.situation = situation;
    }
}
