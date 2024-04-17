package PaymentCommandManager.Model;

import PaymentCommandManager.Impl.Paiement;

public class Online implements Paiement {
    @Override
    public void Pay() {
        System.out.println("Online");
    }
}
