package shoplist.conf;

import java.util.Locale;
import java.util.PropertyResourceBundle;

public class ShopListSettings {
    
    
    private static final String DAO_CLASS_NAME = "dao.class.name";

        private static PropertyResourceBundle props;
        
        

    static {
        props = (PropertyResourceBundle) PropertyResourceBundle.getBundle("shoplist");
    }

    public static String getProperty(String name) {
        
         
        return props.getString(name);
    }
    
    public static String getDaoClassName() {
      
        return getProperty(DAO_CLASS_NAME);
    }
}
    

