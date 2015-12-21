package shoplist.dao;

import java.util.Collections;
import java.util.List;
import shoplist.entity.ShopListProduct;

public class ShopListFakeDAO implements ShopListProductDAO{

    @Override
    public long addProduct(ShopListProduct product) {
        System.out.println("addProduct");
        return 99;
    }

    @Override
    public void updateProduct(ShopListProduct product) {
        System.out.println("updateProduct");
    }

    @Override
    public void deleteProduct(ShopListProduct product) {
        System.out.println("deleteProduct" + product);
    }

    @Override
    public ShopListProduct getProduct(ShopListProduct product) {
        System.out.println("addProduct");
        return new ShopListProduct();
    }

    @Override
    public List<ShopListProduct> findProducts() {
        System.out.println("findProducts");
        return Collections.emptyList();
    }

    @Override
    public List<ShopListProduct> findProductsInBasket() {
        System.out.println("findProductsInBasket");
        return Collections.emptyList();   
    }

    @Override
    public ShopListProduct getProductInBasket(ShopListProduct product) {
        System.out.println("getProductInBasket");
        return new ShopListProduct();
    }

}
