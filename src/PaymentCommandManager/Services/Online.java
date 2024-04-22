package PaymentCommandManager.Services;

import PaymentCommandManager.CommandeInterface.Paiement;
import java.util.Map;

public class Online  implements Paiement {
    @Override
    public String Pay() {
        System.out.println("Online");
        ApiService apiService = new ApiService();
        String json = apiService.fetch();
        Map<String, Object> data = apiService.getData(json);
        return "pay in paypal";
    }
}
