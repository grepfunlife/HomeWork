package shoplist.logic;

import java.util.List;
import shoplist.entity.ShopListProduct;
import shoplist.filter.ShopListFilter;

public class ShopListFacade {

    private final ProductManager productManager;
    private final CategoryManager categoryManager;

    public ShopListFacade() {
        productManager = new ProductManager(); 
        categoryManager = new CategoryManager();
    }
    
    public long addProduct(ShopListProduct product){
        return productManager.addProduct(product);
          
    }
    
    public void updateProduct(ShopListProduct product){
    productManager.updateProduct(product);
    }
    
    public void deleteProduct(ShopListProduct product){
    productManager.deleteProduct(product);
    }

    public ShopListProduct getProduct(ShopListProduct product){
    return productManager.getProduct(product);
    }

    public List<ShopListProduct> findProducts(ShopListFilter filter){
    return productManager.findProducts(filter);
    }
    
    public List<ShopListProduct> findProductsInBasket(ShopListFilter filter){
    return productManager.findProductsInBasket(filter);
    }
    
    public ShopListProduct getProductInBasket(ShopListProduct product){
    return productManager.getProductInBasket(product);
    }

}
