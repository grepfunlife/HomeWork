package shoplist.dao;

import java.util.Collections;
import java.util.List;
import shoplist.entity.ShopListProduct;
import shoplist.exception.ShopListDAOException;
import shoplist.filter.ShopListFilter;

public class ShopListFakeDAO implements ShopListProductDAO{

    @Override
    public long addProduct(ShopListProduct product) throws ShopListDAOException{
        System.out.println("addProduct");
        return 99;
    }

    @Override
    public void updateProduct(ShopListProduct product) throws ShopListDAOException{
        System.out.println("updateProduct");
    }

    @Override
    public void deleteProduct(ShopListProduct product) throws ShopListDAOException{
        System.out.println("deleteProduct" + product);
    }

    @Override
    public ShopListProduct getProduct(ShopListProduct product) throws ShopListDAOException{
        System.out.println("addProduct");
        return new ShopListProduct();
    }

    @Override
    public List<ShopListProduct> findProducts(ShopListFilter filter) throws ShopListDAOException{
        System.out.println("findProducts");
        return Collections.emptyList();
    }

    @Override
    public List<ShopListProduct> findProductsInBasket(ShopListFilter filter) throws ShopListDAOException{
        System.out.println("findProductsInBasket");
        return Collections.emptyList();   
    }

    @Override
    public ShopListProduct getProductInBasket(ShopListProduct product) throws ShopListDAOException{
        System.out.println("getProductInBasket");
        return new ShopListProduct();
    }

}
