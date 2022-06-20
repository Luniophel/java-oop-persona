package jana60;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		Persona[] persona = new Persona[2];
		for (int i = 0; i < 2; i++) {
			
			
			System.out.print("Inserisci i dati della persona numero " + (i+1));
			System.out.print("\nNome: ");
			String tempNome = scan.nextLine();
			System.out.print("Cognome:");
			String tempCognome = scan.nextLine();
			System.out.print("Abita in via: ");
			String tempVia = scan.nextLine();
			System.out.print("Numero: ");
			String tempNumero = scan.nextLine();
			System.out.print("Nella città di: ");
			String tempCitta = scan.nextLine();
			
			Indirizzo indirizzo = new Indirizzo(tempVia, tempNumero, tempCitta);
			persona[i] = new Persona(tempNome, tempCognome, indirizzo);
			
		}
		
		for (int i = 0; i < 2; i++) {
			System.out.println("\nPersona" + (i+1) + "è " + persona[i].getNome() + " " + persona[i].getCognome());
			System.out.println("Abita in via " + persona[i].getIndirizzo().getVia() + " n°" + persona[i].getIndirizzo().getNumero());
			System.out.println("Nella città di " + persona[i].getIndirizzo().getCitta());
		}
		
		scan.close();
	}

}
