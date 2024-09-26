package com.cmc.directorio.entidades;

public class Telefonos {

		private String operadora;
		private String numero;
		private int codigo;
		private boolean tieneWhatAp;
		
		public Telefonos(String operadora, String numero, int codigo) {
			this.operadora = operadora;
			this.numero = numero;
			this.codigo = codigo;
		}

		
		
		public void imprimirInfo() {
			System.out.println("Información del contacto: Operadora: " + operadora + " Numero Celular: " + 
		     numero +  " Codigo: " + codigo + " Tiene WhatsApp: " + tieneWhatAp   );
		}
		
		
		public String getOperadora() {
			return operadora;
		}

		public void setOperadora(String operadora) {
			this.operadora = operadora;
		}

		public String getNumero() {
			return numero;
		}

		public void setNumero(String numero) {
			this.numero = numero;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public boolean isTieneWhatAp() {
			return tieneWhatAp;
		}

		public void setTieneWhatAp(boolean tieneWhatAp) {
			this.tieneWhatAp = tieneWhatAp;
		}
		
		
		
		
		
		
		

	
}
