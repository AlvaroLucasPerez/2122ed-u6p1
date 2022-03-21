package ed.alvaro;

public class Alumne {
	
	
	public String nom;
	public String cognoms;
	public int any;
	public String cicleFormatiu;
	
	@Override
	public String toString() {
		
		return  "nom = " + nom + System.lineSeparator() +
				"cognoms = " + cognoms + System.lineSeparator() +
				"any = " + any + System.lineSeparator() +
				"cicleFormatiu = " + cicleFormatiu;
				
		
	}

}
