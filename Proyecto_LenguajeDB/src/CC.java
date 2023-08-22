
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author renan
 */
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;


public class CC {
    public void agregarCita(Connection connection) {
        String spQuery = "{call sp_agregarCitas(?, ?, ?, ?, ?, ?)}";

        try {
            String idCita = JOptionPane.showInputDialog("Ingrese ID de Cita:");
            String monto = JOptionPane.showInputDialog("Ingrese Monto por Cobrar:");
            String codDoctor = JOptionPane.showInputDialog("Ingrese Código de Doctor:");
            String idCliente = JOptionPane.showInputDialog("Ingrese ID de Cliente:");
            String fecha = JOptionPane.showInputDialog("Ingrese Fecha (DD/MM/AA):");
            String hora = JOptionPane.showInputDialog("Ingrese Hora (HH:MI AM/PM):");

            PreparedStatement preparedStatement = connection.prepareStatement(spQuery);
            preparedStatement.setString(1, idCita);
            preparedStatement.setString(2, monto);
            preparedStatement.setString(3, codDoctor);
            preparedStatement.setString(4, idCliente);
            preparedStatement.setString(5, fecha);
            preparedStatement.setString(6, hora);

            preparedStatement.execute();

            JOptionPane.showMessageDialog(null, "Cita agregada exitosamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Cita Agregada\n" );
        }
    }

    
    
}

   



