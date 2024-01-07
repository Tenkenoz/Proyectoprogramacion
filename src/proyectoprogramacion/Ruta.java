/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramacion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexa
 */
public class Ruta {
    private List<Montaña> metas_alto;
    private List<Sprint> metas_intermedias;
    
    public Ruta() {
        this.metas_alto = new ArrayList<>();
        this.metas_intermedias = new ArrayList<>();
    }

    public void agregarSprint(Sprint sprint) {
        metas_intermedias.add(sprint);
    }

    public void agregarMontana(Montaña montaña) {
        metas_alto.add(montaña);
    }
    
}
