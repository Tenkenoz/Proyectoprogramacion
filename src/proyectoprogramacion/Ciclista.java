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
    private int s_puntos;
    private int m_puntos;
    private int dorsal;

    public Ciclista(String nombre, String pais, Equipo equipo, int s_puntos, int m_puntos, int dorsal) {
        this.nombre = nombre;
        this.pais = pais;
        this.equipo = equipo;
        this.s_puntos = s_puntos;
        this.m_puntos = m_puntos;
        this.dorsal = dorsal;
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

    public int getS_puntos() {
        return s_puntos;
    }

    public void setS_puntos(int s_puntos) {
        this.s_puntos = s_puntos;
    }

    public int getM_puntos() {
        return m_puntos;
    }

    public void setM_puntos(int m_puntos) {
        this.m_puntos = m_puntos;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }


    
    
}
