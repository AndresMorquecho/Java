package entidades;

import java.util.ArrayList;

public class Naipe {
	
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;
//	private ArrayList<Carta> auxiliar;
	
	public Naipe() {
	
		numerosPosibles = new ArrayList<Numero>();
		cartas = new ArrayList<Carta>();
//		auxiliar = new ArrayList<Carta>();

		
		numerosPosibles.add(new Numero("A",11));
		numerosPosibles.add(new Numero("2",2));
		numerosPosibles.add(new Numero("3",3));
		numerosPosibles.add(new Numero("4",4));
		numerosPosibles.add(new Numero("5",5));
		numerosPosibles.add(new Numero("6",6));
		numerosPosibles.add(new Numero("7",7));
		numerosPosibles.add(new Numero("8",8));
		numerosPosibles.add(new Numero("9",9));
		numerosPosibles.add(new Numero("10",10));
		numerosPosibles.add(new Numero("J",10));
		numerosPosibles.add(new Numero("Q",10));
		numerosPosibles.add(new Numero("K",10));
		
		
		
		for(int i = 0; i < numerosPosibles.size();i++) {
			
			Numero numeroIterado;
			Palos palos = new Palos();
			
			
			numeroIterado = numerosPosibles.get(i);
				Carta carta1 = new Carta(numeroIterado,  palos.getCorazonNegro());
				Carta carta2 = new Carta(numeroIterado,  palos.getCorazonRojo());
				Carta carta3 = new Carta(numeroIterado,  palos.getDiamante());
				Carta carta4 = new Carta(numeroIterado,  palos.getTrebol());
			
			
			cartas.add(carta1);
			cartas.add(carta2);
			cartas.add(carta3);
			cartas.add(carta4);
			
			
		}
		
		
		
	}
	
	
	public ArrayList<Carta> barajar(){
	
	ArrayList<Carta> auxiliar = new ArrayList<Carta>();		
	int posicion;
	Carta cartaIterada;
	
		for(int i = 0; i < 101; i++) {
			posicion = Random.obtenerPosicion();
			cartaIterada = cartas.get(posicion);
			if( cartaIterada.getEstado().equals("N")){
				
				auxiliar.add(cartaIterada);
				cartaIterada.setEstado("C");
			}
		}
		
		
		for(int i = 0; i < cartas.size();i++) {
			cartaIterada = cartas.get(i);
			
			if(cartaIterada.getEstado().equals("N")) {
				auxiliar.add(cartaIterada);
				cartaIterada.setEstado("C");
			}
			
		}
		
		
		
		return auxiliar;
		
		
	}
	
	
	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	
	
	
}
