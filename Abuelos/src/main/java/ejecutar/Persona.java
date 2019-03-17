/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutar;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author David
 */
public class Persona {
    
    private Integer cedula;
    private String nombre;
    
    private Map<Integer, Persona> mapa = new HashMap<Integer, Persona>();
    
    public Persona (Integer cedula, String nombre){
        this.cedula = cedula;
        this.nombre = nombre;
    }

    /**
     * @return the cedula
     */
    public Integer getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the mapa
     */
    public Map<Integer, Persona> getMapa() {
        return mapa;
    }

    /**
     * @param mapa the mapa to set
     */
    public void setMapa(Map<Integer, Persona> mapa) {
        this.mapa = mapa;
    }
    
    public void mostrar(){
        System.out.println(nombre);
    }
    
}
