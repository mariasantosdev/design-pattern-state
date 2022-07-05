import br.com.design.patterns.state.payment.Payment;
import br.com.design.patterns.state.payment.situation.*;

public class Test {
    public static void main(String[] args) {
        Payment payment = new Payment();

        PaymentSituation downGrade = new DownGrade();
        payment.setSituation(downGrade);
        downGrade.askForReimbursed(payment);

        PaymentSituation regular = new Regular();
        payment.setSituation(regular);
        regular.makeDownGrade(payment);

        PaymentSituation reimbursed = new Reimbursed();
        payment.setSituation(reimbursed);

        PaymentSituation upgrade = new Upgrade();
        payment.setSituation(upgrade);
        upgrade.regular(payment);
    }

}
