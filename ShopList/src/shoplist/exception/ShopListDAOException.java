

package shoplist.exception;

/**
 *
 * @author love_polyanskaya
 */
public class ShopListDAOException extends ShopListException {

    public ShopListDAOException() {
    }

    public ShopListDAOException(String message) {
        super(message);
    }

    public ShopListDAOException(String message, Throwable cause) {
        super(message, cause);
    }

    public ShopListDAOException(Throwable cause) {
        super(cause);
    }

    public ShopListDAOException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
