package br.com.design.patterns.state.payment.situation;

class Reimbursed extends PaymentSituation {
    @Override
    public void planAction() {
        System.out.println("Plano cancelado!");
    }
}
