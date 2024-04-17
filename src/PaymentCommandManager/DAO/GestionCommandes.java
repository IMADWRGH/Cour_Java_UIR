package PaymentCommandManager.DAO;


import PaymentCommandManager.Model.Commande;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class GestionCommandes {
    private static String query;
    public static void Select() {
        try {
            query = "select * from commande ";
            Statement statement= Connexion.connect().createStatement();
            ResultSet resultSet=statement.executeQuery(query);
            ArrayList<Commande> arrayList=new ArrayList<Commande>();
            while(resultSet.next()){
                System.out.println(resultSet.getString("id"));
                System.out.println(resultSet.getString("product"));
                System.out.println(resultSet.getString("quantite"));
                System.out.println(resultSet.getString("prix"));
                System.out.println("---------------------------------");
            }
        }catch (Exception msg){
            System.out.println(msg.getMessage());
        }
    }
    public static void main(String[] args) {
      Select();
    }
}
