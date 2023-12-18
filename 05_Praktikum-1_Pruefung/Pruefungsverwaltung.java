import java.util.ArrayList;
import java.util.List;

/**
 * Bietet Funktionalitaeten zum Speichern von Pruefungsergebnissen von einer
 * Vielzahl von Studenten. Aus den gespeicherten Ergebnissen lassen sich
 * personalisierte Antworttext generieren.
 */
public class Pruefungsverwaltung {
  List<Pruefungsergebnis>pruefung = new ArrayList<>();

  /**
   * Speichert ein Pruefungsergebnis.
   * 
   * @param ergebnis Das Pruefungsergebnis.
   */
  public void speichereErgebnis(Pruefungsergebnis ergebnis) {
    // Implementieren gemaess Aufgabenstellung
    pruefung.add(ergebnis);
  }

  /**
   * Gibt pro gespeichert Ergebnis einen Text auf die Konsole aus.
   * Je nachdem ob der Kandidate die Pruefung bestanden (>= 4.0) oder nicht
   * bestanden (< 4.0) hat, wird ein Text in folgendem Format ausgegeben:
   * <p>
   * Max Muster, Sie haben an der Prüfung die Note 3.0 erzielt und
   * sind somit durchgefallen!
   * <p>
   * Herzliche Gratulation Max Muster! Sie haben an der Prüfung die Note 4.5
   * erzielt und haben somit bestanden!
   */
  public void druckeAntworttexte() {
    // Implementieren gemaess Aufgabenstellung
    for (int i = 0; i < pruefung.size(); i++){
      if(rundeAufHalbeNote(pruefung.get(i).getNote()) < 4.0){
        System.out.println(pruefung.get(i).getStudent() + ", Sie haben an der Pruefung die Note " + rundeAufHalbeNote(pruefung.get(i).getNote()) +
                " erzielt und sind somit durchgefallen!");
      } else {
        System.out.println("Herzliche Gratulation " + pruefung.get(i).getStudent() + "! Sie haben an der Pruefung die Note " +
                rundeAufHalbeNote(pruefung.get(i).getNote()) + " erzielt und haben somit bestanden!");
      }
    }
  }

  public double rundeAufHalbeNote(double note) {
    return Math.round(note * 2) / 2.0;
  }
}
