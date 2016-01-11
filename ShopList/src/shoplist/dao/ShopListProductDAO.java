package shoplist.dao;

import java.util.List;
import shoplist.entity.ShopListProduct;
import shoplist.exception.ShopListDAOException;
import shoplist.filter.ShopListFilter;

public interface ShopListProductDAO {
 
    public long addProduct(ShopListProduct product) throws ShopListDAOException;        
    public void updateProduct(ShopListProduct product) throws ShopListDAOException;    
    public void deleteProduct(ShopListProduct product)throws ShopListDAOException;
    public ShopListProduct getProduct(ShopListProduct product)throws ShopListDAOException;
    public List<ShopListProduct> findProducts(ShopListFilter filter) throws ShopListDAOException;    
    public List<ShopListProduct> findProductsInBasket(ShopListFilter filter) throws ShopListDAOException;
    public ShopListProduct getProductInBasket(ShopListProduct product) throws ShopListDAOException;
}
