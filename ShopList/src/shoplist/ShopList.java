package shoplist;

import shoplist.entity.ShopListProduct;
import shoplist.logic.ShopListFacade;

public class ShopList {

    public static void main(String[] args) {
        ShopListFacade facade = new ShopListFacade();
        
        ShopListProduct product = new ShopListProduct();
        product.setProductName("nameProduct");
        product.setCategory(null);
        product.setIsInBasket(true);
        
        long productId = facade.addProduct(product);
        product.setProductId(productId);
        facade.updateProduct(product);
        facade.findProducts(null);
        facade.deleteProduct(null);
   
        
    }

}
