package PaymentCommandManager.DAO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IDAO<T> {
    int insert() throws SQLException;
    int delete(T Obj);
    int  update(T Obj);
    ArrayList<T> select(T Obj);
}
