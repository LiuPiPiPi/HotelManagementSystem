import java.sql.Connection;
import java.sql.Statement;

public class RoomService {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3307/hotelms?useSSL=false&serverTimezone=UTC";

    static final String USER = "test";
    static final String PASS = "1234";

    static Connection conn = null;
    static Statement stmt = null;
}
