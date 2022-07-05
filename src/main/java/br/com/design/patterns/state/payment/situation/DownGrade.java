package br.com.design.patterns.state.payment.situation;

import br.com.design.patterns.state.payment.Payment;

public class DownGrade extends PaymentSituation {

    public DownGrade() {
        this.planAction();
    }

    @Override
    public void planAction() {
        System.out.println("Downgrade do Plano feito com sucesso!");
    }

    public void regular(Payment payment) {
        payment.setSituation(new Regular());
    }
}
