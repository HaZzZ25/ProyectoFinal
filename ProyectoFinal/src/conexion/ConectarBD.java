package conexion;

//liberias de conexion
import java.sql.Connection; //Establecer conexion a DB
import java.sql.DriverManager;  //Enlace de conexion entre BD y Java
import java.sql.Statement;  //Genera sentencias SQL
import java.sql.ResultSet;  //Establece resultado final de datos
import java.sql.SQLException;   //Tratamiento de errores DB
import java.sql.PreparedStatement;  // Usado para preparar consultas con parámetros
import javax.swing.JOptionPane;
/**
 *
 * @author achit
 */
public class ConectarBD {
    
    public Connection cn;
    public Statement stmt;
    public ResultSet rs;
    
    //Metodo para conectar a la base de datos 
    public void conectarBDOracle() throws SQLException{
    
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        
        cn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "videojuegoscr", "uacm123");
        stmt=cn.createStatement();
        JOptionPane.showMessageDialog(null, "Conexion a BD OK\n\nContreras");
    }
    // Método para modificar un usuario en la base de datos
    public void modificarUsuario(int idUsuario, String nuevoUsuario, String nuevaContraseña, String nuevoRol) throws SQLException {
        try {
            // Sentencia SQL para modificar el usuario
            String sql = "UPDATE usuarios SET nombre_usuario = ?, contraseña = ?, rol = ? WHERE id_usuario = ?";
            // Preparar la consulta
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, nuevoUsuario);  // Nuevo nombre de usuario
            ps.setString(2, nuevaContraseña);  // Nueva contraseña
            ps.setString(3, nuevoRol);  // Nuevo rol
            ps.setInt(4, idUsuario);  // ID del usuario a modificar

            // Ejecutar la consulta
            int filasActualizadas = ps.executeUpdate();

            if (filasActualizadas > 0) {
                JOptionPane.showMessageDialog(null, "Usuario modificado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el usuario con ese ID.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar el usuario: " + e.getMessage());
        }
    }
}
