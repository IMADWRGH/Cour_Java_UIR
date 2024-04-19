package PaymentCommandManager.Services;

import PaymentCommandManager.CommandeInterface.Paiement;
import PaymentCommandManager.DAO.DAO;
import PaymentCommandManager.DAO.IDAO;
import PaymentCommandManager.Model.Commande;

import java.sql.SQLException;
import java.util.ArrayList;

public class Offline implements Paiement, IDAO<Commande> {
    DAO dao =new DAO();

    static String query=null;
    @Override
    public String Pay() {
        return "pay in cash";
    }

    @Override
    public int insert(Commande commande) throws SQLException {
        query="insert into eleve(nom,prenom,groupe)  values('"+commande.getProduit()+"','"+commande.getQuantite()+"','"+commande.getPrix()
                +"','"+commande.getPaiement().Pay()+")";
        return dao.Set(query);
    }

    @Override
    public int delete(Commande Obj) {
        return 0;
    }

    @Override
    public int update(Commande Obj) {
        return 0;
    }

    @Override
    public ArrayList<Commande> select(Commande Obj) {
        return null;
    }
}
