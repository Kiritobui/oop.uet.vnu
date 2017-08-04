

/**
 *
 * @author Virgo
 */
import java.sql.*;
public class Test{
public static void main (String[] args){
Connection conn = null;
try{
String userName = "root";
String password = "";
String url = "jdbc:mysql://localhost/test";
// String url = "jdbc:mysql://localhost:3306/test";
Class.forName("org.gjt.mm.mysql.Driver");
conn = DriverManager.getConnection(url,userName,password);
System.out.println("Da ket noi csdl");
}
catch (Exception e){
System.err.println ("KHONG KET NOI DUOC");
e.printStackTrace();
}
finally{
if (conn != null){
try{
conn.close ();
System.out.println ("Dong ket noi");
}
catch (Exception e) { /* bo qua loi luc dong csdl */ }
}
}
}
}
