import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads {
    Config Config = new Config();
    private Connection connection;
    private Statement statement;

    public MySQLAdsDao() {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    Config.getUrl(),
                    Config.getUser(),
                    Config.getPassword()
                            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public List<Ad> getAds() {
        List<Ad> ads = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM ads");

            while (resultSet.next()) {
                Ad ad = new Ad(
                        resultSet.getInt("id"),
                        resultSet.getString("title"),
                        resultSet.getString("description"));

                ads.add(ad);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ads;
    }




    @Override
    public Long insert(Ad ad) {
        try {
            String query = "INSERT INTO ads (user_id, title, description) VALUES (?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stmt.setLong(1, ad.getUserId());
            stmt.setString(2, ad.getTitle());
            stmt.setString(3, ad.getDescription());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();// Creates primary key and allows us to access the primary that was created
            if (rs.next()) {
                Long id = rs.getLong(1);
                return id;
            } else {
                throw new SQLException("Failed to get auto-generated id for inserted ad");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }}
