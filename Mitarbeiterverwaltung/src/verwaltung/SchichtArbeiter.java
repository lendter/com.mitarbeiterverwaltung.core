package verwaltung;

public class SchichtArbeiter extends Mitarbeiter {
	private double stundenSatz;
	private int anzahlStunden;
	
	public SchichtArbeiter(int id, String name, double stundenSatz) {
		super(id, name);
		this.stundenSatz = stundenSatz;
		this.anzahlStunden = 0;
	}
	
	public SchichtArbeiter() {
		super();
	}

	public void setStundenSatz(double stundenSatz) {
		this.stundenSatz = stundenSatz;
	}
	
	@Override
	public double einkommen() {
		return this.stundenSatz * anzahlStunden;
	}
	
	public void setAnzahlStunden(int std) {
		this.anzahlStunden = std;
	}
	
	public void arbeite(int anzahlStunden) {
		this.anzahlStunden += anzahlStunden;
	}

	@Override
	public String toString() {
		return "SchichtArbeiter: "+super.getName()+ " verdient "+ this.einkommen();
	}
}
