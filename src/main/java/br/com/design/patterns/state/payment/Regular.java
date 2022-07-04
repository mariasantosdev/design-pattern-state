package br.com.design.patterns.state.payment;

class Regular extends PaymentSituation {
    @Override
    public void planAction() {
        System.out.println("Plano liberado!");
    }
}
