import java.util.Arrays;

/**
 * Die Klasse MessApp steuert einen Messablauf, um die Performance des
 * Zufallszahlengenerators zu messen.
 */
public class MessApp {
  private Messkonduktor messkonduktor;
  private int [][]messReihe;

  /**
   * Fuehrt eine Messung durch.
   */
  public void messen() {
    initialisieren();
    analyseDurchfuehren();
    /*System.out.println(messungen.length);
    for (int i = 0; i < messungen.length; i++){
      System.out.println(i + ": " + messungen[i]);
    }*/
    printMessreihe();
    berechneUndDruckeMittelwerteMessreihe();
    //berechneUndDruckeMittelwerteMessung();
  }

  private void initialisieren() {
    //  Objektsammlung und Messkonduktor erzeugen
    this.messkonduktor = new Messkonduktor(400000);
    this.messReihe = new int[10][20];
  }

  private void analyseDurchfuehren() {
    //  Benutzen Sie 'messkonduktor' um die Messungen durchzufuehren und in der Objektsammlung zu speichern.
    messReihe = messkonduktor.messungenDurchfuehren(messReihe);
  }

  private void printMessreihe(){
    System.out.println();
    for (int i = 0; i < messReihe.length; i++){
      for (int j = 0; j < messReihe[i].length; j++){
        System.out.print(messReihe[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }

  private void berechneUndDruckeMittelwerteMessreihe() {
    int[] liste1 = new int[10];
    int[] liste2 = new int[20];

    liste1[0] = 10;
    liste2[0] = 200;
    liste2[1] = 300;
    for (int index = 0; index < 10; index++) {
      System.out.println(liste1[index]);
    }
    for (int index = 0; index < 20; index++) {
      System.out.println(liste2[index]);
    }
    for (int eintrag : liste2) {
      System.out.println(eintrag);
    }
  }
  public static void main(String[] args) {
    MessApp messApp = new MessApp();
    messApp.messen();
  }
}