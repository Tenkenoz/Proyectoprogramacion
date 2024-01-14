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
import java.util.Collections;
import java.util.Iterator;
public class CMontaña extends Clasificacion{

    public CMontaña() {
        super();
    }
    public void Ordenar(){
        Collections.sort(ciclistas, new OrdenarPuntosMontaña());
    }
    public void mostrarClasificacion()
    {
        this.Ordenar();
        Iterator it=ciclistas.iterator();
        Ciclista aux=new Ciclista();
        while(it.hasNext())
        {
            aux=(Ciclista)it.next();
            aux.MostrarPuntosM();
        }
    }
}
