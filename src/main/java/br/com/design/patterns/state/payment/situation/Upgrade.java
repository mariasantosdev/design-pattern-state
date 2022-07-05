package br.com.design.patterns.state.payment.situation;

import br.com.design.patterns.state.payment.Payment;

class Upgrade extends PaymentSituation {
    @Override
    public void planAction() {
        System.out.println("Upgrade do Plano feito com sucesso!");
    }

    public void regular(Payment payment) {
        payment.setSituation(new Regular());
    }
}
