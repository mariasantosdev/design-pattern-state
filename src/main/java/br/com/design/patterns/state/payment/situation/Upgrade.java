package br.com.design.patterns.state.payment.situation;

import br.com.design.patterns.state.payment.Payment;

public class Upgrade extends PaymentSituation {

    public Upgrade() {
        this.planAction();
    }
    @Override
    public void planAction() {
        System.out.println("Upgrade do Plano feito com sucesso!");
    }

    public void regular(Payment payment) {
        payment.setSituation(new Regular());
    }
}
