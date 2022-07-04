package br.com.design.patterns.state.payment;

import exception.DomainException;

public abstract class PaymentSituation {
    public void reimbursed(Payment payment) throws DomainException {
        throw new DomainException("Pagamento nao pode ser reembolsado!");
    }

    public void regular(Payment payment) throws DomainException {
        throw new DomainException("Pagamento nao pode ser regular!");
    }

    public void downGrade(Payment payment) throws DomainException {
        throw new DomainException("Não pode ser feito o downgrade do pagamento!");
    }

    public void upgradeGrade(Payment payment) throws DomainException {
        throw new DomainException("Não pode ser feito o upgrade do pagamento!");
    }

}
