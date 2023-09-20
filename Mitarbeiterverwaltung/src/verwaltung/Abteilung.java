package verwaltung;

import java.util.ArrayList;
import java.util.List;

public class Abteilung {
	private String name;
	private List<Mitarbeiter> mitarbeiter;
	private Manager leiter;
	
	public Abteilung(String name, Manager leiter) {
		this.name = name;
		this.mitarbeiter = new ArrayList<>();
		this.setLeiter(leiter);
	}
	
	public Abteilung(String name, List<Mitarbeiter> mitarbeiter) {
		this.name = name;
		this.mitarbeiter = mitarbeiter;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addMitarbeiter(Mitarbeiter mitarbeiter) {
		this.mitarbeiter.add(mitarbeiter);
	}
	
	public void removeMitarbeiter(Mitarbeiter mitarbeiter) {
		this.mitarbeiter.remove(mitarbeiter);
	}
	
	public void changeLeiter(Manager leiter) {
		this.setLeiter(leiter);
	}
	
	public String gehaltsListe() {
		double gehalt = 0;
		StringBuilder sb = new StringBuilder();
		for(Mitarbeiter arbeiter : this.mitarbeiter) {
			sb.append(arbeiter.toString() + "\n");
			gehalt += arbeiter.einkommen();
		}
		sb.append(this.leiter.einkommen());
		gehalt += this.leiter.einkommen();
		sb.append("Insgesamt Gehaelter: "+ gehalt);
		System.out.println(sb.toString());
		return sb.toString();
	}

	public Manager getLeiter() {
		return leiter;
	}
	
	public List<Mitarbeiter> getMitarbeiter(){
		return this.mitarbeiter;
	}
	
	public void setLeiter(Manager leiter) {
		this.leiter = leiter;
	}
	
	public Mitarbeiter findById(int id) {
		for(Mitarbeiter arbeiter : this.mitarbeiter) {
			if(arbeiter.getId() == id) {
				return arbeiter;
			}
		}
		return null;
	}
	
	public Mitarbeiter findByName(String name) {
		for(Mitarbeiter arbeiter : this.mitarbeiter) {
			if(arbeiter.getName().equals(name)) {
				return arbeiter;
			}
		}
		return null;
	}
}
