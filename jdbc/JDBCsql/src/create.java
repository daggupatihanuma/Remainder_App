import java.sql.Connection;
import java.sql.DriverManager;
public class create {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/teja", "root","QAZwsxEDC123");
        System.out.println("ok connected");
        } catch (Exception e) {
            // TODO: handle exception
        }
       
    }
}
