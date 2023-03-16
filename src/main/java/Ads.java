import java.sql.SQLException;
import java.util.List;

public interface Ads {

    List<Ad> getAds();

    // get a list of all the ads

    // insert a new ad and return the new ad's id
    Long insert(Ad ad);

}
