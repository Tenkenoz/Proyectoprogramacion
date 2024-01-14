/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramacion;

/**
 *
 * @author alexa
 */
public class Ciclista {
    private String nombre;
    private String pais;
    private Equipo equipo;
    private int puntos_m;
    private int puntos_s;
    private int dorsal;
    private int tiempo_e;
    private int tiempo_g;

    public Ciclista(int dorsal,String nombre, String pais, Equipo equipo) {
        
        this.dorsal=dorsal;
        this.nombre = nombre;
        this.pais = pais;
        this.equipo=equipo;
        
        tiempo_e=0;
        tiempo_g=0;
        puntos_m=0;
        puntos_s=0;
        equipo.inscribirCorredor(this);
    }
    public Ciclista(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getPuntos_m() {
        return puntos_m;
    }

    public void setPuntos_m(int puntos_m) {
        this.puntos_m = puntos_m;
    }

    public int getPuntos_s() {
        return puntos_s;
    }

    public void setPuntos_s(int puntos_s) {
        this.puntos_s = puntos_s;
    }
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    public void sumarPuntosMontaña(int puntos)
    {
        puntos_m+=puntos;
    }
    public void sumarPuntosSprint(int puntos)
    {
        puntos_s+=puntos;
    }

    public int getTiempo_e() {
        return tiempo_e;
    }

    public void setTiempo_e(int tiempo_e) {
        this.tiempo_e = tiempo_e;
    }

    public int getTiempo_g() {
        return tiempo_g;
    }

    public void setTiempo_g(int tiempo_g) {
        this.tiempo_g = tiempo_g;
    }
    public void sumarTiempoGeneral(int tiempo)
    {
        tiempo_g+=tiempo;
    }
    
    @Override
    public String toString() {
        return nombre+"     "+equipo.getNombre()+"  "+pais;
    }
    public void MostrarPuntosM()
    {
        System.out.println(this.toString()+"   "+puntos_m);
    }
    public void MostrarPuntosS()
    {
        System.out.println(this.toString()+"   "+puntos_s);
    }
    public void MostrarGanadorEtapa()
    {
        int hr,min,seg=0;
        hr=(tiempo_e/3600);
        min=(tiempo_e%3600)/60;
        seg=(tiempo_e%3600)%60;
        System.out.println(this.toString()+"   "+hr+":"+min+":"+seg);
    }
    public void MostrarLiderGeneral()
    {
        int hr,min,seg=0;
        hr=(tiempo_g/3600);
        min=(tiempo_g%3600)/60;
        seg=(tiempo_g%3600)%60;
        System.out.println(this.toString()+"   "+hr+":"+min+":"+seg);
    }
    public void DiferenciaEtapa(int t_ganador)
    {
        int hr,min,seg=0;
        int dif_lider;
        dif_lider=tiempo_e-t_ganador;
        hr=(dif_lider/3600);
        min=(dif_lider%3600)/60;
        seg=(dif_lider%3600)%60;
        if(hr==0)
        {
            System.out.println(this.toString()+"   "+"   "+min+":"+seg);
        }
        else if((hr==0)&&(min==0))
        {
            System.out.println(this.toString()+"   "+"      "+seg);
        }
        else{
            System.out.println(this.toString()+"   "+hr+":"+min+":"+seg);
        }
    }
    public void DiferenciaGeneral(int t_lider)
    {
        int hr,min,seg=0;
        int dif_lider;
        dif_lider=tiempo_g-t_lider;
        hr=(dif_lider/3600);
        min=(dif_lider%3600)/60;
        seg=(dif_lider%3600)%60;
        if(hr==0)
        {
            System.out.println(this.toString()+"   "+"   "+min+":"+seg);
        }
        else if((hr==0)&&(min==0))
        {
            System.out.println(this.toString()+"   "+"      "+seg);
        }
        else{
            System.out.println(this.toString()+"   "+hr+":"+min+":"+seg);
        }
    }
}
