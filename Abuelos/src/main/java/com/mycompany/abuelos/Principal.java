/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.abuelos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David
 */
public class Principal {
    
    Map<Integer, Persona> abuelos = new HashMap<Integer, Persona>();
    
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
    
    Persona abuelo1 = new Persona(1,"Juan");
    Persona abuelo2 = new Persona(2,"Jose");
    
    Persona hijo1 = new Persona(3,"Andres");
    Persona hijo2 = new Persona(4,"Maria");
    Persona hijo3 = new Persona(5,"Carlos");
    Persona hijo4 = new Persona(6,"Alberto");
    Persona hijo5 = new Persona(7,"Jimmy");
    Persona hijo6 = new Persona(8,"Jonny");
    
    Persona nieto1 = new Persona(9,"Pablo");
    Persona nieto2 = new Persona(10,"Paola");
    Persona nieto3 = new Persona(11,"Sofia");
    Persona nieto4 = new Persona(12,"Jaime");
    Persona nieto5 = new Persona(13,"Tatiana");
    Persona nieto6 = new Persona(14,"Fernanda");
    Persona nieto7 = new Persona(15,"Viviana");
    Persona nieto8 = new Persona(116,"Diana");
    
    public Principal(){
        
        agregarAbuelos(abuelo1.getCedula(),abuelo1);
        agregarAbuelos(abuelo2.getCedula(),abuelo2);
        abuelo1.getMapa().put(hijo1.getCedula(), hijo1);
        abuelo1.getMapa().put(hijo2.getCedula(), hijo2);
        abuelo1.getMapa().put(hijo3.getCedula(), hijo3);
        abuelo2.getMapa().put(hijo4.getCedula(), hijo4);
        abuelo2.getMapa().put(hijo5.getCedula(), hijo5);
        abuelo2.getMapa().put(hijo6.getCedula(), hijo6);
        abuelo1.getMapa().get(3).getMapa().put(nieto1.getCedula(), nieto1);
        abuelo1.getMapa().get(3).getMapa().put(nieto2.getCedula(), nieto2);
        abuelo1.getMapa().get(4).getMapa().put(nieto3.getCedula(), nieto3);
        abuelo1.getMapa().get(5).getMapa().put(nieto4.getCedula(), nieto4);
        abuelo2.getMapa().get(6).getMapa().put(nieto5.getCedula(), nieto5);
        abuelo2.getMapa().get(6).getMapa().put(nieto6.getCedula(), nieto6);
        abuelo2.getMapa().get(7).getMapa().put(nieto7.getCedula(), nieto7);
        abuelo2.getMapa().get(8).getMapa().put(nieto8.getCedula(), nieto8);
       
        
    
    
                
    }

    private void agregarAbuelos(Integer cedula, Persona abuelo1) {
        abuelos.put(cedula, abuelo1);
    }
    public void agregarArbol(Integer numHijo, Persona genealogia){
        boolean existe = false;
        if(existe == false)
        for(int i=1;i<=abuelos.size();i++){
            Persona persona = abuelos.get(i);
                for(int j=1;j<=persona.getMapa().size();i++){
                    Persona padreAdd = persona.getMapa().get(j);
                        if((persona.getCedula().equals(numHijo))||(padreAdd.getCedula().equals(numHijo))){
                            persona.getMapa().put(genealogia.getCedula(),genealogia);
                            existe=true;
            }
        }
        /*for(int i=1;i<=abuelos.size();i++){
            Persona persona = abuelos.get(i);
            if(persona.getCedula().equals(numHijo)){
                persona.getMapa().put(genealogia.getCedula(),genealogia);
                existe=true;
            }
        }
        if(existe == false)
            for(int i=1;i<=abuelos.size();i++){
                Persona persona = abuelos.get(i);
                    for(int j=1;j<=persona.getMapa().size();i++){
                        Persona padreAdd = persona.getMapa().get(j);
                            if(padreAdd.getCedula().equals(numHijo)){
                                padreAdd.getMapa().put(genealogia.getCedula(),genealogia);
                                break;
                            }
                    }
     */           }
    }
    public void Buscar(Integer key){
        boolean existe = false;
        existe = abuelos.containsKey(key);
        //-----------------------RECORRER ABUELOS
        if (existe==true){
            Persona persona = abuelos.get(key);
            
            for (Map.Entry<Integer, Persona> entry : persona.getMapa().entrySet()) {
                Integer key1 = entry.getKey();
                Persona value = entry.getValue();
                System.out.println("el hijo de: "+persona.getNombre());
                System.out.println("es:  "+value.getNombre());
                for (Map.Entry<Integer, Persona> entry1 : value.getMapa().entrySet()) {
                    Integer key2 = entry1.getKey();
                    Persona value1 = entry1.getValue();
                    System.out.println("su nieto es: "+value1.getNombre());
                }
                
            }
        }
        //--------------------RECORRER HIJOS
        else if (existe==false){
            for (Map.Entry<Integer, Persona> entry : abuelos.entrySet()) {
                Integer key1 = entry.getKey();
                Persona value = entry.getValue();
                existe=value.getMapa().containsKey(key);
                if(existe==true){
                    System.out.println("su nombre es: " + value.getMapa().get(key).getNombre());
                    System.out.println("su padre es: "+value.getNombre());
                    System.out.println("sus hijos son:");
                    for (Map.Entry<Integer, Persona> entry1 : value.getMapa().get(key).getMapa().entrySet()) {
                    Integer key2 = entry1.getKey();
                    Persona value1 = entry1.getValue();
                    System.out.println(value1.getNombre());
                    }
                }
            }
        }
        //------------RECORRER NIETOS
        if(existe==false){
            for (Map.Entry<Integer, Persona> entry : abuelos.entrySet()) {
                Integer key1 = entry.getKey();
                Persona value = entry.getValue();
                for (Map.Entry<Integer, Persona> entry1 : value.getMapa().entrySet()) {
                    Integer key2 = entry1.getKey();
                    Persona value1 = entry1.getValue();
                    existe=value1.getMapa().containsKey(key);
                    if(existe==true){
                        System.out.println("su nombre es: " + value1.getMapa().get(key).getNombre());
                        System.out.println("su padre es: " + value1.getNombre());
                        System.out.println("su abuelo es: " + value.getNombre());
                    }
                }
                
                
            }
            
        }
        else{
            System.out.println("NO EXISTE LA CEDULA");
        }
        
       
    }
    /**
     *
     */
    public void Menu(){
        
        System.out.println("Ingrese la cedula:  ");
        Integer key=null;
        
        try {
            
            key=Integer.parseInt((entrada.readLine()));; 
            
        } catch (Exception ex) {
            
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Buscar(key);
        
    }
}  
    
    

    

   
    

