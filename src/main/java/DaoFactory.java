import java.sql.*;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao();
        }
        return adsDao;
    }
}





