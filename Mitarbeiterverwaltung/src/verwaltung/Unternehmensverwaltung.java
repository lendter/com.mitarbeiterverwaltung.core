package verwaltung;

import java.util.ArrayList;
import java.util.List;

import mitarbeiter.SchichtArbeiter;
import model.*;

public class Unternehmensverwaltung {
	private List<KFZ> fuhrpark;
	private List<Mitarbeiter> personal;
	private List<Abteilung> abteilungen;
	private List<SchichtArbeiter> schichtarbeiter;
	
	public Unternehmensverwaltung() {
		this.setFuhrpark(new ArrayList<KFZ>());
		this.setPersonal(new ArrayList<Mitarbeiter>());
		this.setAbteilungen(new ArrayList<Abteilung>());
		this.schichtarbeiter = new ArrayList<SchichtArbeiter>();
	}
	
	public void arbeitsTag() {
		for(SchichtArbeiter arbeiter: schichtarbeiter) {
			arbeiter.arbeite(8);
		}
	}

	public List<KFZ> getFuhrpark() {
		return fuhrpark;
	}

	public void setFuhrpark(List<KFZ> fuhrpark) {
		this.fuhrpark = fuhrpark;
	}

	public List<Mitarbeiter> getPersonal() {
		return personal;
	}

	public void setPersonal(List<Mitarbeiter> personal) {
		this.personal = personal;
	}

	public List<Abteilung> getAbteilungen() {
		return abteilungen;
	}

	public void setAbteilungen(List<Abteilung> abteilungen) {
		this.abteilungen = abteilungen;
	}
	
}
