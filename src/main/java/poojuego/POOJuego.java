package poojuego;

import capa.logica.VideoJuego;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * POO - 2023-S1 26.06.2023 13.16
 * Ejercicio de Gestión de clases simulando video juegos
 * @author Gabriel Eduardo Morejón López
 */
public class POOJuego {

    public static void main(String[] args) {
        List<VideoJuego> listaVJ = new ArrayList<>();
        
        VideoJuego j1 = new VideoJuego(1, "FIFA24", "PS4", 8, "Deportiva");
        VideoJuego j2 = new VideoJuego(2, "Super Mario Bros", "Switch", 4, "Plataformas");
        VideoJuego j3 = new VideoJuego(3, "Super Maruo Party", "Nintendo Switch", 10, "Plataformas");
        VideoJuego j4 = new VideoJuego(4, "Call of Dutty MW", "PS4", 4, "Shooter");
        VideoJuego j5 = new VideoJuego(5, "Fortnite", "PS4", 12, "Shooter");
        VideoJuego j6 = new VideoJuego(6, "Overcooked", "Nintendo Switch", 8, "Plataformas");
        
        listaVJ.add(j1);
        listaVJ.add(j2);
        listaVJ.add(j3);
        listaVJ.add(j4);
        listaVJ.add(j5);
        listaVJ.add(j6);
        
        for (VideoJuego video: listaVJ) {
            System.out.println("Título: " + video.getNombreJuego() 
                    + " - Consola: " + video.getConsola() 
                    + " - Categoría: " + video.getCategoria() 
                    + " - # Jugadores en juego: " + video.getTotalJugadores());
            
        }       
        
        
        
        System.out.println("Usando un Iterador");
        
        Iterator i = listaVJ.iterator();
        
        while (i.hasNext()) {
            Object elemento = i.next();
            System.out.println(elemento);
        }
        
        // Modificaciones
        j2.setConsola("Nintendo Switch");
        j6.setTotalJugadores(2);
        
        // Solo PS4
        System.out.println("Solo los que son de PS4");
        for (VideoJuego video: listaVJ) {
            if (video.getConsola().equals("PS4")){
                System.out.println(video);
            }
        }
    }
}
