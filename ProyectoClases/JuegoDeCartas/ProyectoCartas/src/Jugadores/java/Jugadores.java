package Jugadores.java;

import java.util.ArrayList;

public class Jugadores {

	private ArrayList<String> listaJugadores;

	public Jugadores() {
		this.listaJugadores = new ArrayList<>();
	}

	public void agregarJugador(String nombreJugador) {
		listaJugadores.add(nombreJugador);
	}

	public void jugar() {

	}

	public ArrayList<String> getListaJugadores() {
		return listaJugadores;
	}

	public void setListaJugadores(ArrayList<String> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}

	public void mostrarJugadores() {
		for (int i = 0; i < listaJugadores.size(); i++) {
			System.out.println("Jugador " + (i + 1) + ": " + listaJugadores.get(i));
		}
	}

}
