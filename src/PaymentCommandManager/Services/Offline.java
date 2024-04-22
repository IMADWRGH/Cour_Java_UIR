package PaymentCommandManager.Services;

import PaymentCommandManager.CommandeInterface.Paiement;
import PaymentCommandManager.DAO.DAO;

public class Offline implements Paiement {
    DAO dao =new DAO();

    static String query=null;
    @Override
    public String Pay() {
        return "pay in cash";
    }
}
