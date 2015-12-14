package shoplist.entity;

public class ShopListProduct {

    private long productId;
    private String productName;
    private ShopListCategory category;
    private boolean isInBasket;
    

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public boolean isIsInBasket() {
        return isInBasket;
    }

    public void setIsInBasket(boolean isInBasket) {
        this.isInBasket = isInBasket;
    }

    public ShopListCategory getCategory() {
        return category;
    }

    public void setCategory(ShopListCategory category) {
        this.category = category;
    }
    
    
}
