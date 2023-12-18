import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Diese Klasse implementiert ein Briefprogramm.
 * 
 * @author tebe
 */
public class Briefprogramm {

  /**
   * main Methode.
   * @param args Es werden keine Kommandozeilenparameter verwendet
   */
	public static void main(String[] args) {

		// Ihr Code fuer das Briefprogramm:
		// Erzeugen Sie Inhalte und Adressen und drucken Sie 
		// einen Brief sowie einen Serienbrief

		List<Brief> listBrief = new ArrayList<>();

		Brief brief = new Brief(new Adresse("Juvan", "Thavalingam", "Rennweg", 4, 8200, "Schaffhausen"),
				new Adresse("Alan", "Kahl", "Herblingerstrasse", 20, 8200, "Schaffhausen"),
				new Inhalt(Calendar.getInstance(), "Ferien", "Herr", "Ich bin in den Ferien!"));

		Brief brief1 = new Brief(new Adresse("Juvan", "Thavalingam", "Rennweg", 4, 8200, "Schaffhausen"),
				new Adresse("Amit", "Suloski", "Herblingerstrasse", 20, 8200, "Schaffhausen"),
				new Inhalt(Calendar.getInstance(), "Ferien", "Herr", "Ich bin in den Ferien!"));

		listBrief.add(brief);
		listBrief.add(brief1);

		StandardBriefdruckStrategie standard = new StandardBriefdruckStrategie();
		FensterBriefdruckStrategie fensterBriefdruckStrategie = new FensterBriefdruckStrategie();
		Briefdrucker briefdrucker = new Briefdrucker(standard);
//		briefdrucker.druckeBrief(brief);
//		briefdrucker.setDruckStrategie(fensterBriefdruckStrategie);
//		briefdrucker.druckeBrief(brief);

		briefdrucker.druckenSerienbrief(listBrief);
		briefdrucker.setDruckStrategie(fensterBriefdruckStrategie);
		briefdrucker.druckenSerienbrief(listBrief);
	}
}