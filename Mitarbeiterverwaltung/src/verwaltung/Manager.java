package verwaltung;

public class Manager extends BueroArbeiter{
	private double bonusSatz;
	
	public Manager(int id, String name, double festgehalt, double bonusSatz) {
		super(id, name, festgehalt);
		this.bonusSatz = bonusSatz;
	}
	
	public Manager() {
		super();
	}
	
	public void setBonusSatz(double bonusSatz) {
		this.bonusSatz = bonusSatz;
	}
	
	@Override
	public double einkommen() {
		return super.einkommen() + berechneBonus();
	}
	
	private double berechneBonus() {
		return super.einkommen() * bonusSatz;
	}

	@Override
	public String toString() {
		return "Manager: "+ super.getName() +" verdient " +einkommen();
	}
}
