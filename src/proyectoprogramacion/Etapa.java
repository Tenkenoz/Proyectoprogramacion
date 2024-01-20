/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Etapa {
    private double longitud;
    private Ciclista ganador;
    private List<Ciclista> listaCiclistas;

    public Etapa(double longitud) {
        this.longitud = longitud;
        this.listaCiclistas = new ArrayList<>();
    }

    public void agregarCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista);
    }

    public void definirGanador() {
        if (listaCiclistas == null || listaCiclistas.isEmpty()) {
            System.out.println("No hay ciclistas en la etapa.");
           
        }

        Collections.sort(listaCiclistas, Comparator.comparingInt(Ciclista::getPuntos_s));
        //Explicacion o como funciona :V
        //collections.sort ayuda a ordenar una lista de forma personalizada en este caso tenemos que tener dos argumentos la lista que va a ser ordenada
        // y el otro argumento la manera que va a ser ordenada para el segundo alrgumento lo que hice fue llamadar a otro metodo dentro de la clase
        //comparator endonde este metodo estatico nos sirve para compararar elementos segun un valor entero en este caso sera el tiempo :V si quieres ahi mejorale

        ganador = listaCiclistas.get(0);

        System.out.println("El ganador de la etapa es: " + ganador.getNombre() +
                " del equipo " + ganador.getEquipo() +
                " con un tiempo de " + ganador.getPuntos_s() + " minutos");
    }

    public void mostrarResultados() {
        System.out.println("Resultados del Tour de Francia (ordenados por tiempo ascendente):");

        Collections.sort(listaCiclistas, Comparator.comparingInt(Ciclista::getPuntos_s));

        int tiempoGanador = listaCiclistas.get(0).getPuntos_s();

        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista ciclista = listaCiclistas.get(i);
            int segundosFaltantes = ciclista.getPuntos_s() - tiempoGanador;

            System.out.println(
                    (i + 1) + ". " +
                            "Nombre: " + ciclista.getNombre() +
                            ", Equipo: " + ciclista.getEquipo() +
                            ", Tiempo (s_puntos): " + ciclista.getPuntos_s() +
                            ", Segundos detrás del ganador: " + segundosFaltantes +
                            ", Puntos por Montaña (m_puntos): " + ciclista.getPuntos_m()
            );
        }
    }
}