package PaymentCommandManager.DAO;

import PaymentCommandManager.Model.Commande;
import com.mysql.jdbc.Statement;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DAO{
    static String query;
    Statement statement=null;
    public DAO(){
        try {
            statement= (Statement) Connexion.connect().createStatement();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

//    public static void main(String[] args) throws SQLException {
//        DAO dao =new DAO();
//        dao.insert();
//    }


    public ArrayList<Map<String,String>> Get(String sql)throws SQLException  {
           ArrayList<Map<String,String>> list =new ArrayList<>();
           ResultSet resultSet=statement.executeQuery(sql);
           Map<String,String> dictionary;
           ResultSetMetaData data=resultSet.getMetaData();
           int number_champs=data.getColumnCount();
           int i=0;
           while (resultSet.next()){
               dictionary=new HashMap<>();
               for (i=1;i<=number_champs;i++)
                   dictionary.put(data.getColumnName(i),resultSet.getString(i));
               list.add(dictionary);
               dictionary=null;
           }
          return list;
    }

//    @Override
    public int insert(Commande commande) throws SQLException {
        String query="insert into Commande (product,quantite,prix)" +
                " values('"+commande.getProduit()+"','"+commande.getQuantite()+"','"+commande.getQuantite()+"')";
        int resultSet= statement.executeUpdate(query);
//        PreparedStatement preparedStatement = Connexion.connect().prepareStatement(query);
//        preparedStatement.setString(1, "p1");
//        preparedStatement.setInt(2, 22);
//        preparedStatement.setDouble(3, 333.45);
//        preparedStatement.execute();
        return 1;
    }

//    @Override
//    public int delete(Commande Obj) {
//        return 0;
//    }

//    @Override
//    public int update(Commande Obj) {
//        return 0;
//    }
//
//    @Override
    public ArrayList<Commande> select(Commande Obj) {
        return null;
    }
}
