package br.com.design.patterns.state.payment.situation;

import br.com.design.patterns.state.payment.Payment;

public class Regular extends PaymentSituation {

    public Regular() {
        this.planAction();
    }
    @Override
    public void planAction() {
        System.out.println("Plano regular liberado!");
    }

    public void makeDownGrade(Payment payment) {
        payment.setSituation(new DownGrade());
    }

    public void makeUpgrade(Payment payment) {
        payment.setSituation(new Upgrade());
    }

}
