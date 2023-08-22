
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.CallableStatement;
import javax.swing.JOptionPane;

//CRUD DOCTORES
public class CD {


        public Connection connection;

        public void MostrarPaqueteEnInterfaz() {
            try {
                // Establecer la conexión a la base de datos
                connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##reh", "1234");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public void cerrarConexion() {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public void agregarDoctor() {
            try {
                CallableStatement addDoctorStatement = connection.prepareCall("{call Doctores_Package.addDoctor(?,?,?,?,?,?,?,?,?,?,?)}");
                // Configurar los parámetros necesarios para el procedimiento
                addDoctorStatement.setInt(1, 123);
                // Configurar los demás parámetros...
                addDoctorStatement.executeUpdate();
                addDoctorStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public void listarDoctor(int codDoctor) {
            try {
                CallableStatement listDoctorStatement = connection.prepareCall("{call Doctores_Package.listDoctor(?)}");
                listDoctorStatement.setInt(1, codDoctor);
                listDoctorStatement.execute();
                // Leer resultados y mostrar con JOptionPane
                // ...
                listDoctorStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
