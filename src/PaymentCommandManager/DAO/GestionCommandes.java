package PaymentCommandManager.DAO;


import PaymentCommandManager.Model.Commande;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GestionCommandes {
    private static String query;
    public static ArrayList<Commande> Select() {
        try {
            query = "select * from commande ";
            Statement statement= Connexion.connect().createStatement();
            ResultSet resultSet=statement.executeQuery(query);
            while(resultSet.next()){
                System.out.println(resultSet.getString("id"));
                System.out.println(resultSet.getString("product"));
                System.out.println(resultSet.getString("quantite"));
                System.out.println(resultSet.getString("prix"));
                System.out.println("---------------------------------");
            }

        }catch (Exception msg){
            msg.getMessage();
        }
        return null;
    }
    public static void main(String[] args) {
      Select();
    }
}
