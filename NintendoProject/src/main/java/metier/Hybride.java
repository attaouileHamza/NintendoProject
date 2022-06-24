package metier;

import java.time.LocalDate;

public class Hybride extends Console {


	public Hybride(String nom, int prix, LocalDate dateSortie) {
		super(nom, prix, dateSortie);
	}

	@Override
	public String toString() {
		return "Hybride [nom=" + nom + "]";
	}
	

}
