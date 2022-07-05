package br.com.design.patterns.state.payment.situation;

import br.com.design.patterns.state.payment.Payment;
import exception.DomainException;

abstract class PaymentSituation {

    //TODO pensar em nome melhor para esse metodo
    public abstract void planAction();

    public void askForReimbursed(Payment payment) throws DomainException {
        throw new DomainException("Pagamento nao pode ser reembolsado!");
    }

    public void regular(Payment payment) throws DomainException {
        throw new DomainException("Pagamento nao pode ser regular!");
    }

    public void makeDownGrade(Payment payment) throws DomainException {
        throw new DomainException("Não pode ser feito o downgrade do pagamento!");
    }

    public void makeUpgrade(Payment payment) throws DomainException {
        throw new DomainException("Não pode ser feito o upgrade do pagamento!");
    }
}

