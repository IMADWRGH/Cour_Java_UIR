package PaymentCommandManager.Services;

import PaymentCommandManager.CommandeInterface.Paiement;
import PaymentCommandManager.DAO.DAO;
import PaymentCommandManager.DAO.IDAO;
import PaymentCommandManager.Model.Commande;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

public class Online  implements Paiement, IDAO<Commande> {
    DAO dao =new DAO();

    static String query=null;
    @Override
    public String Pay() {
        System.out.println("Online");
        ApiService apiService=new ApiService();
        String json =apiService.fetch();
        Map<String , Object> data= apiService.getData(json);
        return "pay in paypal";
    }

    @Override
    public int insert(Commande commande) throws SQLException {
        query="insert into eleve(nom,prenom,groupe)  values('"+commande.getProduit()+"','"+commande.getQuantite()+"','"+commande.getPrix()
                +"','"+commande.getPaiement().Pay()+")";
        return dao.Set(query);
    }

    @Override
    public int delete(Commande commande) {
        return 0;
    }

    @Override
    public int update(Commande commande) {
        return 0;
    }

    @Override
    public ArrayList<Commande> select(Commande commande) {
        return null;
    }
}
