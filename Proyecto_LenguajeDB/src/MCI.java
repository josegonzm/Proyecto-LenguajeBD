
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author renan
 */
public class MCI {
      public  void mostrarVistaCitas(Connection connection) throws SQLException {
        String query = "SELECT * FROM v_CITAS"; // Consulta para la vista v_clientes

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            StringBuilder vistaData = new StringBuilder();
            while (resultSet.next()) {
                
                  String idCita = resultSet.getString("ID_CITA"); 
                vistaData.append("La ID de la cita es: ").append(idCita).append("\n");
               String m = resultSet.getString("MONTOXCOBRAR"); 
               vistaData.append("El monto es de: ").append(m).append("₡").append("\n");
                String c = resultSet.getString("ID_CITA"); 
                vistaData.append("El codigo del doctor que atendera es: ").append(c).append("\n");
                String n = resultSet.getString("ID_CLIENTE"); 
                vistaData.append("Cuyo numero de id de cliente es: ").append(n).append("\n");
                String f = resultSet.getString("FECHA"); 
                vistaData.append("Fecha: ").append(f).append("\n");
                 String h = resultSet.getString("HORA"); 
                vistaData.append("Hora: ").append(h).append("\n");
                // Aquí obtienes los datos de cada columna y los agregas al StringBuilder
                // Puedes usar resultSet.getString("nombre_columna") para obtener los valores
                // y agregarlos a vistaData
            }

            if (vistaData.length() == 0) {
                JOptionPane.showMessageDialog(null, "La vista de clientes no contiene datos.");
            } else {
                JOptionPane.showMessageDialog(null, "Datos de la vista de clientes:\n" + vistaData.toString());
            }
        }
    }

    
}
