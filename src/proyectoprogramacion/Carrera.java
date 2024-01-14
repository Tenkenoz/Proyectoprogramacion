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
public class Carrera {
    private List<Ciclista> ciclistas;
    private CGeneral c_general;
    private CEtapa c_etapa;
    private CSprints c_sprint;
    private CMontaña c_mont;
    public Carrera(){
        ciclistas=new ArrayList<Ciclista>();
        c_general=new CGeneral();
        c_etapa=new CEtapa();
        c_sprint=new CSprints();
        c_mont=new CMontaña();
    }
    public void registrarCiclista(int dorsal,String nombre, String pais, Equipo equipo){
        Ciclista corredor=new Ciclista(dorsal,nombre,pais,equipo);
        ciclistas.add(corredor);
        c_general.agregarCiclista(corredor);
        c_sprint.agregarCiclista(corredor);
        c_mont.agregarCiclista(corredor);
        c_etapa.agregarCiclista(corredor);
    }
    public void tiempoGEtapa(int dorsal, int hr,int min,int seg){
        Iterator it=ciclistas.iterator();
        Ciclista aux=new Ciclista();
        int tiempo_e=(hr*3600)+(min*60)+seg;
        while(it.hasNext())
        {
            aux=(Ciclista)it.next();
            if(aux.getDorsal()==dorsal)
            {
                aux.setTiempo_e(tiempo_e);
                aux.sumarTiempoGeneral(tiempo_e);
                c_etapa.setLider(aux);
            }
        }
    }
    public void difGEtapa(int dorsal, int hr,int min,int seg)
    {
        Iterator it=ciclistas.iterator();
        Ciclista aux=new Ciclista();
        Ciclista lider=c_etapa.getLider();
        int tiempo_e=0;
        int t_lider=lider.getTiempo_e();
        tiempo_e=(hr*3600)+(min*60)+seg+t_lider;
        while(it.hasNext())
        {
            aux=(Ciclista)it.next();
            if(aux.getDorsal()==dorsal)
            {
                aux.setTiempo_e(tiempo_e);
                aux.sumarTiempoGeneral(tiempo_e);
            }
        }
    }
    public void registrarPuntosSprint(int dorsal_prim, int dorsal_seg,int dorsal_ter)
    {
        Iterator it1=ciclistas.iterator();
        Ciclista aux=new Ciclista();
        while(it1.hasNext())
        {
            aux=(Ciclista)it1.next();
            if(aux.getDorsal()==dorsal_prim)
            {
                aux.sumarPuntosSprint(25);
            }
            else if(aux.getDorsal()==dorsal_seg)
            {
                aux.sumarPuntosSprint(15);
            }
            else if(aux.getDorsal()==dorsal_ter)
            {
                aux.sumarPuntosSprint(10);
            }
        }
    }
    public void registrarPuntosMontaña(int dorsal_prim, int dorsal_seg,int dorsal_ter)
    {
        Iterator it1=ciclistas.iterator();
        Ciclista aux=new Ciclista();
        while(it1.hasNext())
        {
            aux=(Ciclista)it1.next();
            if(aux.getDorsal()==dorsal_prim)
            {
                aux.sumarPuntosMontaña(10);
            }
            else if(aux.getDorsal()==dorsal_seg)
            {
                aux.sumarPuntosMontaña(8);
            }
            else if(aux.getDorsal()==dorsal_ter)
            {
                aux.sumarPuntosMontaña(5);
            }
        }
    }
    public int numeroCorredores(){
        return ciclistas.size();
    }
    public void mostrarResultadosEtapa()
    {
        System.out.println("Clasificacion de la etapa");
        Ciclista lider_e=c_etapa.definirLider();
        c_etapa.mostrarClasificacion();
        System.out.println("Clasificacion general provisional");
        c_general.mostrarClasificacion();
        System.out.println("Clasificacion de sprint provisional");
        c_sprint.mostrarClasificacion();
        System.out.println("Clasificacion de montaña provisional");
        c_mont.mostrarClasificacion();
    }
    public void nuevaEtapa()
    {
        c_etapa.resetearEtapa();
    }
    public void agregaraEtapa(Ciclista corredor)
    {
        c_etapa.agregarCiclista(corredor);
    }
    public void datosCiclista(int dorsal)
    {
        Iterator it=ciclistas.iterator();
        Ciclista aux=new Ciclista();
        while(it.hasNext())
        {
            aux=(Ciclista)it.next();
            if(aux.getDorsal()==dorsal)
            {
                System.out.println(aux.toString());
                System.out.println("Tiempo etapa: "+aux.getTiempo_e());
                System.out.println("Tiempo general: "+aux.getTiempo_g());
            }
        }
    }
}
