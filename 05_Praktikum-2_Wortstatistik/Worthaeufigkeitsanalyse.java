import java.util.*;

/**
 * Zaehlt die Anzahl Vorkommnisse von Woertern ueber mehrere Zeichenketten.
 * Es lassen sich eine beliebige Anzahl an Zeichenketten uebergeben. Die
 * Statistik wird fortlaufend gefuehrt. Die Wortzaehlung laesst sich jederzeit
 * ausgeben. Die Satzeichen . , ? ! " : ; werden entfernt. Alle Buchstaben
 * werden in Kleinbuchstaben umgewandelt um beispielsweise das Wort 'die'
 * inmitten eines Satzes und das Wort 'Die' am Anfang eines Satzes als gleiches
 * Wort werten zu koennen.
 *
 * @version 1.0
 * @author XXXX
 */
public class Worthaeufigkeitsanalyse {
  // Anstelle der Map dürfen Sie auch andere Datentypen verwenden. Testen Sie auch TreeMap.
  private Map<String, Integer> woerterHaeufigkeit = new HashMap<>();
  private Map<String, Integer> buchstabenHaeufigkeit = new HashMap<>();

  /**
   * Nimmt die uebergebene Zeichenkette in die Worthaeufigkeitsanalyse auf.
   *
   * @param text zu verarbeitende Zeichenkette
   */
  public void verarbeiteText(String text) {
    // Ihre Implementation
    text = text.toLowerCase();
    text = text.replaceAll("\\p{Punct}", "");
    text = text.replaceAll("\"", "");
    text = text.replaceAll("\'", "");
    text = text.replaceAll("„", "");
    String[] woerter = text.split(" ");
    String[] buchstaben = text.split("");

    for (String buchstabe : buchstaben) {
      if(buchstabe.equals(" ")){
      } else{
        if(buchstabenHaeufigkeit.containsKey(buchstabe)){
          int y = buchstabenHaeufigkeit.get(buchstabe);
          buchstabenHaeufigkeit.put(buchstabe, y + 1);
        } else {
          buchstabenHaeufigkeit.put(buchstabe, 1);
        }
      }
    }

    for (String wort: woerter) {
      if(woerterHaeufigkeit.containsKey(wort)){
        int x = woerterHaeufigkeit.get(wort);
        woerterHaeufigkeit.put(wort, x + 1);
      } else {
        woerterHaeufigkeit.put(wort, 1);
      }
    }
  }

  private void printStats(){
    for (String key : woerterHaeufigkeit.keySet()) {
      System.out.println(key+ " : " + woerterHaeufigkeit.get(key));
    }
  }

  /**
   * Ausgabe der Worthaeufigkeitsanalyse auf der Konsole.
   */
  public void druckeStatistik() {
    for (Map.Entry<String, Integer> wortHaeufigkeit : woerterHaeufigkeit.entrySet()) {
      System.out.printf("%3d %-40s%n", wortHaeufigkeit.getValue(), wortHaeufigkeit.getKey());
    }
    System.out.println();

    for (Map.Entry<String, Integer> buchstabenHaeufigkeit : buchstabenHaeufigkeit.entrySet()) {
      System.out.printf("%3d %-40s%n", buchstabenHaeufigkeit.getValue(), buchstabenHaeufigkeit.getKey());
    }
  }

  public static void main(String[] args) {
    Worthaeufigkeitsanalyse hauefigkeitsanalyse = new Worthaeufigkeitsanalyse();
    hauefigkeitsanalyse.verarbeiteText("Fritz sagt: \"Die Softwareentwicklung ist meine Leidenschaft!\"");
    hauefigkeitsanalyse.verarbeiteText("Hans meint, er teile die Leidenschaft mit Fritz.");
    hauefigkeitsanalyse.verarbeiteText("John fuegt hinzu, dass die Softwareentwicklung nicht nur aus Programmieren bestehe, sondern es sich dabei um einen komplexen Prozess, bestehend aus vielen kleinen Komponenten, handelt.\"");
    hauefigkeitsanalyse.verarbeiteText("Im September 2005 verlängerte Messi seinen Vertrag, erhielt die spanische Staatsbürgerschaft und fiel damit nicht mehr unter die Ausländerregelung.[10] Er wurde nach guten Leistungen wie u. a. in der UEFA Champions League 2005/06 beim 2:0 gegen Werder Bremen zum weltbesten Nachwuchsspieler 2005 ausgezeichnet.[8] In dieser Saison 2005/06 gewann er mit dem FC Barcelona seine zweite Meisterschaft und zum ersten Mal in seiner Karriere die Champions League, kam aber seit Anfang März aufgrund einer beim Spiel gegen FC Chelsea erlittenen Verletzung nicht mehr zum Einsatz und verblieb bei sechs Einsätzen und einem Tor.");
    hauefigkeitsanalyse.printStats();
  }
}