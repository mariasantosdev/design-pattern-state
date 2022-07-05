package br.com.design.patterns.state.payment.situation;

import br.com.design.patterns.state.payment.Payment;

class Regular extends PaymentSituation {
    @Override
    public void planAction() {
        System.out.println("Plano liberado!");
    }

    public void makeDownGrade(Payment payment) {
        payment.setSituation(new DownGrade());
    }

    public void askForReimbursed(Payment payment) {
        payment.setSituation(new Reimbursed());
    }

    public void makeUpgrade(Payment payment) {
        payment.setSituation(new Upgrade());
    }

}
