package shoplist.logic;

import java.util.List;
import shoplist.dao.ShopListFakeDAO;
import shoplist.dao.ShopListProductDAO;
import shoplist.entity.ShopListProduct;

public class ProductManager {
    
    private ShopListProductDAO dao = new ShopListFakeDAO();

    public long addProduct(ShopListProduct product){
    return dao.addProduct(product);
    }
    
    public void updateProduct(ShopListProduct product){
    dao.updateProduct(product);
    }
    
    public void deleteProduct(ShopListProduct product){
    dao.deleteProduct(product);
    }

    public ShopListProduct getProduct(ShopListProduct product){
    return dao.getProduct(product);
    }

    public List<ShopListProduct> findProducts(){
    return dao.findProducts();
    }
    
    public List<ShopListProduct> findProductsInBasket(){
    return dao.findProductsInBasket();
    }
    
    public ShopListProduct getProductInBasket(ShopListProduct product){
    return dao.getProductInBasket(product);
    }

}
