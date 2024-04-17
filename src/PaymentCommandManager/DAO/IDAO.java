package PaymentCommandManager.DAO;

public interface IDAO<T> {
    int insert(T Obj);
    int delete(int id);
    String update(String sql);
    String select();
}
