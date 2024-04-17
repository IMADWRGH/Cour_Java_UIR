package PaymentCommandManager.DAO;

import com.mysql.jdbc.Statement;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DAO {
    Statement statement=null;
    public DAO(){
        try {
            statement= (Statement) Connexion.connect().createStatement();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }


    public int Set(String sql) throws SQLException {
            return statement.executeUpdate(sql);
    }


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
}
