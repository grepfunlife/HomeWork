
package shoplist.exception;

public class ShopListException extends Exception {

    public ShopListException() {
    }

    public ShopListException(String message) {
        super(message);
    }

    public ShopListException(String message, Throwable cause) {
        super(message, cause);
    }

    public ShopListException(Throwable cause) {
        super(cause);
    }

    public ShopListException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    

}
