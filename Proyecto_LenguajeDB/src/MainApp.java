
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;
import java.security.Timestamp;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.CallableStatement;
import javax.swing.JOptionPane;
/*Para que la base de datos funcione hay que instalar los drivers de sql developer y poner los datos de la base de datos ademas de agregar en Libraries el driver*/

public class MainApp {
    
    public static void main(String[] args) throws ClassNotFoundException {
        // Configuración de la base de datos
        // Establecer la conexión a la base de datos
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl2";
        String usuario = "JOSE";
        String contraseña = "12345";
        
        try (Connection connection = DriverManager.getConnection(jdbcUrl, usuario, contraseña)) {
            JOptionPane.showMessageDialog(null, "Conexión exitosa a la base de datos");
            JOptionPane.showMessageDialog(null, "Bienvenido a la Base de datos del hospital");
            // Llamar al método para mostrar clientes
            // mostrarClientes(connection);

        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, usuario, contraseña);
            MC m = new MC();
            MD d = new MD();
            CD x = new CD();
            MCI e= new MCI();
            CC t=new CC();
            while (true) {
                String[] options = {"Mostrar Doctores Registrados", "Mostrar Citas Registradas", "Listado de Clientes ", "Menu Gestion de Doctores", "Agendar Citas", "Salir"};
                int choice = JOptionPane.showOptionDialog(null, "OPCIONES DISPONIBLES:", "MENU DE GESTIONES DE LA DB", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                
                switch (choice) {
                    case 0:
                        d.mostrarVistaDoctores(connection);
                        break;
                    case 1:
                        e.mostrarVistaCitas(connection);
                        break;
                    case 2:
                        m.mostrarVistaClientes(connection);
                        break;
                    case 3:
                        MenuDoctores();
                        break;
                    case 4:
                        t.agregarCita(connection);
                        break;
                    case 5:
                        // Salir del programa
                        connection.close();
                        System.exit(0);
                        break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void MenuDoctores() {
        DDC c = new DDC();
        boolean continuar = true;
        
        while (continuar) {
            String opcionSeleccionada = JOptionPane.showInputDialog(
                    "Menú:\n"
                    + "1. Ingresar Doctor\n"
                    + "2. Eliminar\n"
                    + "3. Mostrar Informacion Actualizada\n"
                    + "4. Buscar Doctor en la base de datos\n"
                    + "5. Salir"
            );
            
            if (opcionSeleccionada == null) {
                // El usuario cerró el cuadro de diálogo
                continuar = false;
            } else {
                int opcion = Integer.parseInt(opcionSeleccionada);
                
                switch (opcion) {
                    case 1:
                        c.agregar();
                        
                        break;
                    case 2:
                        c.quitar();
                        
                        break;
                    case 3:
                        c.mostrar();
                        
                        break;
                    case 4:
                        c.busca();
                        break;
                    case 5:
                        // Salir del programa
                        continuar = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, elige una opción válida.");
                        break;
                }
            }
        }
    }
    
    public static void A() {
        // Lógica para mostrar clientes
        JOptionPane.showMessageDialog(null, "Mostrando clientes...");
    }
    
    public static void B() {
        // Lógica para mostrar doctores
        JOptionPane.showMessageDialog(null, "Mostrando doctores...");
    }
    
    public static void C() {
        // Lógica para mostrar información personalizada
        JOptionPane.showMessageDialog(null, "Mostrando información personalizada...");
    }
    
    public static void MenuCitas() {
        boolean continuar = true;
        
        while (continuar) {
            String opcionSeleccionada = JOptionPane.showInputDialog(
                    "Menú:\n"
                    + "1. Ingresar DoL.LLctor\n"
                    + "2. Mostrar doctores\n"
                    + "3. Mostrar información personalizada\n"
                    + "4. Salir"
            );
            
            if (opcionSeleccionada == null) {
                // El usuario cerró el cuadro de diálogo
                continuar = false;
            } else {
                int opcion = Integer.parseInt(opcionSeleccionada);
                
                switch (opcion) {
                    case 1:
                        
                        
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        ;
                        break;
                    case 4:
                        
                        continuar = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, elige una opción válida.");
                        break;
                }
            }
        }
    }
    
    public static void D() {
        // Lógica para mostrar clientes
        JOptionPane.showMessageDialog(null, "Mostrando clientes...");
    }
    
    public static void E() {
        // Lógica para mostrar doctores
        JOptionPane.showMessageDialog(null, "Mostrando doctores...");
    }
    
    public static void F() {
        // Lógica para mostrar información personalizada
        JOptionPane.showMessageDialog(null, "Mostrando información personalizada...");
    }
}
//PRuebas
/*  private static void mostrarClientes(Connection connection) throws SQLException {
       String query = "SELECT ID_CLIENTE,NOMBRE,PRIMER_APELLDIO,SEGUNDO_APELLIDO,CORREO,TELEFONO FROM Clientes"; // Ajusta la consulta según tu esquema de base de datos

    try (Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(query)) {

        StringBuilder clientesList = new StringBuilder();
        while (resultSet.next()) {
             String id_cliente = resultSet.getString("ID_CLIENTE");
            clientesList.append(id_cliente).append(" ");
            String nombreCliente = resultSet.getString("Nombre");
            clientesList.append(nombreCliente).append(" ");
            String ApellidoCliente = resultSet.getString("PRIMER_APELLDIO");
            clientesList.append(ApellidoCliente).append(" ");
             String SegApellidoCliente = resultSet.getString("SEGUNDO_APELLIDO");
            clientesList.append(SegApellidoCliente).append(" ");
            clientesList.append("").append(" \n");
            String Correo = resultSet.getString("Correo");
            clientesList.append(Correo).append(" ");
             clientesList.append("").append(" \n");
              String Telefono = resultSet.getString("TELEFONO");
            clientesList.append(Telefono).append(" ");
            clientesList.append("").append(" \n");
        }

        if (clientesList.length() == 0) {
            JOptionPane.showMessageDialog(null, "No hay clientes registrados.");
        } else {
            JOptionPane.showMessageDialog(null, "Lista de clientes:\n" + clientesList.toString());
        }
    }
}
 */
