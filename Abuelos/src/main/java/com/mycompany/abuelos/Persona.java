/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familia;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author navi
 */
public class Persona {
    private Integer cedula;
    private String nombre;
    private String apellido;
    private Map<Integer, Persona> mapaPersona = new HashMap<Integer, Persona>();
    
    public Persona(Integer cedula, String nombre, String apellido){
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * @return the cedula
     */
    public Integer getCedula() {
        return cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @return the mapaPersona
     */
    public Map<Integer, Persona> getMapaPersona() {
        return mapaPersona;
    }
    
    
    
}
