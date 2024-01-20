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
        
        CEtapa etapa1= new CEtapa("Etapa1",1);
        CEtapa etapa2= new CEtapa("Etapa1",2);
        CEtapa etapa3= new CEtapa("Etapa1",3);
        Equipo e1= new Equipo("EFE",10);
        Equipo e2= new Equipo("TJV",10);
        Equipo e3= new Equipo("UAE",10);
        Carrera VueltaEcuador=new Carrera();
        VueltaEcuador.agregarEtapa(etapa1);
        VueltaEcuador.agregarEtapa(etapa2);
        VueltaEcuador.agregarEtapa(etapa3);
        VueltaEcuador.registrarCiclista(1,"Richard Carapaz","Ecuador",e1);
        VueltaEcuador.registrarCiclista(11, "Rigoberto Uran","Colombia",e1);
        VueltaEcuador.registrarCiclista(21, "Primoz Roglic", "Eslovenia",e2);
        VueltaEcuador.registrarCiclista(31, "Tadej Pogacar","Eslovenia",e3);
        
        VueltaEcuador.registrarCiclistaE1(1,"Richard Carapaz","Ecuador",e1, etapa1);
        VueltaEcuador.registrarCiclistaE1(11, "Rigoberto Uran","Colombia",e1, etapa1);
        VueltaEcuador.registrarCiclistaE1(21, "Primoz Roglic", "Eslovenia",e2, etapa1);
        VueltaEcuador.registrarCiclistaE1(31, "Tadej Pogacar","Eslovenia",e3, etapa1);
        
                VueltaEcuador.registrarCiclistaE2(1,"Richard Carapaz","Ecuador",e1, etapa2);
        VueltaEcuador.registrarCiclistaE2(11, "Rigoberto Uran","Colombia",e1, etapa2);
        VueltaEcuador.registrarCiclistaE2(21, "Primoz Roglic", "Eslovenia",e2, etapa2);
        VueltaEcuador.registrarCiclistaE2(31, "Tadej Pogacar","Eslovenia",e3, etapa2);
        
        
                VueltaEcuador.registrarCiclistaE3(1,"Richard Carapaz","Ecuador",e1, etapa3);
        VueltaEcuador.registrarCiclistaE3(11, "Rigoberto Uran","Colombia",e1,etapa3);
        VueltaEcuador.registrarCiclistaE3(21, "Primoz Roglic", "Eslovenia",e2, etapa3);
        VueltaEcuador.registrarCiclistaE3(31, "Tadej Pogacar","Eslovenia",e3,etapa3);
        

        System.out.println("Etapa 1-Resultados");
        VueltaEcuador.tiempoGEtapa1(21, 3, 48, 17,etapa1);
        VueltaEcuador.difGEtapa1(1, 0, 0, 15, etapa1);
        VueltaEcuador.difGEtapa1(11, 0, 0, 10, etapa1);
        VueltaEcuador.difGEtapa1(31, 0, 1, 3, etapa1);
        VueltaEcuador.registrarPuntosMontaña1(11, 1, 21);
        VueltaEcuador.registrarPuntosSprint1(21, 1, 31);
        VueltaEcuador.mostrarResultadosEtapa1(etapa1); 
        System.out.println("Etapa 2-Resultados");
        VueltaEcuador.tiempoGEtapa2(1, 4, 13, 37, etapa2);
        VueltaEcuador.difGEtapa2(21, 0, 0, 2,etapa2);
        VueltaEcuador.difGEtapa2(31, 0, 0, 6, etapa2);
        VueltaEcuador.difGEtapa2(11, 0, 0, 11, etapa2);
        VueltaEcuador.registrarPuntosMontaña2(1, 21, 11);
        VueltaEcuador.registrarPuntosSprint2(11, 21, 31);
        VueltaEcuador.mostrarResultadosEtapa2(etapa1);
        System.out.println("Etapa 2-Resultados");
        VueltaEcuador.tiempoGEtapa3(1, 0, 45, 37, etapa3);
        VueltaEcuador.difGEtapa3(21, 0, 2, 42, etapa3);
        VueltaEcuador.difGEtapa3(31, 0, 0, 6, etapa3);
        VueltaEcuador.difGEtapa3(11, 0, 1, 25,etapa3);
        VueltaEcuador.mostrarResultadosEtapa1(etapa1);
        System.out.println("Resultados GENERAL");
        VueltaEcuador.mostrarResultado();
        VueltaEcuador.datosCiclista(1);
        VueltaEcuador.datosCiclista(31);
        
    }
    
}
