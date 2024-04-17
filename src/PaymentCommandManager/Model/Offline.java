package PaymentCommandManager.Model;

import PaymentCommandManager.Impl.Paiement;

public class Offline implements Paiement {
    @Override
    public void Pay() {
        System.out.println("Offline");
    }
}
