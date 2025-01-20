import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        JdbcConfig conBBDD = JdbcConfig.getInstance();
        System.out.println(conBBDD);

        try(Connection conn = conBBDD.getConnection();){
            if(conn != null) {
                System.out.println("Se ha establecido la conexión con la Base de datos");
            }
        }catch(Exception e) {
            e.printStackTrace();
        }

        // Accede a las propiedades url, user y pwd del Singleton
        String url = JdbcConfig.getUrl();
        String user = JdbcConfig.getUser();
        String pwd = JdbcConfig.getPwd();

        // Muestra las propiedades en la consola
        System.out.println("URL: " + url);
        System.out.println("Usuario: " + user);
        System.out.println("Contraseña: " + pwd);


        JdbcConfig conBBDD2 = JdbcConfig.getInstance();
        System.out.println(conBBDD2);

    }
}
