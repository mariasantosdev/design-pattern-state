package br.com.design.patterns.state.payment.situation;

class DownGrade extends PaymentSituation {
    @Override
    public void planAction() {
        System.out.println("Downgrade do Plano feito com sucesso!");
    }
}
