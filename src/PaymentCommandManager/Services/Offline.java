package PaymentCommandManager.Services;

import PaymentCommandManager.CommandeInterface.Paiement;

public class Offline implements Paiement {
    @Override
    public void Pay() {
        System.out.println("Offline");
    }
}
