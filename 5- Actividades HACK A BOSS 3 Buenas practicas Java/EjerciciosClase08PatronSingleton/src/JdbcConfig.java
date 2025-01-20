import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConfig {

    private static String url,user,pwd;
    private static Connection conn;
    private static JdbcConfig instance;

    static {
        url = "jdbc:mysql://localhost:3306/bbdd";
        user = "root";
        pwd = null;
    }

    private JdbcConfig() {
        super();
    }

    /*
    Inicializandolos en el constructor

    private JdbcConfig() {
        super();
        url = "jdbc:mysql://localhost:3306/bbdd";
        user = "root";
        pwd = null;
    }
     */

    public static JdbcConfig getInstance() {
        if (instance==null) {
            instance = new JdbcConfig();
        }
        return instance;
    }

    public Connection getConnection() {
        conn = null;
        try {
            conn= DriverManager.getConnection(url, user, pwd);
            System.out.println("CONEXION CORRECTA");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("****NO CONECTADO****");
        }
        return conn;
    }

    public static String getUrl() {
        return url;
    }

    public static String getUser() {
        return user;
    }

    public static String getPwd() {
        return pwd;
    }
}
