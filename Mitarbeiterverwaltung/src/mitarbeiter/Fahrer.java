package mitarbeiter;

import helper.GPSPosition;
import model.KFZ;

public class Fahrer extends SchichtArbeiter{
	private char fuehrerscheinklasse;
	private GPSPosition aktuellePosition;
	private KFZ fahrzeug;
	
	public Fahrer(int id, String name, double stundenSatz, char fuehrerscheinklasse) {
		super(id, name, stundenSatz);
		this.setFuehrerscheinklasse(fuehrerscheinklasse);
	}

	public char getFuehrerscheinklasse() {
		return fuehrerscheinklasse;
	}

	public void setFuehrerscheinklasse(char fuehrerscheinklasse) {
		this.fuehrerscheinklasse = fuehrerscheinklasse;
	}

	public GPSPosition getAktuellePosition() {
		return aktuellePosition;
	}

	public void setAktuellePosition(GPSPosition aktuellePosition) {
		this.aktuellePosition = aktuellePosition;
	}
	
	public void fahre(GPSPosition position, KFZ fahrzeug) {
		this.setFahrzeug(fahrzeug);
	}

	public KFZ getFahrzeug() {
		return fahrzeug;
	}

	public void setFahrzeug(KFZ fahrzeug) {
		this.fahrzeug = fahrzeug;
	}
}
