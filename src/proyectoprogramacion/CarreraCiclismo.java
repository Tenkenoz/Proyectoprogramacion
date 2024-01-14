/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoprogramacion;

/**
 *
 * @author pc
 */
public class CarreraCiclismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Equipo e1= new Equipo("EFE",10);
        Equipo e2= new Equipo("TJV",10);
        Equipo e3= new Equipo("UAE",10);
        Carrera VueltaEcuador=new Carrera();
        Ciclista c1=new Ciclista(1,"Richard Carapaz","Ecuador",e1);
        Ciclista c11=new Ciclista(11, "Rigoberto Uran","Colombia",e1);
        Ciclista c21=new Ciclista(21, "Primoz Roglic", "Eslovenia",e2);
        Ciclista c31=new Ciclista(31, "Tadej Pogacar","Eslovenia",e3);
        VueltaEcuador.registrarCiclista(1,"Richard Carapaz","Ecuador",e1);
        VueltaEcuador.registrarCiclista(11, "Rigoberto Uran","Colombia",e1);
        VueltaEcuador.registrarCiclista(21, "Primoz Roglic", "Eslovenia",e2);
        VueltaEcuador.registrarCiclista(31, "Tadej Pogacar","Eslovenia",e3);
        System.out.println("Etapa 1-Resultados");
        VueltaEcuador.tiempoGEtapa(21, 3, 48, 17);
        VueltaEcuador.difGEtapa(1, 0, 0, 15);
        VueltaEcuador.difGEtapa(11, 0, 0, 10);
        VueltaEcuador.difGEtapa(31, 0, 1, 3);
        VueltaEcuador.registrarPuntosMontaña(11, 1, 21);
        VueltaEcuador.registrarPuntosSprint(21, 1, 31);
        VueltaEcuador.mostrarResultadosEtapa(); 
        System.out.println("Etapa 2-Resultados");
        VueltaEcuador.tiempoGEtapa(1, 4, 13, 37);
        VueltaEcuador.difGEtapa(21, 0, 0, 2);
        VueltaEcuador.difGEtapa(31, 0, 0, 6);
        VueltaEcuador.difGEtapa(11, 0, 0, 11);
        VueltaEcuador.registrarPuntosMontaña(1, 21, 11);
        VueltaEcuador.registrarPuntosSprint(11, 21, 31);
        VueltaEcuador.mostrarResultadosEtapa();
        System.out.println("Etapa 2-Resultados");
        VueltaEcuador.tiempoGEtapa(1, 0, 45, 37);
        VueltaEcuador.difGEtapa(21, 0, 2, 42);
        VueltaEcuador.difGEtapa(31, 0, 0, 6);
        VueltaEcuador.difGEtapa(11, 0, 1, 25);
        VueltaEcuador.mostrarResultadosEtapa();
        VueltaEcuador.datosCiclista(1);
        VueltaEcuador.datosCiclista(31);
    }
    
}
