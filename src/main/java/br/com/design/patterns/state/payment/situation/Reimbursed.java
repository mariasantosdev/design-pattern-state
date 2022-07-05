package br.com.design.patterns.state.payment.situation;

public class Reimbursed extends PaymentSituation {

    public Reimbursed() {
        this.planAction();
    }
    @Override
    public void planAction() {
        System.out.println("Plano cancelado!");
    }
}
