
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
public class MC {
      public  void mostrarVistaClientes(Connection connection) throws SQLException {
        String query = "SELECT * FROM v_clientes"; // Consulta para la vista v_clientes

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            StringBuilder vistaData = new StringBuilder();
            while (resultSet.next()) {
              String nombre = resultSet.getString("NOMBRE"); // Cambia "NOMBRE" por el nombre de la columna en tu vista
                vistaData.append("Nombre Completo: ").append(nombre).append("");
                 String PrimerApellido = resultSet.getString("PRIMER_APELLDIO"); 
                vistaData.append(" ").append(PrimerApellido).append(" ");
                 String SegundoApellido = resultSet.getString("SEGUNDO_APELLIDO"); 
                vistaData.append(" ").append(SegundoApellido).append("\n");
                   String Correo = resultSet.getString("Correo"); 
                vistaData.append("Correo del usuario: ").append(Correo).append("\n");
                  String Telefono = resultSet.getString("TELEFONO"); 
                vistaData.append("Numero de telefono : ").append(Telefono).append("\n");
                
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
