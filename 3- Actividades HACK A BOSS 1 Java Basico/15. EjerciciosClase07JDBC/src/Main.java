import java.sql.*;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/clinica"; // URL de la base de datos "clinica"
        String usuario = "root"; // Nombre de usuario de la base de datos
        String contraseña = ""; // Contraseña de la base de datos

        //Variables
        // Datos para insertar
        String nombreInsertar = "Carlos Méndez";
        int edadInsertar = 45;
        String diagnosticoInsertar = "Diabetes";


        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            String sql = "SELECT * FROM pacientes"; // Cambia el nombre de la tabla a "pacientes"
            ResultSet resultado = statement.executeQuery(sql);

            // Procesa los resultados
            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                int edad = resultado.getInt("edad");
                String diagnostico = resultado.getString("diagnostico");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad + ", Diagnóstico: " + diagnostico);
            }

            // Inserta un registro en la tabla "pacientes"
            String insertarSQL = "INSERT INTO pacientes (nombre, edad, diagnostico) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = conexion.prepareStatement(insertarSQL);
            preparedStatement.setString(1, nombreInsertar); // Asigna el valor para "nombre"
            preparedStatement.setInt(2, edadInsertar); // Asigna el valor para "edad"
            preparedStatement.setString(3, diagnosticoInsertar); // Asigna el valor para "diagnostico"

            int filasInsertadas = preparedStatement.executeUpdate(); // Ejecuta la inserción
            if (filasInsertadas > 0) {
                System.out.println("Registro insertado correctamente.");
            }

            // Cierra la conexión y recursos
            resultado.close();
            statement.close();
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}