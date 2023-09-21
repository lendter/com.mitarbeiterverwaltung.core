package cli;

import java.util.Scanner;

import mitarbeiter.Manager;
import verwaltung.*;

public class Program {
	public static void main(String[] args) {
		Manager manager = new Manager(5001, "Horst Peter", 10000, 0.1);
		Abteilung abteilung = new Abteilung("Development", manager);
		VerwaltungHandler handler = new VerwaltungHandler(abteilung);
		Scanner scan = new Scanner(System.in);
		menu();
		String userInput = scan.next();
		while (!"Q".equals(userInput)) {
			switch (userInput) {
			case "0":
				System.out.println("[B] Buero-Arbeiter [S] Schichtarbeiter");
				String typ = scan.next();
				if("B".equals(typ)) {
					System.out.println("Name: ");
					String name = scan.next();
					System.out.println("Festgehalt: ");
					String festgehalt = scan.next();
					handler.addBueroMitarbeiter(name, Double.valueOf(festgehalt));
				}else if("S".equals(typ)) {
					System.out.println("Name: ");
					String name = scan.next();
					System.out.println("Stundensatz: ");
					String stundenSatz = scan.next();
					System.out.println("Gearbeitete Stunden: ");
					String stunden = scan.next();
					handler.addSchichtArbeiter(name, Double.valueOf(stundenSatz), Integer.valueOf(stunden));
				}else {
					System.out.println("Typ nicht definiert");
				}
				break;
			case "1":
				System.out.println("Mitarbeiter entfernen:");
				System.out.println("ID:");
				String id = scan.next();
				handler.removeMitarbeiterById(Integer.valueOf(id));
				break;
			case "2":
				System.out.println("Manager wechseln:");
				System.out.println("Name:");
				String name = scan.next();
				System.out.println("Festgehalt:");
				String gehalt = scan.next();
				System.out.println("Bonus:");
				String bonus = scan.next();
				handler.wechselManager(name, Double.valueOf(gehalt), Double.valueOf(bonus));
				break;
			case "3":
				System.out.println("Für welchen Mitarbeiter Stunden eintragen:");
				System.out.println("Name: ");
				String mitarbeiterName = scan.next();
				System.out.println("Wieviele Stunden hat "+ mitarbeiterName + "gearbeitet?");
				System.out.println("Stunden:");
				String stunden = scan.next();
				handler.trageArbeitEin(mitarbeiterName, Integer.valueOf(stunden));
				break;
			case "4":
				System.out.println(handler.getGehaltsListe());
				break;
			}
			menu();
			userInput = scan.next();
		}
		scan.close();
	}
	
	public static void menu() {
		System.out.println("Willkommen in der Verwaltung.\n Bitte wählen Sie eine der folgenden Möglichkeiten aus...");
		System.out.println(
				"[Q] Programm beenden [0] Mitarbeiter hinzufuegen [1] Mitarbeiter entfernen [2] Manager wechseln [3] Arbeitszeiten eintragen [4] Gehaltsliste anzeigen");
	}
}
