package verwaltung;

import java.util.List;

import mitarbeiter.BueroArbeiter;
import mitarbeiter.Manager;
import mitarbeiter.SchichtArbeiter;
import model.Mitarbeiter;
import verwaltung.*;

public class VerwaltungHandler {
	private Abteilung abteilung;
	private int counterBuero;
	private int counterSchicht;
	private int counterManager;
	
	public VerwaltungHandler(Abteilung abteilung) {
		this.abteilung = abteilung;
		this.counterBuero = 5100;
		this.counterSchicht = 3000;
		this.counterManager = 5001;
	}
	
	public void addBueroMitarbeiter(String name, double festgehalt) {
		this.counterBuero++;
		this.abteilung.addMitarbeiter(new BueroArbeiter(this.counterBuero, name, festgehalt));
		System.out.println("Buero Mitarbeiter: "+ name+ " hinzugefuegt");
	}
	
	public void addBueroMitarbeiter(BueroArbeiter arbeiter) {
		this.counterBuero++;
		arbeiter.setId(counterBuero);
		this.abteilung.addMitarbeiter(arbeiter);
		System.out.println("Buero Mitarbeiter: "+ arbeiter.getName()+ " hinzugefuegt");
	}
	
	public void addSchichtArbeiter(String name, double stundenSatz, int stunden) {
		this.counterSchicht++;
		SchichtArbeiter arbeiter = new SchichtArbeiter(this.counterSchicht, name, stundenSatz);
		arbeiter.setAnzahlStunden(stunden);
		this.abteilung.addMitarbeiter(arbeiter);
		System.out.println("Schicht Mitarbeiter: "+ name+ " hinzugefuegt");
	}
	
	public void addSchichtArbeiter(SchichtArbeiter arbeiter) {
		this.counterSchicht++;
		arbeiter.setId(counterSchicht);
		this.abteilung.addMitarbeiter(arbeiter);
		System.out.println("Schicht Mitarbeiter: "+ arbeiter.getName()+ " hinzugefuegt");
	}
	
	public List<Mitarbeiter> getMitarbeiter(){
		return abteilung.getMitarbeiter();
	}
	
	public void wechselManager(String name, double festgehalt, double bonusSatz) {
		this.counterManager++;
		this.abteilung.changeLeiter(new Manager(this.counterManager, name, festgehalt, bonusSatz));
		System.out.println("Leitung gewechselt: "+ name);
	}
	
	public void wechselManager(Manager manager) {
		this.counterManager++;
		this.abteilung.changeLeiter(manager);
		System.out.println("Leitung gewechselt: "+ manager.getName());
	}
	
	public void removeMitarbeiterById(int id) {  
		String name = this.abteilung.findById(id).getName();
		try {
			this.abteilung.removeMitarbeiter(this.abteilung.findById(id));
		}catch(NullPointerException e) {
			System.out.println("Can't find Mitarbeiter by Id "+ id);
		}
		System.out.println("Mitarbeiter: "+ name+ " gel�scht");
	}
	
	public void trageArbeitEin(String name, int stunden) {
		Mitarbeiter arbeiter = this.abteilung.findByName(name);
		if(arbeiter.getClass().equals(SchichtArbeiter.class)) {
			SchichtArbeiter schichtArbeiter = (SchichtArbeiter)arbeiter;
			schichtArbeiter.arbeite(stunden);
		}else {
			System.out.println(name + " ist kein Schichtarbeiter");
		}
		System.out.println(stunden +" Stunden fuer "+ name+ " eingetragen");
	}
	
	public String getGehaltsListe() {
		return this.abteilung.gehaltsListe();
	}
	
	public Abteilung getAbteilung() {
		return this.abteilung;
	}
	
}
