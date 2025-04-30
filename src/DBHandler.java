import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHandler {
    private static final String URL = "jdbc:sqlite:git_commands.db";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}
