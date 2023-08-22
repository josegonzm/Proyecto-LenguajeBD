
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author renan
 */
public class DDC {

    private NodoCola inicio;
    private NodoCola fin;

    public DDC() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean vacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void agregar() {
        Doctores d = new Doctores();
        d.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del Doctor"));
        d.setPrimer_Apellido(JOptionPane.showInputDialog("Ingrese el primer Apellido del Doctor"));
        d.setSegundo_Apellido(JOptionPane.showInputDialog("Ingrese el Segundo Apellido del Doctor"));
        d.setCorreo(JOptionPane.showInputDialog("Ingrese el Correo Oficial del Doctor"));
        d.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite el número de cedula de: " + d.getNombre() + " " + d.getPrimer_Apellido() + ":")));

        NodoCola nuevo = new NodoCola();
        nuevo.setPersona(d);
        if (vacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }

    }

    public void quitar(){
        if(!vacia()){
            inicio=inicio.getSiguiente();
            
          double id = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el ID del doctor a eliminar:"));
            JOptionPane.showMessageDialog(null, "USUARIO/DOCTOR CON EL ID:"+id+"\n"+"FUE ELIMINADO!");
        }else{
            JOptionPane.showMessageDialog(null, "No hay ningún Doctor para eliminar a partir de la fecha actual");
        }
    }
    
     public void mostrar(){
         if(!vacia()){
            String s = "";
            NodoCola aux = inicio;
            while(aux!=null){
                s= s+aux.getPersona().getNombre()+" "+aux.getPersona().getPrimer_Apellido()+", cédula "+aux.getPersona().getId();
                aux=aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "Los Doctores recientemente agregados a la base de datos son: \n"+s);
        }else{
            JOptionPane.showMessageDialog(null, "");
        }
      
         
     }
    
     
    public void busca(){
        int buscado = Integer.parseInt(JOptionPane.showInputDialog("Inserte el número de la cédula del Doctor que desea Verificar:"));
        NodoCola aux = inicio;
        boolean existe = false;
        while(existe!=true&&aux!=null){
            if(buscado==aux.getPersona().getId()){
                existe=true;
            }else{
                aux=aux.getSiguiente();
            }
        }
        if(existe==true){
            JOptionPane.showMessageDialog(null, "El Doctor se encuentra en el sistema.");
        }else{
            JOptionPane.showMessageDialog(null, "El Doctor no se encuentra registrado en el Sistema.");
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
}
