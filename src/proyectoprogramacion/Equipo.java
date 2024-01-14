/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramacion;

import java.util.ArrayList;

/**
 *
 * @author PC Master- Paul
 */
public class Equipo {
    private String nombre;
    private int num_registro;
    private ArrayList<Ciclista>corredores= new ArrayList<>();

    public Equipo(String nombre, int num_registro) {
        this.nombre = nombre;
        this.num_registro = num_registro;
    }
    
    public void inscribirCorredor(Ciclista corredor){
        corredores.add(corredor);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_registro() {
        return num_registro;
    }

    public void setNum_registro(int num_registro) {
        this.num_registro = num_registro;
    }

    public ArrayList<Ciclista> getCorredores() {
        return corredores;
    }

    public void setCorredores(ArrayList<Ciclista> corredores) {
        this.corredores = corredores;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Equipo{");
        sb.append("nombre=").append(nombre);
        sb.append(", num_registro=").append(num_registro);
        sb.append(", corredores=").append(corredores);
        sb.append('}');
        return sb.toString();
    }
}
