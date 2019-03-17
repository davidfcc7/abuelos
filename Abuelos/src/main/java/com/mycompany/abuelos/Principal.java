/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familia;
import static com.sun.org.apache.xalan.internal.lib.ExsltDynamic.map;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import static jdk.nashorn.internal.objects.NativeArray.map;
import static jdk.nashorn.internal.objects.NativeDebug.map;

/**
 *
 * @author navi
 */
public class Principal {
    public static BufferedReader entradaDatos = new BufferedReader (new InputStreamReader (System.in));
    Map<Integer, Persona> mapaAbuelos = new HashMap<Integer, Persona>();
    Map<Integer, Persona> mapaPapas = new HashMap<Integer, Persona>();
    Map<Integer, Persona> mapaHijos = new HashMap<Integer, Persona>();
    private String cedula;
    
    
    
    
    
    public Principal() throws IOException{ 
        
        mapaAbuelos.put(1, new Persona(1,"Juan"," "));
        mapaAbuelos.put(2, new Persona(2,"Jose"," "));
        mapaAbuelos.get(1).getMapaPersona().put(3, new Persona(3,"Andres"," "));
        mapaAbuelos.get(1).getMapaPersona().put(4, new Persona(4,"Maria"," "));
        mapaAbuelos.get(1).getMapaPersona().put(5, new Persona(5,"Carlos"," "));
        mapaAbuelos.get(1).getMapaPersona().get(3).getMapaPersona().put(9, new Persona(9,"Juana",""));
        mapaAbuelos.get(1).getMapaPersona().get(3).getMapaPersona().put(10, new Persona(10,"Paola",""));
        mapaAbuelos.get(1).getMapaPersona().get(4).getMapaPersona().put(11, new Persona(11,"Sofia",""));
        mapaAbuelos.get(1).getMapaPersona().get(5).getMapaPersona().put(12, new Persona(12,"Jaime",""));
        
        //Familia 2
        mapaAbuelos.get(2).getMapaPersona().put(6, new Persona(6,"Alabeto"," "));
        mapaAbuelos.get(2).getMapaPersona().put(7, new Persona(7,"Jimmy"," "));
        mapaAbuelos.get(2).getMapaPersona().put(8, new Persona(8,"Jhonny"," "));
        mapaAbuelos.get(2).getMapaPersona().get(6).getMapaPersona().put(13, new Persona(13,"Tatiana",""));
        mapaAbuelos.get(2).getMapaPersona().get(6).getMapaPersona().put(14, new Persona(14,"Fernanda",""));
        mapaAbuelos.get(2).getMapaPersona().get(7).getMapaPersona().put(15, new Persona(15,"Viviana",""));
        mapaAbuelos.get(2).getMapaPersona().get(8).getMapaPersona().put(16, new Persona(16,"Diana",""));
        
        //Menu();
        Boolean existe = false;
        
        
        
        for (Integer key: mapaAbuelos.keySet()) {
            Persona pAbuelo = mapaAbuelos.get(key);
            System.out.println("Nombre: "+pAbuelo.getNombre());
            
            for (Integer key2: pAbuelo.getMapaPersona().keySet()) {
                Persona pPapa = pAbuelo.getMapaPersona().get(key2);
                System.out.println("        Nombre: "+pPapa.getNombre());
                
                for (Integer key3: pPapa.getMapaPersona().keySet()) {
                    Persona pHijo = pPapa.getMapaPersona().get(key3);
                    System.out.println("                Nombre: "+pHijo.getNombre());
                }
            }
        }

        
    }
    
    public void Menu() throws IOException{
    
        System.out.println("Digita la cedula: ");
        cedula = entradaDatos.readLine();
    }

    
   
    
    
}
