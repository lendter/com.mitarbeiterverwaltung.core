package fahrzeuge;

import java.util.ArrayList;
import java.util.List;

import mitarbeiter.Fahrer;
import model.*;

public class Personentransportfahrzeug extends KFZ {
	private int anzahlSitze;
	private List<Mitarbeiter> passagiere;
	
	protected Personentransportfahrzeug(double tankGroesse, int maxSpeed, int anzahlSitze) {
		super(tankGroesse, maxSpeed);
		this.setAnzahlSitze(anzahlSitze);
		this.setPassagiere(new ArrayList<Mitarbeiter>());
	}

	public int getAnzahlSitze() {
		return anzahlSitze;
	}

	public void setAnzahlSitze(int anzahlSitze) {
		this.anzahlSitze = anzahlSitze;
	}

	public List<Mitarbeiter> getPassagiere() {
		return passagiere;
	}

	public void setPassagiere(List<Mitarbeiter> passagiere) {
		this.passagiere = passagiere;
	}
	
	public void parken() {
		this.passagiere = new ArrayList<Mitarbeiter>();
	}
	
	public double getAuslastung() {
		return passagiere.size() / (double)anzahlSitze;
	}
	
	@Override
	public boolean einsteigen(Fahrer fahrer) {
		boolean eingestiegen = super.einsteigen(fahrer);
		if(eingestiegen) {
			passagiere.add(fahrer);
		}
		return eingestiegen;
	}

}
