

package shoplist.dao;

import shoplist.conf.ShopListSettings;
import shoplist.logic.DAOAnnotation;

@DAOAnnotation(daoName  = "shoplist.dao.ShopListFakeDAO")
public class ShopListProductDAOFactory {
    
        public static ShopListProductDAO getShopListProductDAO(){
        ShopListProductDAO dao = null;
        String className = ShopListSettings.getDaoClassName();
        if (className == null) {
            DAOAnnotation daoAn = ShopListProductDAOFactory.class.getAnnotation(DAOAnnotation.class);
            if (daoAn != null) {
                className = daoAn.daoName();
                System.out.println("DAO from annotation");
            }
        }
        if (className != null) {
            System.out.println("DAO from reflection");
            try {
                Class cd = Class.forName(className);
                dao = (ShopListProductDAO) cd.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            dao = new ShopListFakeDAO();
        }

        return dao;
    }
}
