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
import java.util.Collection;
import java.util.Collections;
public class CEtapa extends Clasificacion{

    public CEtapa() {
        super();
    }
    public void Ordenar(){
        Collections.sort(ciclistas, new OrdenarTiemposEtapa());
    }
    public void escogerGanador(Ciclista winner)
    {
        this.setLider(winner);
    }
    public void mostrarClasificacion()
    {
        this.Ordenar();
        int i;
        Ciclista aux=new Ciclista();
        Ciclista ganador=this.definirLider();
        ganador.MostrarGanadorEtapa();
        int tiempo_l=ganador.getTiempo_e();
        for(i=1;i<ciclistas.size();i++)
        {
            aux=ciclistas.get(i);
            aux.DiferenciaEtapa(tiempo_l);
        }
    }
    public void resetearEtapa()
    {
        ciclistas.clear();
    }
}
