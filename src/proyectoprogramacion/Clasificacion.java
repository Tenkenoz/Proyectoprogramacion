/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramacion;

/**
 *
 * @author rouss
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class Clasificacion {
    protected Ciclista lider;
    protected List<Ciclista> ciclistas;
    
    public Clasificacion(){
        ciclistas=new ArrayList<Ciclista>();
    }
    public Ciclista definirLider(){
        Ciclista lider;
        lider=(Ciclista)ciclistas.get(0);
        return lider;
    }
    public void agregarCiclista(Ciclista corredor)
    {
        ciclistas.add(corredor);
    }

    public Ciclista getLider() {
        return lider;
    }

    public void setLider(Ciclista lider) {
        this.lider = lider;
    }
    
}
