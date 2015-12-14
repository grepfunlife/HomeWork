package shoplist.entity;

import java.util.List;

public class ShopListCategory {

    private int categoryId;
    private List listProduct;
    private String categoryName;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public List getListProduct() {
        return listProduct;
    }

    public void setListProduct(List listProduct) {
        this.listProduct = listProduct;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    
    
    
}
