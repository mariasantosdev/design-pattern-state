package br.com.design.patterns.state.payment.situation;

import br.com.design.patterns.state.payment.Payment;
import exception.DomainException;

public abstract class PaymentSituation {

    public abstract void planAction();

    public void askForReimbursed(Payment payment) {
        payment.setSituation(new Reimbursed());
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

