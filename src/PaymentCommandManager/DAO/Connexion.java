package PaymentCommandManager.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connexion {
    public static String url="jdbc:mysql://localhost:3307/gestion_Commandes";
    public static String user="root";
    public static String  password="";
    static Connection connexion=null;
    public static String driver="com.mysql.jdbc.Driver";

    public static Connection connect(){
        if (connexion==null){
            try{
                Class.forName(driver);
                connexion= DriverManager.getConnection(url,user,password);
                return connexion;
            }catch (Exception e){
                System.out.println("Driver error");
            }
        }
        return connexion;
    }

    public static void Deconnect(){
        if (connexion!=null){
            try {
                connexion.close();
            }catch (Exception e){
                Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE,null,e);
            }
            connexion=null;
        }
    }

}
