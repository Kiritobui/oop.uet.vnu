
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Virgo
 */
public class MySqlConnect {
    Connection conn;
    public static Connection ConnectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/question?useUnicode=true&characterEncoding=UTF-8", "root", "");
            JOptionPane.showMessageDialog(null, "Connected to database");
            return conn;
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
