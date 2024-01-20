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
    private ArrayList<Ciclista> ciclistas=new ArrayList<>();
    private ArrayList<Ciclista> ciclistase1=new ArrayList<>();
    private ArrayList<Ciclista> ciclistase2=new ArrayList<>();
    private ArrayList<Ciclista> ciclistase3=new ArrayList<>();
    private CGeneral c_general = new CGeneral();
    private ArrayList<CEtapa> c_etapa=new ArrayList<>();
    private CSprints c_sprint;
    private CMontaña c_mont;
        private CSprints c_sprint1;
    private CMontaña c_mont1;
        private CSprints c_sprint2;
    private CMontaña c_mont2;
        private CSprints c_sprint3;
    private CMontaña c_mont3;
    public Carrera(){
        c_general=new CGeneral();
        c_sprint=new CSprints();
        c_mont=new CMontaña();
        c_sprint1=new CSprints();
        c_mont1=new CMontaña();
        c_sprint2=new CSprints();
        c_mont2=new CMontaña();
        c_sprint3=new CSprints();
        c_mont3=new CMontaña();
    }
    public void registrarCiclista(int dorsal,String nombre, String pais, Equipo equipo){
        Ciclista corredor=new Ciclista(dorsal,nombre,pais,equipo);
        ciclistas.add(corredor);
        c_general.agregarCiclista(corredor);
        c_sprint.agregarCiclista(corredor);
        c_mont.agregarCiclista(corredor);
            
    }
        public void registrarCiclistaE1(int dorsal,String nombre, String pais, Equipo equipo, CEtapa etapa){
            Ciclista corredorc = new Ciclista (dorsal,nombre,pais,equipo);
            etapa.agregarCiclista(corredorc);
            ciclistase1.add(corredorc); 
           c_sprint1.agregarCiclista(corredorc);
        c_mont1.agregarCiclista(corredorc);
    }
                public void registrarCiclistaE2(int dorsal,String nombre, String pais, Equipo equipo, CEtapa etapa){
            Ciclista corredorc = new Ciclista (dorsal,nombre,pais,equipo);
            etapa.agregarCiclista(corredorc);
            ciclistase2.add(corredorc);
                       c_sprint2.agregarCiclista(corredorc);
        c_mont2.agregarCiclista(corredorc);
    }
                        public void registrarCiclistaE3(int dorsal,String nombre, String pais, Equipo equipo, CEtapa etapa){
            Ciclista corredorc = new Ciclista (dorsal,nombre,pais,equipo);
            
            etapa.agregarCiclista(corredorc);
            ciclistase3.add(corredorc);
                       c_sprint3.agregarCiclista(corredorc);
        c_mont3.agregarCiclista(corredorc);
    }
    
    public void tiempoGEtapa1(int dorsal, int hr,int min,int seg,CEtapa a){
        Iterator its=ciclistase1.iterator();
        Ciclista aux=new Ciclista();
        int tiempo_e=(hr*3600)+(min*60)+seg;
        
        while(its.hasNext())
        {
            aux=(Ciclista)its.next();
            if(aux.getDorsal()==dorsal)
            {
                aux.setTiempo_e(tiempo_e);
                a.setLider(aux);
            }
        }
            this.tiempoGEtapa(dorsal, hr, min, seg, a);
    }
        public void tiempoGEtapa2(int dorsal, int hr,int min,int seg,CEtapa a){
        Iterator its=ciclistase2.iterator();
        Ciclista aux=new Ciclista();
        int tiempo_e=(hr*3600)+(min*60)+seg;
        
        while(its.hasNext())
        {
            aux=(Ciclista)its.next();
            if(aux.getDorsal()==dorsal)
            {
                aux.setTiempo_e(tiempo_e);
                a.setLider(aux);
            }
        }
            this.tiempoGEtapa(dorsal, hr, min, seg, a);
    }
            public void tiempoGEtapa3(int dorsal, int hr,int min,int seg,CEtapa a){
        Iterator its=ciclistase3.iterator();
        Ciclista aux=new Ciclista();
        int tiempo_e=(hr*3600)+(min*60)+seg;
        
        while(its.hasNext())
        {
            aux=(Ciclista)its.next();
            if(aux.getDorsal()==dorsal)
            {
                aux.setTiempo_e(tiempo_e);
                a.setLider(aux);
            }
        }
            this.tiempoGEtapa(dorsal, hr, min, seg, a);
    }
    public void tiempoGEtapa(int dorsal, int hr,int min,int seg,CEtapa a){
        Iterator it=ciclistas.iterator();
        Iterator its=ciclistase1.iterator();
        Ciclista aux=new Ciclista();
        int tiempo_e=(hr*3600)+(min*60)+seg;
        
        while(its.hasNext())
        {
            aux=(Ciclista)its.next();
            if(aux.getDorsal()==dorsal)
            {
                aux.setTiempo_e(tiempo_e);
                a.setLider(aux);
            }
        }
        
        while(it.hasNext())
        {
            aux=(Ciclista)it.next();
            if(aux.getDorsal()==dorsal)
            {
                aux.setTiempo_e(tiempo_e);
                aux.sumarTiempoGeneral(tiempo_e);
                a.setLider(aux);
            }
        }
    }
    
        public void difGEtapa1(int dorsal, int hr,int min,int seg,CEtapa a)
    {
        Iterator its=ciclistase1.iterator();
        Ciclista aux=new Ciclista();
        Ciclista lider=a.getLider();
        int tiempo_e=0;
        int t_lider=lider.getTiempo_e();
        tiempo_e=(hr*3600)+(min*60)+seg+t_lider;
        
        while(its.hasNext())
        {
            aux=(Ciclista)its.next();
            if(aux.getDorsal()==dorsal)
            {
                aux.setTiempo_e(tiempo_e);
            }
        }
    this.difGEtapa(dorsal, hr, min, seg, a);
    }
                public void difGEtapa2(int dorsal, int hr,int min,int seg,CEtapa a)
    {
        Iterator its=ciclistase2.iterator();
        Ciclista aux=new Ciclista();
        Ciclista lider=a.getLider();
        int tiempo_e=0;
        int t_lider=lider.getTiempo_e();
        tiempo_e=(hr*3600)+(min*60)+seg+t_lider;
        
        while(its.hasNext())
        {
            aux=(Ciclista)its.next();
            if(aux.getDorsal()==dorsal)
            {
                aux.setTiempo_e(tiempo_e);
            }
        }
    this.difGEtapa(dorsal, hr, min, seg, a);
    }
            public void difGEtapa3(int dorsal, int hr,int min,int seg,CEtapa a)
    {
        Iterator its=ciclistase3.iterator();
        Ciclista aux=new Ciclista();
        Ciclista lider=a.getLider();
        int tiempo_e=0;
        int t_lider=lider.getTiempo_e();
        tiempo_e=(hr*3600)+(min*60)+seg+t_lider;
        
        while(its.hasNext())
        {
            aux=(Ciclista)its.next();
            if(aux.getDorsal()==dorsal)
            {
                aux.setTiempo_e(tiempo_e);
            }
        }
    this.difGEtapa(dorsal, hr, min, seg, a);
    }
    
    public void difGEtapa(int dorsal, int hr,int min,int seg,CEtapa a)
    {
        Iterator it=ciclistas.iterator();
        Iterator its=ciclistase1.iterator();
        Ciclista aux=new Ciclista();
        Ciclista lider=a.getLider();
        int tiempo_e=0;
        int t_lider=lider.getTiempo_e();
        tiempo_e=(hr*3600)+(min*60)+seg+t_lider;
        
        while(its.hasNext())
        {
            aux=(Ciclista)its.next();
            if(aux.getDorsal()==dorsal)
            {
                aux.setTiempo_e(tiempo_e);
            }
        }
        
        
        while(it.hasNext())
        {
            aux=(Ciclista)it.next();
            if(aux.getDorsal()==dorsal)
            {
                aux.setTiempo_e(tiempo_e);
                aux.sumarTiempoGeneral(tiempo_e);
            }
        }
    }            public void registrarPuntosSprint(int dorsal_prim, int dorsal_seg,int dorsal_ter)
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
    
        public void registrarPuntosSprint1(int dorsal_prim, int dorsal_seg,int dorsal_ter)
    {
        Iterator it1=ciclistase1.iterator();
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
        this.registrarPuntosSprint(dorsal_prim, dorsal_seg, dorsal_ter);
    }
        
    
    public void registrarPuntosSprint2(int dorsal_prim, int dorsal_seg,int dorsal_ter)
    {
        Iterator it1=ciclistase2.iterator();
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
                this.registrarPuntosSprint(dorsal_prim, dorsal_seg, dorsal_ter);
    }
    
        public void registrarPuntosSprint3(int dorsal_prim, int dorsal_seg,int dorsal_ter)
    {
        Iterator it1=ciclistase3.iterator();
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
                this.registrarPuntosMontaña(dorsal_prim, dorsal_seg, dorsal_ter);
    }
        public void registrarPuntosMontaña1(int dorsal_prim, int dorsal_seg,int dorsal_ter)
    {
        CMontaña montaña = new CMontaña();
        Iterator it1=ciclistase1.iterator();
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
                this.registrarPuntosMontaña(dorsal_prim, dorsal_seg, dorsal_ter);
    }
        public void registrarPuntosMontaña2(int dorsal_prim, int dorsal_seg,int dorsal_ter)
    {
        CMontaña montaña = new CMontaña();
        Iterator it1=ciclistase2.iterator();
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
                        this.registrarPuntosMontaña(dorsal_prim, dorsal_seg, dorsal_ter);
    }
        public void registrarPuntosMontaña3(int dorsal_prim, int dorsal_seg,int dorsal_ter)
    {
        CMontaña montaña = new CMontaña();
        Iterator it1=ciclistase3.iterator();
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
                        this.registrarPuntosMontaña(dorsal_prim, dorsal_seg, dorsal_ter);
    }
    public void registrarPuntosMontaña(int dorsal_prim, int dorsal_seg,int dorsal_ter)
    {
        CMontaña montaña = new CMontaña();
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
    public void mostrarResultadosEtapa1(CEtapa a)
    {
        System.out.println("Clasificacion de la etapa");
        Ciclista lider_e=a.definirLider();
        a.mostrarClasificacion();
        System.out.println("Clasificacion de sprint provisional");
        c_sprint1.mostrarClasificacion();
        System.out.println("Clasificacion de montaña provisional");
        c_mont1.mostrarClasificacion();
    }
        public void mostrarResultadosEtapa2(CEtapa a)
    {
        System.out.println("Clasificacion de la etapa");
        Ciclista lider_e=a.definirLider();
        a.mostrarClasificacion();
        System.out.println("Clasificacion de sprint provisional");
        c_sprint2.mostrarClasificacion();
        System.out.println("Clasificacion de montaña provisional");
        c_mont2.mostrarClasificacion();
    }
            public void mostrarResultadosEtapa3(CEtapa a)
    {
        System.out.println("Clasificacion de la etapa");
        Ciclista lider_e=a.definirLider();
        a.mostrarClasificacion();
        System.out.println("Clasificacion de sprint provisional");
        c_sprint3.mostrarClasificacion();
        System.out.println("Clasificacion de montaña provisional");
        c_mont3.mostrarClasificacion();
    }
    
    public void mostrarResultado(){
        c_general.mostrarClasificacion();
        System.out.println("Clasificacion de sprint provisional");
        c_sprint.mostrarClasificacion();
        System.out.println("Clasificacion de montaña provisional");
        c_mont.mostrarClasificacion();
    }
    public void agregarEtapa(CEtapa a)
    {
        c_etapa.add(a);
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
