package PaymentCommandManager.DAO;

import java.util.ArrayList;

public interface IDAO<T> {
    int insert(T Obj);
    int delete(T Obj);
    int  update(T Obj);
    ArrayList<T> select(T Obj);
}
