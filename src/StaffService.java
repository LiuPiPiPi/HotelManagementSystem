import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StaffService {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3307/hotelms?useSSL=false&serverTimezone=UTC";

    static final String USER = "test";
    static final String PASS = "1234";

    static Connection conn = null;
    static Statement stmt = null;

    public static boolean staffExists(String staffUsername) {
        boolean status = false;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM staff WHERE staff_username=\'" + staffUsername + "\'";
            ResultSet rs = stmt.executeQuery(sql);

            status = rs.next();

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    public static Staff findByUsername(String staffUsername) {
        Staff staff = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM staff WHERE staff_username=\'" + staffUsername + "\'";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int staff_id = rs.getInt("staff_id");
                String staff_username = rs.getString("staff_username");
                String staff_password = rs.getString("staff_password");
                String staff_phone = rs.getString("staff_phone");

                staff = new Staff(staff_id, staff_username, staff_password, staff_phone);
            }
            // close in the end
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            // deal Class.forName error
            e.printStackTrace();
        }
        return staff;
    }

    // TODO
    public boolean checkRoomStatus(Room room) {
        return true;
    }
}
