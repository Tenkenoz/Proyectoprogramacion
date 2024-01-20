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
public class CGeneral extends Clasificacion{

    public CGeneral() {
        super();
    }
    public void Ordenar(){
        Collections.sort(ciclistas, new OrdenarTiemposGeneral());
    }
    public void mostrarClasificacion()
    {
        int i;
        Ciclista aux;
        this.Ordenar();
        Ciclista lider=this.definirLider();
        lider.MostrarLiderGeneral();
        int tiempo_l=lider.getTiempo_g();
        for(i=1;i<ciclistas.size();i++)
        {
            aux=ciclistas.get(i);
            aux.DiferenciaGeneral(tiempo_l);
        }
    }
}
