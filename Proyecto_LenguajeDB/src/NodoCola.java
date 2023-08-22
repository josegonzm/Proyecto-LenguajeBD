/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author renan
 */
public class NodoCola {
     private Doctores persona;
    private NodoCola siguiente;
    
    public NodoCola(){
        this.siguiente=null;
    }

    /**
     * @return the persona
     */
    public Doctores getPersona() {
        return persona;
    }

    /**
     * @param persona the persona to set
     */
    public void setPersona(Doctores persona) {
        this.persona = persona;
    }

    /**
     * @return the siguiente
     */
    public NodoCola getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }
    
    
}

    

