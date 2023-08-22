
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

public class MD {
     public  void mostrarVistaDoctores(Connection connection) throws SQLException {
        String query = "SELECT * FROM V_DOCTORES"; 

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            StringBuilder vistaData = new StringBuilder();
            while (resultSet.next()) {
             String nombre = resultSet.getString("NOMBRE"); // Cambia "NOMBRE" por el nombre de la columna en tu vista
                vistaData.append("Nombre Completo: ").append(nombre).append("");
                 String PrimerApellido = resultSet.getString("PRIMER_APELLIDO"); 
                vistaData.append(" ").append(PrimerApellido).append(" ");
                String SegundoApellido = resultSet.getString("SEGUNDO_APELLIDO"); 
                vistaData.append(" ").append(SegundoApellido).append("\n");
                  String Correo = resultSet.getString("CORREO_ELECTRONICO"); 
                vistaData.append("Correo del Doctor: ").append(Correo).append("\n");
                String Puesto = resultSet.getString("ID_PUESTO"); 
                vistaData.append("Puesto : ").append(Puesto).append("\n");
                String n = resultSet.getString("NUM_CONSULTORIO"); 
                vistaData.append("Numero de Consultorio : ").append(n).append("\n");
                // Aquí obtienes los datos de cada columna y los agregas al StringBuilder
                // Puedes usar resultSet.getString("nombre_columna") para obtener los valores
                // y agregarlos a vistaData
            }

            if (vistaData.length() == 0) {
                JOptionPane.showMessageDialog(null, "La vista de Doctores no contiene datos.");
            } else {
                JOptionPane.showMessageDialog(null, "Datos de la vista de clientes:\n" + vistaData.toString());
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    }

   
    

