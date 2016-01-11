package shoplist.logic;

import java.util.Collections;
import java.util.List;
import shoplist.dao.ShopListProductDAO;
import shoplist.dao.ShopListProductDAOFactory;
import shoplist.entity.ShopListProduct;
import shoplist.exception.ShopListDAOException;
import shoplist.filter.ShopListFilter;

public class ProductManager {
    
    private ShopListProductDAO dao = ShopListProductDAOFactory.getShopListProductDAO();

    public long addProduct(ShopListProduct product){
        try {
            return dao.addProduct(product);
        } catch (ShopListDAOException ex) {
      
        }
        return 0;
    }
    
    public void updateProduct(ShopListProduct product){
        try {
            dao.updateProduct(product);
        } catch (ShopListDAOException ex) {
            
        }
    }
    
    public void deleteProduct(ShopListProduct product){
        try {
            dao.deleteProduct(product);
        } catch (ShopListDAOException ex) {
            
        }
    }

    public ShopListProduct getProduct(ShopListProduct product){
        try {
            return dao.getProduct(product);
        } catch (ShopListDAOException ex) {
            
        }
        return null;
    }

    public List<ShopListProduct> findProducts(ShopListFilter filter){
        try {
            return dao.findProducts(filter);
        } catch (ShopListDAOException ex) {
            
        }
        return Collections.emptyList();
    }
    
    public List<ShopListProduct> findProductsInBasket(ShopListFilter filter){
        try {
            return dao.findProductsInBasket(filter);
        } catch (ShopListDAOException ex) {
            
        }
        return Collections.emptyList();
    }
    
    public ShopListProduct getProductInBasket(ShopListProduct product){
        try {
            return dao.getProductInBasket(product);
        } catch (ShopListDAOException ex) {
            
        }
        return null;
    }

}
