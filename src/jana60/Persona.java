package jana60;

public class Persona {
	
	//ATTRIBUTI
	private String nome, cognome;
	private Indirizzo indirizzo;
	
	
	//COSTRUTTORI
	public Persona(String nome, String cognome, Indirizzo indirizzo){
		
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = new Indirizzo(indirizzo.getVia(), indirizzo.getNumero(), indirizzo.getCitta());
		
	}

}
