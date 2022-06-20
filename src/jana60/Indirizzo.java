package jana60;

public class Indirizzo {
	
	//ATTRIBUTI
	private String via, numero, citta;
	
	//COSTRUTTORI
	Indirizzo(String via, String numero, String citta){
		
		this.via = via;
		this.numero = numero;
		this.citta = citta;
		
	}
	
	//GETTER/SETTER
	public String getVia() {
		
		return via;
		
	}
	public String getNumero() {
		
		return numero;
		
	}
	public String getCitta() {
	
		return citta;
	
	}
	public void setCitta(String citta) {
		
		this.citta = citta;
		
	}

}
