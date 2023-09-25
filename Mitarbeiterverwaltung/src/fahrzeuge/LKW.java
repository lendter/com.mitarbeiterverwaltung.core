package fahrzeuge;

import model.KFZ;

public class LKW extends KFZ{
	private double ladeflaeche;
	private double ladung;
	
	protected LKW(double tankGroesse, int maxSpeed, double ladeflaeche) {
		super(tankGroesse, maxSpeed);
		this.setLadeflaeche(ladeflaeche);
	}

	public double getLadeflaeche() {
		return ladeflaeche;
	}

	private void setLadeflaeche(double ladeflaeche) {
		this.ladeflaeche = ladeflaeche;
	}

	public double getLadung() {
		return ladung;
	}

	private void setLadung(double ladung) {
		this.ladung = ladung;
	}
	
	public void entladen() {
		setLadung(0);
	}
	
	public boolean beladen(double ladung) {
		if(this.getLadung() + ladung < this.ladeflaeche) {
			this.setLadung(this.getLadung() + ladung);
			return true;
		}
		return false;
	}
	
	public double getAuslastung() {
		return this.getLadung() / this.getLadeflaeche();
	}

}
