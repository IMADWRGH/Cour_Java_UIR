package PaymentCommandManager.Services;

import PaymentCommandManager.CommandeInterface.Paiement;

public class Online implements Paiement {
    @Override
    public void Pay() {
        System.out.println("Online");
    }
}
