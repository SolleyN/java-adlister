import com.codeup.adlister.dao.Users;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MySQLUsersDao implements Users {
private Connection connection;
    public User findByUsername(String username) {
        return null;
    }
    public Long insert(User user) {
        return null;
    }
//    public User getUserByUsername(String username) throws SQLException {
//        String sql = "SELECT * FROM users WHERE username = ?";
//
//        PreparedStatement stmt = connection.prepareStatement(sql);
//        stmt.setString(1, username);
//        ResultSet rs = stmt.executeQuery();
//        User user = null;
//        if (rs.next()) user = new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"));
//        rs.close();
//        stmt.close();
//        return user;

//    }
}