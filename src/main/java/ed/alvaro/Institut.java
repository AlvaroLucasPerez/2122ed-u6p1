package ed.alvaro;

public class Institut {

	private static final int ANY = 2022;
	private static final String CICLE_FORMATIU = "1º DAW";
	private static final String COGNOMS_ALUMNE = "Lucas";
	private static final String NOM_ALUMNE = "Alvaro";

	public static void main(String[] args) {
		
		Alumne p = new Alumne();
		
		p.nom = NOM_ALUMNE;
		p.cognoms = COGNOMS_ALUMNE;
		p.cicleFormatiu = CICLE_FORMATIU;
		p.any = ANY;
		
		System.out.println(p.toString());

	}

}
