package entidades;

public class Numero {
	
	private String numeroCarta;
	private int valor;
	
	
	
	
	public  void mostrar() {
		System.out.println(numeroCarta + "-" + valor);
	}
	
	
	
	
	public Numero(String numeroCarta, int valor) {
		this.numeroCarta = numeroCarta;
		this.valor = valor;
	}




	public String getNumeroCarta() {
		return numeroCarta;
	}
	public void setNumeroCarta(String numeroCarta) {
		this.numeroCarta = numeroCarta;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
	
	
}
