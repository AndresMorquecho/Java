package servicios;

import java.util.ArrayList;

import entidades.Carta;
import entidades.Naipe;

public class Juego {
    private Naipe naipe;
    private ArrayList<ArrayList<Carta>> cartasJugadores;
    private ArrayList<Carta> naipeBarajado;


    public Juego(ArrayList<String> jugadores) {
        this.naipe = new Naipe();  
        this.cartasJugadores = new ArrayList<>();
        this.naipeBarajado = naipe.barajar();


        for (int i = 0; i < jugadores.size(); i++) {
            cartasJugadores.add(new ArrayList<Carta>());
        }

        
    }


    public void entregarCartas(int cartasPorJugador) {
        int contador = 0;
        for (int i = 0; i < cartasPorJugador; i++) {
            for (int j = 0; j < cartasJugadores.size(); j++) {
                Carta carta = naipeBarajado.get(contador);
                cartasJugadores.get(j).add(carta);
                contador++;
            }
        }
    }

   public int devolverTotal(int idJugador) {
       int total = 0;
        for (Carta carta : cartasJugadores.get(idJugador)) {
            total += carta.getNumero().getValor();  
       
    }
        return total;  
   }

    public String determinarGanador() {
        int maxPuntos = 0;
        int ganador = 0;


        for (int i = 0; i < cartasJugadores.size(); i++) {
            int totalJugador = devolverTotal(i);
            if (totalJugador > maxPuntos) {
                maxPuntos = totalJugador;
                ganador = i;
            }
        }
        return "jugador " + (ganador + 1);
    }
}


	



