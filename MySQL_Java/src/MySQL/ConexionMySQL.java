package MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConexionMySQL {

    // Librería de MySQL
    public static String driver = "com.mysql.cj.jdbc.Driver";
    
    // Nombre de la base de datos
    public static String database = "base";

    // Host
    public static  String hostname = "localhost";
    // Puerto
    public static String port = "3306";

    public static String errorZonaHoraria = "&useTimezone=true&serverTimezone=UTC";
    // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
    public static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false" + errorZonaHoraria;

    // Nombre de usuario
    public static String username = "root";

    // Clave de usuario
    public static String password = "1234";

    public static Connection conectarMySQL() {
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

}