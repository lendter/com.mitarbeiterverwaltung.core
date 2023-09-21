package mitarbeiter;

import model.Mitarbeiter;

public class BueroArbeiter extends Mitarbeiter{
	private double festgehalt;
	
	public BueroArbeiter() {
		super();
	}
	
	public BueroArbeiter(int id, String name, double festgehalt) {
		super(id, name);
		this.festgehalt = festgehalt;
	}

	public void setFestgehalt(double festgehalt) {
		this.festgehalt = festgehalt;
	}
	
	@Override
	public double einkommen() {
		return this.festgehalt;
	}

	@Override
	public String toString() {
		return "<BueroArbeiter>"+ super.getName() +" verdient "+ einkommen();
	}

}
