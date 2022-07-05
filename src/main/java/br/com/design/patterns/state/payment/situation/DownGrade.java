package br.com.design.patterns.state.payment.situation;

import br.com.design.patterns.state.payment.Payment;

class DownGrade extends PaymentSituation {
    @Override
    public void planAction() {
        System.out.println("Downgrade do Plano feito com sucesso!");
    }

    public void regular(Payment payment) {
        payment.setSituation(new Regular());
    }
}
