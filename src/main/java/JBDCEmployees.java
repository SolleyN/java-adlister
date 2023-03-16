import java.sql.*;


public class JBDCEmployees {
    public static void main(String[] args) {
        try {
    Connection connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/employees?allowPublicKeyRetrieval=true&useSSL=false",
            "root",
            "codeup"
    );
    Statement statement = connection.createStatement();
    String query = "select * from employees limit 10";
    ResultSet resultset = statement.executeQuery(query);
    while (resultset.next()) System.out.println(resultset.getString("first_name"));
} catch (Exception e) {


    throw new RuntimeException(e);
}
    }
}

