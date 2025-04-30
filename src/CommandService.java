import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CommandService {

    public List<Command> searchCommand(String keyword) {
        List<Command> results = new ArrayList<>();
        String sql = "SELECT * FROM git_commands WHERE command LIKE ? OR description LIKE ?";

        try (Connection conn = DBHandler.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + keyword + "%");
            stmt.setString(2, "%" + keyword + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                results.add(new Command(
                    rs.getString("command"),
                    rs.getString("category"),
                    rs.getString("description"),
                    rs.getString("example")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return results;
    }
}
