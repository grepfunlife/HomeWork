

package shoplist.filter;

import java.util.Date;

/**
 *
 * @author love_polyanskaya
 */
public class ShopListFilter {
    
    private String productName;
    private Date frome;
    private Date to;
    private int page;
    private int pageSize;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Date getFrome() {
        return frome;
    }

    public void setFrome(Date frome) {
        this.frome = frome;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }
    
    

}
