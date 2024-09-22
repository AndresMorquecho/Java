package clearminds.cuentas;

public class Cuenta {
	
	private String id;
	private String Tipo;
	private Double Saldo;
	
	//Tipo = "T";
	
	public String getId() {
		return id;
	}


	
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	
	
	public Double getSaldo() {
		return Saldo;
	}
	public void setSaldo(Double saldo) {
		Saldo = saldo;
	}
	
	
	public Cuenta(String id){
		this.id = id;
		this.Tipo = "A";
		
	}
	
	public Cuenta(String id, String tipo, Double Saldo) {
			
		this.id = id;
		this.Tipo = tipo;
		this.Saldo = Saldo;
		
		
	}
	
	
	public void ImprimirCuentas (){
		
		System.out.println("****************");
		System.out.println("     CUENTA     ");
		System.out.println("****************");
		
		System.out.println("Numero de Cuenta: " + id);
		System.out.println("Tipo: " + Tipo);
		System.out.println("Saldo: USD" + Saldo);
		
		System.out.println("****************");
		
	}
	
	
	public void imprimirConMiEstilo () {
		
		System.out.println("*****CUENTA*****");
		System.out.println("Numero de Cuenta: " + id + "Tipo: " + Tipo + " Saldo: " + Saldo);

	}
	
	
}
