import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GuestService {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3307/hotelms?useSSL=false&serverTimezone=UTC";

    static final String USER = "test";
    static final String PASS = "1234";

    static Connection conn = null;
    static Statement stmt = null;

    public static Guest findByUsername(String guestUsername) {
        Guest guest = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM guest WHERE guest_username=\'" + guestUsername + "\'";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String username = rs.getString("guest_username");
                String guest_password = rs.getString("guest_password");
                String realName = rs.getString("guest_real_name");
                String passportID = rs.getString("guest_passport_id");
                String phoneNumber = rs.getString("guest_phone");
                String email = rs.getString("guest_email");

                guest = new Guest(username, guest_password, realName,
                        passportID, phoneNumber, email);
            }
            // close in the end
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            // deal Class.forName error
            e.printStackTrace();
        }
        return guest;
    }

    public static boolean isRegistered(String guestUsername) {
        boolean isRegistered = false;

        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM guest WHERE guest_username=\'" + guestUsername + "\'";
            ResultSet rs = stmt.executeQuery(sql);

            isRegistered = rs.next();

            // close in the end
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            // deal Class.forName error
            e.printStackTrace();
        }
        return isRegistered;
    }

    public static void addGuest(String guestUsername, String guestPassword, String guestRealName,
                                String guestPassportID, String guestPhone, String guestEmail) {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql;
            sql = "insert into guest values('" + guestUsername + "', '" + guestPassword +
                    "', '" + guestRealName + "', '" + guestPassportID + "', '" + guestPhone +
                    "', '" + guestEmail + "');";
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void bookRoom() {

    }

    // TODO guest只能查看自己预定期间的某个房间的预定状态
    public boolean checkRoomStatus(Room room) {
        return true;
    }

    public void cancelRoom() {

    }

    // TODO
}
