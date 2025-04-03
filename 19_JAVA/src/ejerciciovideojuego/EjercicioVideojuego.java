package ejerciciovideojuego;

import ejerciciovideojuego.logica.VideoJuego;
import java.util.ArrayList;
import java.util.List;

public class EjercicioVideojuego {
    public static void main(String[] args) {
    
        List<VideoJuego> listaVideojuegos = new ArrayList<VideoJuego>();
        
        VideoJuego video1 = new VideoJuego(123,"Halo","Nintendo 64", 4, "Plataforma");
        VideoJuego video2 = new VideoJuego(456,"Resident Evil 5", "PS4",2, "Plataforma");
        VideoJuego video3 = new VideoJuego(789, "GTA", "Nintendo 64", 2,"Shooter");
        VideoJuego video4 = new VideoJuego(111, "Mario Bro","PC", 3, "Plataforma");
        VideoJuego video5 = new VideoJuego(222,"Counter Strike 1.6","PC", 1, "Shooter");
        
        listaVideojuegos.add(video1);
        listaVideojuegos.add(video2);
        listaVideojuegos.add(video3);
        listaVideojuegos.add(video4);
        listaVideojuegos.add(video5);
        // Punto 3 Recorrido
        for(VideoJuego video : listaVideojuegos){
            System.out.println("Título: "+video.getTitulo() 
            +" Consola: "+video.getConsola()
            +" Cantidad de Jugadores: "+video.getCantJugadores());
        }
        System.out.println("----------------------------------------------------------------------------");
        // Punto 4 - Cambio de Nombre y Jugadores
        video1.setTitulo("Halo2");
        video1.setCantJugadores(2);
        video4.setTitulo("Super MarioBro");
        video4.setCantJugadores(2);
        // Punto 5
        for(VideoJuego video : listaVideojuegos){
            if(video.getConsola().equals("Nintendo 64")){
                System.out.println(    video.toString());
                
            }   
        }
        
        
        
    }
    
}
