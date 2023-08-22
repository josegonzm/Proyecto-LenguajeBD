
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author renan
 */
public class Doctores {
    public int Id_doctor;
    public String Nombre;
    public String Primer_Apellido;
    public String Segundo_Apellido;
    public String Correo;
    public int id;
    public int Fecha;
    public int salario;
    public String Puesto;

    public Doctores() {
    }

    public Doctores(int Id_doctor, String Nombre, String Primer_Apellido, String Segundo_Apellido, String Correo, int id, int Fecha, int salario, String Puesto) {
        this.Id_doctor = 0;
        this.Nombre = "";
        this.Primer_Apellido = "";
        this.Segundo_Apellido = "";
        this.Correo = "";
        this.id = 0;
        this.Fecha =0;
        this.salario = 0;
        this.Puesto = "";
    }

    public int getId_doctor() {
        return Id_doctor;
    }

    public void setId_doctor(int Id_doctor) {
        this.Id_doctor = Id_doctor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPrimer_Apellido() {
        return Primer_Apellido;
    }

    public void setPrimer_Apellido(String Primer_Apellido) {
        this.Primer_Apellido = Primer_Apellido;
    }

    public String getSegundo_Apellido() {
        return Segundo_Apellido;
    }

    public void setSegundo_Apellido(String Segundo_Apellido) {
        this.Segundo_Apellido = Segundo_Apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFecha() {
        return Fecha;
    }

    public void setFecha(int Fecha) {
        this.Fecha = Fecha;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }
    
  

    
    
    
  
    
    
    
    
    
    
    
}
