package shoplist.dao;

import java.util.List;
import shoplist.entity.ShopListProduct;

public interface ShopListProductDAO {
 
    public long addProduct(ShopListProduct product);    
    public void updateProduct(ShopListProduct product);    
    public void deleteProduct(ShopListProduct product);
    public ShopListProduct getProduct(ShopListProduct product);
    public List<ShopListProduct> findProducts();    
    public List<ShopListProduct> findProductsInBasket();
    public ShopListProduct getProductInBasket(ShopListProduct product);
}
